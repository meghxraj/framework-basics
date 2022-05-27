package com.log4j.tutorial;

import org.apache.logging.log4j.*;


public class Demo {
	
	//initializing the logger object of the class
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		log.debug("debug message");
		log.error("error message");
		log.fatal("fatal error");
		log.always();
		log.info("log info");
	}
}
