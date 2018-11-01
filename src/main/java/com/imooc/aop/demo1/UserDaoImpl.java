package com.imooc.aop.demo1;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午4:58
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{

    public void save() {
        System.out.println("save");
    }

    public void update() {
        System.out.println("update");

    }

    public void delete() {
        System.out.println("delete");
    }

    public void find() {
        System.out.println("find");
    }

}
