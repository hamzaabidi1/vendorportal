package com.smartech.vendorportal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy (proxyTargetClass= true )  
public class VendorPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorPortalApplication.class, args);
	}
	
	

}
