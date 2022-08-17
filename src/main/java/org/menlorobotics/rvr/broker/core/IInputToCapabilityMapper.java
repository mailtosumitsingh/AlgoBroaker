package org.menlorobotics.rvr.broker.core;

import java.util.List;

public interface IInputToCapabilityMapper<T> {
	List<ICapability> getCapabilities(IInput<T> t);
}
