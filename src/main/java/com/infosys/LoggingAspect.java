package com.infosys;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
	
	 @Before("execution(* com.infosys.service.FlightServiceImpl.addFlight(..))")
	public void execute(JoinPoint joinPoint) {
		 
		 System.out.println(joinPoint.getSignature());
		System.out.println("entering logging");
	}
	

}
