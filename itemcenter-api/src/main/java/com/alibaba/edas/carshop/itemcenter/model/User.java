package com.alibaba.edas.carshop.itemcenter.model;

import java.io.Serializable;

/**
 * @author wangzi
 * @date 18/9/12 上午10:38.
 */
public class User implements Serializable{
    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
