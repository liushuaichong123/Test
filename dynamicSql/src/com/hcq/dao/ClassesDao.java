package com.hcq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hcq.entity.Classes;

public interface ClassesDao{
	//�������
    public void cascadeInsert(List list);
    //������ѯ
    public List<Classes> getClasses(@Param("map")Map map);
    //��Ӱ༶
    public void saveClasses(Classes cla);
    //ɾ���༶
    public void deleteClasses(int id);
}
