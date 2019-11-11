package com.gnw.Service.UserService;

import com.gnw.Pojo.UserPojo.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAll();
    public List<Role> getAllById(String id);
}
