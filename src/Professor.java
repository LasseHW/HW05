import java.util.ArrayList;

public class Professor extends Employee{


    private ArrayList <Course> courses;
    Professor(String name, int employeeID, Department department){
        super( name, employeeID,department);
    }
    public void publicCourse(){

    }
    public void assignTa(Course c, TA t){
        t.addCourse(c);
    }
    public void addCourse(Course c){
        this.courses.add(c);
    }
}
