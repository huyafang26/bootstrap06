package com.guigu.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Person {
    private Integer id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Float sayary;

    public Person() {
    }

    public Person(Integer id, String name, Date birthday, Float sayary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sayary = sayary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Float getSayary() {
        return sayary;
    }

    public void setSayary(Float sayary) {
        this.sayary = sayary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sayary=" + sayary +
                '}';
    }
}
