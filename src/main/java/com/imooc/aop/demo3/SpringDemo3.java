package com.imooc.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: dtvikey
 * @Date: 18-11-2 上午10:39
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

    @Resource
    private StudentDao studentDao;

    @Test
    public void demo1(){

        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();

    }

}
