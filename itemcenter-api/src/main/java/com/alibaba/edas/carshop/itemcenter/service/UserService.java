package com.alibaba.edas.carshop.itemcenter.service;


import com.alibaba.edas.carshop.itemcenter.model.User;

/**
 * @author wangzi
 * @date 18/9/12 上午10:37.
 */
public interface UserService {
    User getUserById(int id);
    void setUserName(User user,String name);
}
