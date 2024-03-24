package bean_practice;

import bean_practice.config.EmployeeConfig;
import bean_practice.config.RandomConfig;
import bean_practice.employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class, RandomConfig.class);

        Employee employee1 = container.getBean("FULLTIME",Employee.class);

        employee1.createAccount();

        String message = container.getBean("message",String.class);

        System.out.println(message);



    }
}
