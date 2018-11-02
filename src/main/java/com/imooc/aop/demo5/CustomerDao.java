package com.imooc.aop.demo5;

/**
 * @Author: dtvikey
 * @Date: 18-11-2 上午11:10
 * @Version 1.0
 */
public class CustomerDao {

        public void find() {
            System.out.println("查询...");
        }

        public void save() {
            System.out.println("保存...");
        }

        public void update() {
            System.out.println("更新...");
        }

        public void delete() {
            System.out.println("删除...");
        }

}
