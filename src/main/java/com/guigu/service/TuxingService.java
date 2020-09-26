package com.guigu.service;

import com.guigu.vo.PageVo;
import com.guigu.vo.Person;
import com.guigu.vo.Tuxinginfo;

import java.util.List;

public interface TuxingService {


   //查出销量
   public List<Tuxinginfo> querytuxing();
   //查询所有用户
   public List<Person> queryallperson(Person person, int page, int rows);
   //根据条件查询用户数量
   public PageVo<Person> queryallpersonbyCond(Person person, int page, int rows) ;

}
