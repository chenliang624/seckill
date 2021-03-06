package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Evan on 2016-06-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit  spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private  SuccessKilledDao successKilledDao;
    @Test
    public void testInsertSuccessKilled() throws Exception {

        long id = 1001L;
        long phone = 13285156757L;
        int insertCount = successKilledDao.insertSuccessKilled(id,phone);
        System.out.println("insertCount="+insertCount);

    }

    @Test
    public void testQueryByIdWithSeckill() throws Exception {

        long id = 1001L;
        long phone = 13285156757L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());

    }
}