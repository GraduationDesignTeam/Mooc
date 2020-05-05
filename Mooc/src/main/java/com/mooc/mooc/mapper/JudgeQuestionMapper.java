package com.mooc.mooc.mapper;

import com.mooc.mooc.model.JudgeOfQuestion;

import java.util.List;

public interface JudgeQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JudgeOfQuestion record);

    JudgeOfQuestion selectByPrimaryKey(Integer id);

    List<JudgeOfQuestion> selectAll();

    int updateByPrimaryKey(JudgeOfQuestion record);
}