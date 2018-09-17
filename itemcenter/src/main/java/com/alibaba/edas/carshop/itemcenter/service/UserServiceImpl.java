package com.alibaba.edas.carshop.itemcenter.service;

import com.alibaba.edas.carshop.itemcenter.model.User;
import org.springframework.stereotype.Service;

/**
 * @author wangzi
 * @date 18/9/12 上午10:48.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(int id) {
        User user = new User(2, "wz");
        return user;
    }

    @Override
    public void setUserName(User user, String name) {
        System.out.println("入UserServiceImpl[]setUserName" + user);
        user.setName(name);
        System.out.println("出UserServiceImpl[]setUserName" + user);
    }
}
