public class Employee {
    private String name;
    private int employeeID;
    private Department department;

    Employee(String name, int employeeID, Department department){
        this.name = name;
        this.employeeID= employeeID;
        this.department= department;
        department.addEmployee(this);
    }


}
