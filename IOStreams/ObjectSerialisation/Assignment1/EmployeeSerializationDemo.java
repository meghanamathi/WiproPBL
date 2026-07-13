package IOStreams.ObjectSerialisation.Assignment1;

import java.io.*;
import java.util.Date;

public class EmployeeSerializationDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Meghana",
                new Date(),
                "IT",
                "Software Engineer",
                65000);

        // Serialization
        try {

            FileOutputStream fos = new FileOutputStream("data");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

        }

        catch (IOException e) {

            System.out.println(e);

        }

        // Deserialization
        try {

            FileInputStream fis = new FileInputStream("data");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee employee =
                    (Employee) ois.readObject();

            System.out.println();

            System.out.println("Employee object deserialized successfully.");

            System.out.println();

            employee.display();

            ois.close();
            fis.close();

        }

        catch (IOException | ClassNotFoundException e) {

            System.out.println(e);

        }

    }

}