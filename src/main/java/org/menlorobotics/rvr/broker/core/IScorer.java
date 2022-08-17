package org.menlorobotics.rvr.broker.core;

import java.util.List;

//updateScore(IResultByService, confidencematrix) --done
//getResultSCore(IService);--done renamed to getCurrentScore

public interface IScorer {
	List<IScore>getCurrentScore(String serviceId);
	List<IScore> updateScore(String serviceId,List<IScore> scores);
}
