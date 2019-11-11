package com.gnw.Service.UserService;

import com.gnw.Pojo.UserPojo.RoleRight;
import org.springframework.context.annotation.Bean;

import java.util.List;
public interface RoleRightService {
    public List<RoleRight> getAllByRoleId(String id);
}
