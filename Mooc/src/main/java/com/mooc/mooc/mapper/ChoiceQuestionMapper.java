package com.mooc.mooc.mapper;

import com.mooc.mooc.model.ChoiceQuestion;
import java.util.List;

public interface ChoiceQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    List<ChoiceQuestion> selectAll();

    int updateByPrimaryKey(ChoiceQuestion record);
}