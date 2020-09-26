package com.guigu.controller;

import com.guigu.service.TuxingService;
import com.guigu.vo.PageVo;
import com.guigu.vo.Person;
import com.guigu.vo.Tuxinginfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TuxingController {

    @Autowired
    TuxingService tuxingService;

    @RequestMapping("/querytuxing.action")
    @ResponseBody
    public List<Tuxinginfo> querytuxing(){

        return  tuxingService.querytuxing();
    }

    //查询所有用户
    @RequestMapping("/queryallperson.action")
    @ResponseBody
    public List<Person> queryallperson(Person person,
                                       @RequestParam(value = "page",defaultValue = "1") int page,
                                       @RequestParam(value = "rows",defaultValue = "5")int rows){
        return tuxingService.queryallperson(person,page,rows);
    }
    //根据条件查询用户数量
    @RequestMapping("/queryallpersonbyCond.action")
    @ResponseBody
    public PageVo<Person> queryallpersonbyCond(Person person,
                                               @RequestParam(value = "page",defaultValue = "1") int page,
                                               @RequestParam(value = "rows",defaultValue = "5")int rows){
        return tuxingService.queryallpersonbyCond(person,page,rows);
    }

}
