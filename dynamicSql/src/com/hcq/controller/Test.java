package com.hcq.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hcq.dao.ClassesDao;
import com.hcq.dao.StudentDao;
import com.hcq.entity.Classes;
import com.hcq.entity.Student;

public class Test {
  public static void main(String[] args) throws IOException {
	  getClasses();
	  String B="aaa";
  }
  //Ä£ºý²éÑ¯
  public static void selectByLike() throws IOException{
	   String xmlpath="mybatisConfig.xml";
		Reader xml=Resources.getResourceAsReader(xmlpath);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(xml);
	    SqlSession session=factory.openSession();
	    StudentDao dao=session.getMapper(StudentDao.class);
	    List<Student> list=dao.selectByLike("sname","%ºÎ%");
	    System.out.println(list);
	    session.close(); 
  }
  public static void procedure() throws IOException{
		String xmlpath="mybatisConfig.xml";
		Reader xml=Resources.getResourceAsReader(xmlpath);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(xml);
	    SqlSession session=factory.openSession();
	    StudentDao dao=session.getMapper(StudentDao.class);
	    Student stu=new Student();
	    stu.setSid(1);
	    System.out.println(stu);
	    dao.getSname(stu);
	    System.out.println(stu);
	    session.close(); 
  }
  public static void cascadeInsert() throws IOException{
		String xmlpath="mybatisConfig.xml";
		Reader xml=Resources.getResourceAsReader(xmlpath);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(xml);
	    SqlSession session=factory.openSession(true);
	    ClassesDao dao=session.getMapper(ClassesDao.class);

	    List list=new ArrayList();
	 Classes cla=new Classes(4,"java4",list);

	    list.add(cla);
        dao.cascadeInsert(list);
	    session.close(); 
  }
  ///Ìõ¼þ²éÑ¯
  public static void getClasses() throws IOException{
		String xmlpath="mybatisConfig.xml";
		Reader xml=Resources.getResourceAsReader(xmlpath);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(xml);
	    SqlSession session=factory.openSession(true);
	    ClassesDao dao=session.getMapper(ClassesDao.class);
	    Map map=new HashMap();
	    map.put("cid", "0");
	    map.put("cname","java2");
	    System.out.println(dao.getClasses(map));
	    session.close(); 
  }
  //
  public static void saveClasses() throws IOException{
		String xmlpath="mybatisConfig.xml";
		Reader xml=Resources.getResourceAsReader(xmlpath);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(xml);
	    SqlSession session=factory.openSession(true);
	    ClassesDao dao=session.getMapper(ClassesDao.class);
	    Classes cla=new Classes(50, "yyy", null);
	    dao.saveClasses(cla);
	    session.close(); 
 }
public static void deleteClasses() throws IOException{
		String xmlpath="mybatisConfig.xml";
		Reader xml=Resources.getResourceAsReader(xmlpath);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(xml);
	    SqlSession session=factory.openSession(true);
	    ClassesDao dao=session.getMapper(ClassesDao.class);
	    dao.deleteClasses(100);
	    session.close(); 
 }
}
