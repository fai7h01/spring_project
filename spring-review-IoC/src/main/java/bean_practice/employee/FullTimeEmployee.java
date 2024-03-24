package bean_practice.employee;

import java.util.UUID;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(UUID id, String name, boolean isFullTime) {
        super(id, name, isFullTime);
    }

    @Override
    public void createAccount() {
        System.out.println("Creating full time employee account");
    }
}
