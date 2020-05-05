package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.ChoiceOfQuestionMapper;
import com.mooc.mooc.mapper.JudgeOfQuestionMapper;
import com.mooc.mooc.model.JudgeOfQuestion;
import com.mooc.mooc.service.JudgeQuestionService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JudgeQuestionServiceImpl implements JudgeQuestionService {

    @Autowired
    private JudgeOfQuestionMapper judgeOfQuestionMapper;
    @Override
    public List<JudgeOfQuestion> list(JudgeOfQuestion judgeOfQuestion) {
        return null;
    }

    @Override
    public ResultVO update(JudgeOfQuestion judgeOfQuestion) {
        return null;
    }

    @Override
    public ResultVO delete(Integer taskId) {
        return null;
    }

    @Override
    public ResultVO add(JudgeOfQuestion judgeOfQuestion) {
        ResultVO resultVO=new ResultVO(0, "");
        judgeOfQuestion.setType(0);
        judgeOfQuestionMapper.insert(judgeOfQuestion);
        return resultVO;
    }

    @Override
    public ResultVO cancel(Integer choiceId) {
        return null;
    }

    @Override
    public JudgeOfQuestion sel(Integer choiceId) {
        return null;
    }
}
