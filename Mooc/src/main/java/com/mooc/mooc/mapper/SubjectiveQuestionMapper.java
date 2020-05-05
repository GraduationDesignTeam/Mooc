package com.mooc.mooc.mapper;

import com.mooc.mooc.model.SubjectiveOfQuestion;

import java.util.List;

public interface SubjectiveQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SubjectiveOfQuestion record);

    SubjectiveOfQuestion selectByPrimaryKey(Integer id);

    List<SubjectiveOfQuestion> selectAll();

    int updateByPrimaryKey(SubjectiveOfQuestion record);
}