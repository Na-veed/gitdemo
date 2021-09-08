package com.revature.employee.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidatingAmountAspect {

	@Around("execution (* com.revature.employee.model.Account.*(..))")
	public void validateAmount(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String functionName = joinPoint.getSignature().getName();
		System.out.println("The function getting called is " + functionName);
		Object arguments[] = joinPoint.getArgs();
		Integer amount = (Integer)arguments[0];
		if(amount < 0) {
			System.out.println("Amount is not an validated amount");
		}
		else {
			System.out.println("Amount is an validated amount");
			joinPoint.proceed();
			System.out.println("The function that just called is " + functionName + "and its completed its work");
		}
		
	}
	
	
}
