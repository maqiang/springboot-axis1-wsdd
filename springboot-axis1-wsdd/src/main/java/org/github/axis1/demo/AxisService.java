package org.github.axis1.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pony
 * @date 2018年5月21日
 */
public class AxisService {
	
	
	private static final Logger logger = LoggerFactory.getLogger(AxisService.class);

	public String sayHello(String message ) {
		
		logger.debug("AxisService message = {} " , message);
		
		return "Hello , " + message;
	}
}
