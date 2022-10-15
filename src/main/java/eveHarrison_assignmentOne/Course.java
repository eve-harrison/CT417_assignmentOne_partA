package eveHarrison_assignmentOne;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    private String courseName;
    private ArrayList<Module> associatedModules = new ArrayList();
    private ArrayList<Student> enrolledStudents = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.associatedModules = this.getAssociatedModules();
        this.enrolledStudents = this.getListOfEnrolledStudents();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }
    public ArrayList<Student> getListOfEnrolledStudents(){
        return enrolledStudents;
    }

    public void addModules(Module module) {
        if (!associatedModules.contains(module)) {
            associatedModules.add(module);
        }
    }
    public ArrayList<Module> getAssociatedModules(){
        return associatedModules;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getStartDate() {
        return this.startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public DateTime getEndDate() {
        return this.endDate;
    }
}
