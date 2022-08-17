package org.menlorobotics.rvr.broker.core;

public interface IService<T> {
	String getId();
	ICapability getCapability();
	IResult<T> test();
	IResult<T> doWork();
}
