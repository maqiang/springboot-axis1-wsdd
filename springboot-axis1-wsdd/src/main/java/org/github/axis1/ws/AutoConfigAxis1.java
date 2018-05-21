package org.github.axis1.ws;

import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigAxis1 {

	@Bean
	public ServletRegistrationBean<AxisServlet> axisServlet() {


		ServletRegistrationBean<AxisServlet> servlet = new ServletRegistrationBean<AxisServlet>();
		
		servlet.setServlet(new AxisServlet());
		servlet.addUrlMappings("/services/*");
		servlet.setName("AxisServlet");
		servlet.setLoadOnStartup(1);
		
		
		//设置引擎
		//与官方提供默认引擎区别:查找wsdd位置不同。一个是springboot位置，一个是WEB-INF位置(war)
		System.setProperty(EngineConfigurationFactory.SYSTEM_PROPERTY_NAME,"org.github.axis1.ws.SpringBootEngineConfigurationFactoryServlet");
		
		return servlet;
		
	}
	
	
	
}