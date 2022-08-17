package org.menlorobotics.rvr.broker.core;

//IResult CallService(capability,input)-> uses IService*	by capability
//then calls updatescore on iscorer to update score.
//uses merger to merge results
public interface IMediator {
	IResult callService(String strategy,IInput input);
	IResult callService(IInput input);
	void setScorer(IScorer s);
	void setISelector(ISelector selector);
	void setMerger(IMerger merger);
	void setServiceInvoker(String strategy,IServiceInvoker si);
}
