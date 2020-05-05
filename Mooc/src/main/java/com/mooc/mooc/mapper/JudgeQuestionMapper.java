package com.mooc.mooc.mapper;

import com.mooc.mooc.model.JudgeQuestion;

import java.util.List;

public interface JudgeQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JudgeQuestion record);

    JudgeQuestion selectByPrimaryKey(Integer id);

    List<JudgeQuestion> selectAll();

    int updateByPrimaryKey(JudgeQuestion record);
}