package com.imooc.aop.demo6;

import com.imooc.aop.demo6.CustomerDao;
import com.imooc.aop.demo6.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: dtvikey
 * @Date: 18-11-2 下午4:22
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo6 {

    @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void demo1(){
        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();

        customerDao.find();
        customerDao.save();
        customerDao.update();
        customerDao.delete();
    }
}
