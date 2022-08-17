package org.menlorobotics.rvr.broker.core;

import java.util.List;
import java.util.Map;

public interface IInput<T> {
	List<String> getMimeType();
	Map<String,String> getTags();
	T getInputObject();
}
