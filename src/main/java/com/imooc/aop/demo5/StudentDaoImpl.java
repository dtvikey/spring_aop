package com.imooc.aop.demo5;

/**
 * @Author: dtvikey
 * @Date: 18-11-2 上午9:42
 * @Version 1.0
 */
public class StudentDaoImpl implements StudentDao {

    public void find() {
        System.out.println("学生查询...");
    }

    public void save() {
        System.out.println("学生保存...");
    }

    public void update() {
        System.out.println("学生更新...");
    }

    public void delete() {
        System.out.println("学生删除...");
    }
}
