package sample.simple.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Monitor {
	
	@Before("execution(* sample..*(..))")
	public void logServiceAccess(JoinPoint joinPoint) {
		System.out.println("Before: " + joinPoint);
	}

	
	//TODO add security pointcuts ??
	
}