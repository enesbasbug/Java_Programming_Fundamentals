
public class Main {

    public static void main(String[] args){
         
        // Create an object

        /* 
        
        Employee employee = new Employee();

        employee.id = 1;
        employee.name = "Enes";
        employee.email = "enes@gml.com";

        // System.out.println("Employee 1 Name:" + employee.name );

        */
        //----------------------------------------------------------------------------------------------------------------
        /*
        Employee employee = new Employee(1, "Enes", "Enes@gm.com");
        Employee employee2 = new Employee(2, "Jhon", "Jhon@gm.com");
        Employee employee3 = new Employee();
        
        employee.showInfos();
        employee2.showInfos();
        employee3.showInfos();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add(employee2);
        */
        //----------------------------------------------------------------------------------------------------------------
        Employee employee = new Employee(1, "Enes", "Enes@gm.com");
        // employee.name occurs an error due to name is private in Employee

        // we've created get/set functions; therefore, we're able to use employees attributes
        //System.out.println(employee.getId()); // it worked

        employee.setId(123);
        System.out.println(employee.getId()); // it returned 100 
       
        //----------------------------------------------------------------------------------------------------------------





    }
}
