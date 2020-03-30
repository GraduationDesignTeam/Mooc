package com.mooc.mooc.model;

/**
 * @author 朱翔鹏
 * 用户增长统计数据封装对象
 * 月度增长情况
 */
public class UserStatistic {

    private Integer year;

    private Integer month;

    //增长数量
    private Integer num;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
