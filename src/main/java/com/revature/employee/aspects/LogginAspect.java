package com.revature.employee.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	
	@Before("execution (* com.revature.employee.model.Account.*(..))")
	public void beforeLog() {
		System.out.println("====Log called Before");
	}
	
	@After("execution (* com.revature.employee.model.Account.*(..))")
	public void afterLog() {
		System.out.println("====Log called After");
	}
	
	/*
	 * @Before("pointCut1()") public void enterLog() {
	 * System.out.println("====Log Entered==="); }
	 * 
	 * @Before("pointCut2()") public void serviceLog() {
	 * System.out.println("========Service log is getting called========="); }
	 * 
	 * @After("pointCut2()") public void serviceLogAfter() {
	 * System.out.println("========Service log called successfully======="); }
	 * 
	 * @Before("pointCut3()") public void repoLog() { System.out.
	 * println("=========Repository is getting called successfully======="); }
	 * 
	 * @After("pointCut3()") public void repoLogAfter() {
	 * System.out.println("=========Repository called successfully======="); }
	 * 
	 * 
	 * @Before("execution(* com.revature.employee.model.Stocks.addStocks(..))")
	 * public void enterLogForStock() {
	 * System.out.println("===Product in entered in the inverntory==="); }
	 * 
	 * @Before("execution(* com.revature.employee.model.Stocks.removeStocks(..))")
	 * public void enterLogRemoveStocks() {
	 * System.out.println("===Product in removed from the inverntory==="); }
	 * 
	 * @After("execution(* com.revature.employee.model.Stocks.*(..))") public void
	 * enterConfirmationLog() {
	 * System.out.println("=======Mission completed successfully========"); }
	 * 
	 * @Pointcut(" execution(* com.revature.employee.model.Account.*(..))") public
	 * void pointCut1() { //this is a marker method for pointcut }
	 * 
	 * @Pointcut(" within(com.revature.employee.service.EmployeeService)") public
	 * void pointCut2() {
	 * 
	 * }
	 * 
	 * @Pointcut(" this(com.revature.employee.repository.EmployeeRepository)")
	 * public void pointCut3() {
	 * 
	 * }
	 */
}
