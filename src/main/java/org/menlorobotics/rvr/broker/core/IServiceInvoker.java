package org.menlorobotics.rvr.broker.core;

import java.util.List;
import java.util.Map;

//invokes the service
public interface IServiceInvoker {
	Map<String,IResult> doWork ( List < IService > services);
}
