package bean_practice.config;

import bean_practice.employee.Employee;
import bean_practice.employee.FullTimeEmployee;
import bean_practice.employee.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class EmployeeConfig {

    @Bean("FULLTIME")
    Employee fullTimeEmployee(){
        return new FullTimeEmployee(UUID.randomUUID(), "Aaron",true);
    }

    @Bean("PARTTIME")
    Employee partTimeEmployee(){
        return new PartTimeEmployee(UUID.randomUUID(),"Mike",false);
    }

}
