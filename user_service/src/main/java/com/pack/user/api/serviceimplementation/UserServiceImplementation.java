package com.pack.user.api.serviceimplementation;


import com.pack.user.api.entity.User;
import com.pack.user.api.repository.UserRepository;
import com.pack.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Long getUserCode(){
        long first12 = (long) (Math.random() * 10000000000L);
        long userCode = 220000000000L + first12;
        return userCode;
    }

    public String getCreatedDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String createdDateAndTime = formatter.format(date);
        return createdDateAndTime;
    }

    public String getUpdatedDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String updatedDateAndTime = formatter.format(date);
        return updatedDateAndTime;
    }

    @Override
    public User postUser(User user) {

        user.setUserCode(getUserCode());
        user.setCreatedDate(getCreatedDate());
        if (user.isCreating() == true ) {
            user.setUpdateDate(null);
        }
        if (user.isCreating() == true ) {
            user.setUpdatedDate(null);
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User deleteUser(Integer id) {
        User user = userRepository.findById(id).get();
        userRepository.deleteById(id);
        return user;
    }

}
