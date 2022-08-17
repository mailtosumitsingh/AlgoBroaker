package org.menlorobotics.rvr.broker.core;

import java.util.Map;

//iscore->map of values/confidence matrix
//we ideally want to have using link ids to map score to output to save memory
//but java is by reference so ok!
public interface IResult<T> {
	Map<IScore,IOutput<T>> getResult();
}
