package com.guigu.dao;

import com.guigu.vo.Person;
import com.guigu.vo.Tuxinginfo;

import java.util.List;

public interface TuxingDao {

    //查出销量
    public List<Tuxinginfo> querytuxing();
    //查询所有用户
    public List<Person> queryallperson(Person person);
    //根据条件查询用户数量
    public int queryallpersonbyCond(Person person);

}
