package WrapperClass.Assignment4;

public class EmployeeClone{

    public static void main(String[] args) {

        try {

            // Original Object
            Employee emp1 = new Employee(101, "Meghana", 50000);

            // Clone Object
            Employee emp2 = (Employee) emp1.clone();

            // Modify Original Object
            emp1.setEmpName("Rahul");
            emp1.setSalary(65000);

            System.out.println("Original Employee");
            System.out.println("-----------------");
            emp1.display();

            System.out.println();

            System.out.println("Cloned Employee");
            System.out.println("----------------");
            emp2.display();

        }

        catch (CloneNotSupportedException e) {

            System.out.println(e);

        }

    }

}
