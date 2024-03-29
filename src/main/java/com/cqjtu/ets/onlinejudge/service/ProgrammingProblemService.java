package com.cqjtu.ets.onlinejudge.service;

import com.cqjtu.ets.onlinejudge.model.entity.OjProgrammingProblem;

public interface ProgrammingProblemService {
    OjProgrammingProblem getProgrammingProblemByPK(long problem_id);
    int updateIsCompiled(OjProgrammingProblem problem);
    int add(OjProgrammingProblem problem);
    long getMaxId();
}
