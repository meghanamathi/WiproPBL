package Oops.TopicstoLearn.OptionalClass.Assignment3;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee object is null"));

            System.out.println(employee.name);

        } catch (InvalidEmployeeException e) {

            System.out.println(e.getMessage());
        }
    }
}
