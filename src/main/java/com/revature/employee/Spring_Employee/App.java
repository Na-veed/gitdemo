package com.revature.employee.Spring_Employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.employee.config.BeanConfig;
import com.revature.employee.model.Account;
import com.revature.employee.model.Email;
import com.revature.employee.model.Employee;
import com.revature.employee.model.Stocks;
import com.revature.employee.repository.EmployeeRepository;
import com.revature.employee.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee emp = context.getBean(Employee.class);
		Email email = context.getBean(Email.class);
		email.setFrom("Naveed@gmail,com");
		email.setTo("Rebekah@gmail.com");
		email.setMsg("Hello reyy");
		emp.setName("Naveed");
		emp.setEmployeeId(1);
		emp.setEmail(email);
		EmployeeService empService = context.getBean(EmployeeService.class);
		EmployeeRepository empRepository = context.getBean(EmployeeRepository.class);
		System.out.println(emp);
		empService.serviceDisplay();
		empRepository.empRepository();
		Account account = context.getBean(Account.class);
		account.withdraw(12);
		account.deposit(1);
		Stocks stock = context.getBean(Stocks.class);
		stock.addStocks(12);
		stock.removeStocks(14);
	}
}
