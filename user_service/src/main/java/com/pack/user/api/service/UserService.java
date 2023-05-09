package com.pack.user.api.service;


import com.pack.user.api.entity.User;

import java.util.List;

public interface UserService {
    public User postUser(User user);

    public List<User> getAllUser();

    public User deleteUser(Integer id);

}
