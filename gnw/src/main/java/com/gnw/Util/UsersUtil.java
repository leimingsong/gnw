package com.gnw.Util;

import org.apache.shiro.SecurityUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;

public class UsersUtil {
    /**
     * @return :java.lang.String
     * @Author : cjd
     * @Description : 获取登录账号名
     * @params :[]
     * @Date : 10:54 2018/4/19
     */
    public static String getUserName() {
        return (String) SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * @return :java.lang.String
     * @Author : cjd
     * @Description : 获取UUID
     * @params :[]
     * @Date : 10:54 2018/4/19
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * @return : java.lang.String
     * @author : cjd
     * @description : 获取登录账号角色ID 多角色按,分割
     * @date : 15:24 2018/5/8
     */
    public static String getRoleId() {
        return (String) SecurityUtils.getSubject().getSession().getAttribute("roleId");
    }

    /**
     * @return :java.lang.String
     * @Author : cjd
     * @Description : 获取登录账号权限ID 按，分割
     * @Date : 9:23 2018/5/28
     */
    public static String getPermissionId() {
        return (String) SecurityUtils.getSubject().getSession().getAttribute("permissionId");
    }

    public static String getPermissionName() {
        return (String) SecurityUtils.getSubject().getSession().getAttribute("permissionName");
    }

    /**
     * @return : java.lang.String
     * @author : cjd
     * @description : 获取登录账号角色名
     * @date : 13:59 2018/5/10
     */
    public static String getRoleName() {
        return (String) SecurityUtils.getSubject().getSession().getAttribute("roleName");
    }

    /**
     * @return : java.lang.Boolean
     * @author : cjd
     * @description : 判断两字符串按,分割后有无交集
     * @params : [stringOne, stringTwo]
     * @date : 13:59 2018/5/10
     */
    public static Boolean stringContain(String stringOne, String stringTwo) {
        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();

        for (String s : stringOne.split(",")) {
            hashSet1.add(s);
        }
        for (String s : stringTwo.split(",")) {
            hashSet2.add(s);
        }
        Iterator<String> iterator = hashSet2.iterator();
        while (iterator.hasNext()) {
            if (!hashSet1.add(iterator.next())) {
                return true;
            }
        }
        return false;
    }
}
