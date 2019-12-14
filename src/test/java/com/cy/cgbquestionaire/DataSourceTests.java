package com.cy.cgbquestionaire;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class DataSourceTests {
    @Autowired
    private DataSource dataSource;
    @Test
    public void testDataSource() throws Exception{
        System.out.println(dataSource.getConnection());
    }
}




