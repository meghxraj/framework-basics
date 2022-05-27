package com.log4j2.tutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.log4j.tutorial.Demo;

public class Demo2 {
		
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
