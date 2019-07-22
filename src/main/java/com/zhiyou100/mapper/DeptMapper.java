package com.zhiyou100.mapper;

import com.zhiyou100.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DeptMapper  {
    @Select("select * from dept")
    List<Dept> findAll();

    @Update("UPDATE dept SET d_name=#{d_name},d_desc=#{d_desc} WHERE d_id=#{d_id}")
    int update(Dept dept);

    @Delete("delete from dept where d_id=#{d_id}")
    int delete(Integer d_id);

    @Insert(" insert  into dept(d_name,d_desc) values (#{d_name},#{d_desc})")
    int add(Dept dept);

    @Select("select * from dept where d_id=#{d_id}")
    Dept findOneById(int d_id);
}
