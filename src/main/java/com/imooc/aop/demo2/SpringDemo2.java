package com.imooc.aop.demo2;

import org.junit.Test;

public class SpringDemo2 {
    @Test
    public void demo1(){

        ProductDao productDao = new ProductDao();
        productDao.save();
        productDao.update();
        productDao.delete();
        productDao.find();

    }
}
