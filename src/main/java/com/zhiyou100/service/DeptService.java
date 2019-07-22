package com.zhiyou100.service;

import com.zhiyou100.pojo.Dept;
import com.zhiyou100.result.ResultObject;

public interface DeptService {
    ResultObject findAll();

    ResultObject add(Dept dept);

    ResultObject updateById(Dept dept);

    ResultObject deleteById(Integer d_id);

    ResultObject findOneById(Integer d_id);
}
