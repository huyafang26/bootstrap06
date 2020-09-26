package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.TuxingDao;
import com.guigu.service.TuxingService;
import com.guigu.vo.PageVo;
import com.guigu.vo.Person;
import com.guigu.vo.Tuxinginfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuxingServiceImpl implements TuxingService {

    @Autowired
    TuxingDao tuxingDao;

    @Override
    public List<Tuxinginfo> querytuxing() {
        return tuxingDao.querytuxing();
    }
    //查询所有用户
    @Override
    public List<Person> queryallperson(Person person, int page, int rows) {
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        return tuxingDao.queryallperson(person);
    }
    //根据条件查询用户数量
    @Override
    public PageVo<Person> queryallpersonbyCond(Person person, int page, int rows) {
        PageVo<Person> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(tuxingDao.queryallperson(person));
        //获取总的记录数量
        pageVo.setTotal(tuxingDao.queryallpersonbyCond(person));

        return pageVo;
    }
}
