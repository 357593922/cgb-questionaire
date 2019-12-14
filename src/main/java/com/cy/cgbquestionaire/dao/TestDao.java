package com.cy.cgbquestionaire.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestDao {

    /*注解方式写简单sql语句 */
    @Delete("delete from t_user where id=#{id}")
    int deleteById(Integer id);

    /*Mapper.xml写复杂sql语句*/
    int deleteObjects(@Param("ids")Integer... ids);
}
