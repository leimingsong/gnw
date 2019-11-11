package com.gnw.ShrioController;

import com.gnw.Base.ActiveUser;
import com.gnw.Pojo.UserPojo.Role;
import com.gnw.Pojo.UserPojo.User;
import com.gnw.Service.UserService.Impl.RoleServiceImpl;
import com.gnw.Service.UserService.UserService;
import com.gnw.Util.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 描述：
 *
 * @author caojing
 * @create 2019-01-27-13:57
 */
public class CustomRealm extends AuthorizingRealm {
    @Autowired private UserService userService;
    @Autowired private RoleServiceImpl roleService;

    /**
     * 资源授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("-------资源授权--------");
        ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> stringSet = new HashSet<>();
        //这里给用户配置权限
        stringSet.add(activeUser.getRole());
        System.out.println("当前用户权限:"+activeUser.getRole());
        info.setRoles(stringSet);
        return info;
    }

    /**
     *
     * private UserService userService;
     * <p>
     * 获取即将需要认证的信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("-------身份认证--------");
        String user_account = (String) authenticationToken.getPrincipal();
        Result result=null;
        try {
            result=userService.getUserMsg(user_account);
        }catch (Exception e){
            e.printStackTrace();
        }
        User user=null;
        if(!result.getFalg()){
            System.out.println("用户名不正确或用户不存在!");
            return null;
        }else {
            user = (User) result.getData();
        }
        Role role = new Role();
        try{
            role=roleService.getAllById(user.getRoleId()).get(0);
        }catch (Exception e){
            e.printStackTrace();
        }
        String password = user.getPassword();
        String salt = user.getSalt();
        ActiveUser activeUser = new ActiveUser();
        activeUser.setId(user.getId());
        activeUser.setUser_account(user.getAccount());
        activeUser.setUser_name(user.getNickname());
        activeUser.setRole(role.getRoleName());
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                activeUser,password, ByteSource.Util.bytes(salt),this.getName());
        return simpleAuthenticationInfo;

    }
}
