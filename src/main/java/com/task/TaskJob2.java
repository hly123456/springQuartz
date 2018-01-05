package com.task;

import org.apache.log4j.Logger;

public class TaskJob2  {
	
	private Logger logger = Logger.getLogger(TaskJob2.class);
	
	public void job1(){
		logger.info("任务1已开始。。。");
	}
}
