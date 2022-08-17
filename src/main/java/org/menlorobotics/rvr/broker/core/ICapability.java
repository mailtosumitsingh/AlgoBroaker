package org.menlorobotics.rvr.broker.core;

import java.util.List;
import java.util.Map;

//get sample
//getuid??
public interface ICapability {
	List<String> getCapabilities();
	String getId();
	Map<String, String> getParams();
	List<String> getMetrics();//basically it maops to the IScore ids/kpi ids . How do we measure it?
	String getName();
}
