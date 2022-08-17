package org.menlorobotics.rvr.broker.core;

import java.util.List;

//uses iscorer to get the score of services and based on that gives the iselector
//using InputProcessorByCapability to find the capabilites as well.
public interface ISelector  {
	List<IService> getServices(IInput input, List<ICapability> capabilities);
	List<IService> getServices(IInput input);
	void setScorer(IScorer s);
	void setInputToCapabilityMapper(IInputToCapabilityMapper s);
	
}
