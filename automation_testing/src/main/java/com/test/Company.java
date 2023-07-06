package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Company {

	static Logger log = LogManager.getLogger(Company.class);
	
	public static void main(String[] args) {
	
		  System.out.println("starting point");
  	      log.info("Info Message!");
	      log.error("Error Message!");
	      log.warn("Warn Message!");
	      log.fatal("Fatal Message!");

	}

}