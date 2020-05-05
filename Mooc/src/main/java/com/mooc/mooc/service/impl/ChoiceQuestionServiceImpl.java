package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.ChoiceOfQuestionMapper;
import com.mooc.mooc.model.ChoiceOfQuestion;
import com.mooc.mooc.service.ChoiceQuestionService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChoiceQuestionServiceImpl implements ChoiceQuestionService {

    @Autowired
    private ChoiceOfQuestionMapper choiceOfQuestionMapper;
    @Override
    public List<ChoiceOfQuestion> list(ChoiceOfQuestion choiceOfQuestion) {
        return null;
    }

    @Override
    public ResultVO update(ChoiceOfQuestion choiceOfQuestion) {
        return null;
    }

    @Override
    public ResultVO delete(Integer taskId) {
        return null;
    }

    @Override
    public ResultVO add(ChoiceOfQuestion choiceOfQuestion) {
        ResultVO resultVO=new ResultVO(0, "");
        choiceOfQuestion.setType(0);
        choiceOfQuestionMapper.insert(choiceOfQuestion);
        return resultVO;
    }

    @Override
    public ResultVO cancel(Integer choiceId) {
        return null;
    }

    @Override
    public ChoiceOfQuestion sel(Integer choiceId) {
        return null;
    }
}
