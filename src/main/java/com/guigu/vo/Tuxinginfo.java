package com.guigu.vo;

public class Tuxinginfo {
    private Integer id;
    private String shangpinname;
    private Integer xiaoliang;

    public Tuxinginfo() {
    }

    public Tuxinginfo(Integer id, String shangpinname, Integer xiaoliang) {
        this.id = id;
        this.shangpinname = shangpinname;
        this.xiaoliang = xiaoliang;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShangpinname() {
        return shangpinname;
    }

    public void setShangpinname(String shangpinname) {
        this.shangpinname = shangpinname;
    }

    public Integer getXiaoliang() {
        return xiaoliang;
    }

    public void setXiaoliang(Integer xiaoliang) {
        this.xiaoliang = xiaoliang;
    }

    @Override
    public String toString() {
        return "Tuxinginfo{" +
                "id=" + id +
                ", shangpinname='" + shangpinname + '\'' +
                ", xiaoliang=" + xiaoliang +
                '}';
    }
}
