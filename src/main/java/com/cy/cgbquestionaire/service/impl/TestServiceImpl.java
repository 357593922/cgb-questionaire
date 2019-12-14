package com.cy.cgbquestionaire.service.impl;

import com.cy.cgbquestionaire.dao.TestDao;
import com.cy.cgbquestionaire.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public int deleteById(Integer id) {
        return testDao.deleteById(id);
    }

    @Override
    public int deleteObjects(Integer... ids) {
        return testDao.deleteObjects(ids);
    }


}
