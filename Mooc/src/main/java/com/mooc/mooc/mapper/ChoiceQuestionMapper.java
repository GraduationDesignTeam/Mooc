package com.mooc.mooc.mapper;


import com.mooc.mooc.model.ChoiceOfQuestion;

import java.util.List;

public interface ChoiceQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChoiceOfQuestion record);

    ChoiceOfQuestion selectByPrimaryKey(Integer id);

    List<ChoiceOfQuestion> selectAll();

    int updateByPrimaryKey(ChoiceOfQuestion record);
}