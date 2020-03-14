package com.czeta.onlinejudge.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czeta.onlinejudge.dao.entity.Problem;
import com.czeta.onlinejudge.model.param.MachineProblemModel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @InterfaceName ProblemMapper
 * @Description
 * @Author chenlongjie
 * @Date 2020/3/12 20:40
 * @Version 1.0
 */
@Repository
public interface ProblemMapper extends BaseMapper<Problem> {

    @Select("SELECT * FROM problem p INNER JOIN problem_judge_type pjt ON p.id=pjt.problem_id")
    MachineProblemModel selectProblemJoinJudgeType(Long problemId);
}