package com.hcq.dao;

import java.util.List;
import java.util.Map;

import com.hcq.entity.Student;

public interface StudentDao {
   //ģ����ѯ
   public List<Student> selectByLike(String name,String value);
   //
   public void getSname(Student stu);
   //
   public Student getOne(int id);
}
