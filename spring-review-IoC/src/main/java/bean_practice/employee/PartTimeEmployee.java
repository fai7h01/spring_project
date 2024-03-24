package bean_practice.employee;

import java.util.UUID;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(UUID id, String name, boolean isFullTime) {
        super(id, name, isFullTime);
    }

    @Override
    public void createAccount() {
        System.out.println("Creating part time employee account");
    }
}
