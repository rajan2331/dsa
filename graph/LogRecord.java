package com.microservice.websocket.config;

public class LogRecord {

	
//	record(order_id): adds the order_id to the log
//	get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.

/*
		You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
*/
	int maxSize;
	int currIndex;
	int[] recordArr ;
	
	
	
	public LogRecord(int n) {
		super();
		this.recordArr= new int[n];
		this.currIndex=0;
		this.maxSize = n;
	}

	public void record(int order_id)
	{
		recordArr[currIndex] =order_id ;
		currIndex=(1+currIndex) % maxSize;
	}
	
	public int get_last(int i)
	{
		return recordArr[(currIndex-i + maxSize)& maxSize];
	}
}
