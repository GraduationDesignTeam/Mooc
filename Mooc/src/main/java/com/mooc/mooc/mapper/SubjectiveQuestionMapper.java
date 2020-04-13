package com.mooc.mooc.mapper;

import com.mooc.mooc.model.SubjectiveQuestion;
import java.util.List;

public interface SubjectiveQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SubjectiveQuestion record);

    SubjectiveQuestion selectByPrimaryKey(Integer id);

    List<SubjectiveQuestion> selectAll();

    int updateByPrimaryKey(SubjectiveQuestion record);
}