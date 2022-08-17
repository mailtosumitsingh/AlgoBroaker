package org.menlorobotics.rvr.broker.core;

import java.util.List;
//mergeResults() ->this is merger used for resources.
public interface IMerger {
	IResult getResult(List<IResult> res);
}
