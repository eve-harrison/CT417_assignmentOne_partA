package eveHarrison_assignmentOne;

import java.util.ArrayList;
import org.joda.time.*;

public class Student {
    private String studentName, studentUserName;
    private int studentAge;
    private DateTime studentDOB;
    private long studentID;
    ArrayList<Module> studentModules = new ArrayList<Module>();
    private Course course;

    private ArrayList<Module> modules;

    public Student(String studentName, int studentID, DateTime studentDOB) {
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentID = studentID;
        this.studentAge = this.getAge();
        this.studentUserName = this.getUserName();
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public String getName() {
        return studentName;
    }

    public String getUserName() {
        studentUserName = studentName + studentAge;
        return studentUserName;
    }

    public void setAge(int age) {
        this.studentAge = age;
    }

    public int getAge() {
        return studentAge;
    }

    public DateTime getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(DateTime DOB) {
        this.studentDOB = DOB;
    }

    public void addModule(Module module) {
        studentModules.add(module);
    }

    public void removeModule(Module module) {
        studentModules.remove(module);
    }

    public ArrayList<Module> getListOfModules(){
        return studentModules;
    }

    public void setCourse(Course course) {
        this.course = course;
        this.setModules(course.getAssociatedModules());
        this.course.addStudent(this);
    }

    public Course getCourse() {
        return course;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

}