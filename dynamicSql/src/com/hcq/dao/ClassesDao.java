package com.hcq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hcq.entity.Classes;

public interface ClassesDao{
	//级联添加
    public void cascadeInsert(List list);
    //条件查询
    public List<Classes> getClasses(@Param("map")Map map);
    //添加班级
    public void saveClasses(Classes cla);
    //删除班级
    public void deleteClasses(int id);
}
