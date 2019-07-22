package com.zhiyou100.serviceImpl;

import com.zhiyou100.mapper.DeptMapper;
import com.zhiyou100.pojo.Dept;
import com.zhiyou100.result.ResultObject;
import com.zhiyou100.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public ResultObject findAll() {
        List<Dept> depts =deptMapper.findAll();
        if (depts.size()==0){
            return  new ResultObject(200,"暂时没有信息");
        }else {
            return  new ResultObject(200,"查询成功",depts);
        }
    }

    @Override
    public ResultObject add(Dept dept) {
        if (dept.getD_name()==null||dept.getD_name().trim().equals("")){
            return  new ResultObject(201,"d_name不能为空");
        }else {
            int i =deptMapper.add(dept);
            if (i==1){
                return new ResultObject(200,"添加成功");
            }else {
                return new ResultObject(201,"添加失败");
            }
        }
    }

    @Override
    public ResultObject updateById(Dept dept) {

        return null;
    }

    @Override
    public ResultObject deleteById(Integer d_id) {
        if(d_id==null||d_id==0){
            return new ResultObject(201,"d_id不能为空");
        }else{
            int i=deptMapper.delete(d_id);
            if(i==1){
                return new ResultObject(200,"删除成功");
            }else {
                return new ResultObject(201,"删除失败-d_id可能不存在");
            }
        }
    }

    @Override
    public ResultObject findOneById(Integer d_id) {
        return null;
    }
}
