package com.cqjtu.ets.onlinejudge.service.impl;

import com.cqjtu.ets.onlinejudge.mapper.OjProgrammingProblemMapper;
import com.cqjtu.ets.onlinejudge.model.entity.OjProgrammingProblem;
import com.cqjtu.ets.onlinejudge.service.ProgrammingProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingProblemServiceImpl implements ProgrammingProblemService {

    @Autowired
    private OjProgrammingProblemMapper programmingProblemMapper;

    @Override
    public OjProgrammingProblem getProgrammingProblemByPK(long problem_id) {
       return programmingProblemMapper.selectByPK(problem_id);
    }

    @Override
    public int updateIsCompiled(OjProgrammingProblem problem) {
        return programmingProblemMapper.updateIsCompiled(problem);
    }

    @Override
    public int add(OjProgrammingProblem problem) {
        return programmingProblemMapper.insert(problem);
    }

    @Override
    public long getMaxId() {
        List<Long> commitIdList = programmingProblemMapper.selectProblemId();
        if(commitIdList !=null && commitIdList.size() > 0){
            return commitIdList.get(0);
        }
        return 0L;
    }
}
