package labs_examples.input_output.labs;


import java.io.*;
import java.util.ArrayList;

/**
 * Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 * package, create a new application that will parse a custom CSV file that you created and map each line of the
 * csv to a custom POJO that you create.
 * <p>
 * Then add that object to an arraylist. After you have mapped each row of the csv to objects
 * and added each object to an arraylist, print out each object using the objects custom toString() method.
 * <p>
 * Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 */


public class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();


        String filePath = "src/labs_examples/input_output/files/employees.csv";

        try (BufferedReader br = new BufferedReader
                (new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                employees.add(mapValueToEmployeeObject(values));
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }


    private static Employee mapValueToEmployeeObject(String[] values) {
        Employee employee = new Employee();

        employee.setIdNumber(Integer.parseInt(values[0]));
        employee.setFirstName(values[1]);
        employee.setLastName(values[2]);
        employee.setHoursWorked(Double.parseDouble(values[3]));

        return employee;
    }
}