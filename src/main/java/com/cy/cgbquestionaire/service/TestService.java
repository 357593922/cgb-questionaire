package com.cy.cgbquestionaire.service;

import org.apache.ibatis.annotations.Param;

public interface TestService {

    int deleteById(Integer id);

    int deleteObjects(@Param("ids")Integer... ids);

}
