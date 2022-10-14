package eveHarrison_assignmentOne;

import java.util.ArrayList;
import org.joda.time.*;

public class Student {
    private String studentName, studentUserName;
    private int studentAge;
    private DateTime studentDOB;
    private long studentID;
    ArrayList<Module> studentModules = new ArrayList<Module>();
    private String studentsCourse;

    public Student(String studentName, int studentID, DateTime studentDOB, String studentsCourse) {
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentID = studentID;
        this.studentsCourse = studentsCourse;
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

    public void setStudentsCourse(String name) {
        this.studentsCourse = studentsCourse;
    }

    public String getStudentsCourse(){
        return studentsCourse;
    }
}
