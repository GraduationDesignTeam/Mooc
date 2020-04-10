package com.mooc.mooc.util;


public class Define {

    public static final int PAGE_SIZE=6;

    public static final int PRE_PAGE_SIZE=8;

    //课程尚未开始
    public static final int COURSE_STATE_WAIT=0;
    //课程进行中
    public static final int COURSE_STATE_OPEN=0;
    //课程已结束
    public static final int COURSE_STATE_CLOSE=0;
    //课程审核状态为未通过
    public static final int CHECK_STATE_NOT_PASS=0;
    //课程审核状态为通过
    public static final int CHECK_STATE_PASSED=1;
    //所有人可选
    public static final int COURSE_AUTHORITY_PUBLIC=0;
    //仅本校学生可选
    public static final int COURSE_AUTHORITY_PRIVATE=1;
}
