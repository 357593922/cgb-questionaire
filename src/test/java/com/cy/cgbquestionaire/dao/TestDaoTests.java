package com.cy.cgbquestionaire.dao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDaoTests {
    @Autowired
    public TestDao testDao;

    @Test
    public void testMyBatis() {
        System.out.println("test");
        int rows = testDao.deleteById(1);
        System.out.println("rows="+rows);
    }

    @Test
    public void testMyBatis1(){
        System.out.println("testMapper");
        int rows = testDao.deleteObjects(17,18);
        System.out.println("rows=" + rows);
    }
}
