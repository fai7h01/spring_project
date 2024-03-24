package bean_practice.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public abstract class Employee {

    private UUID id;
    private String name;
    private boolean isFullTime;

    public abstract void createAccount();
}
