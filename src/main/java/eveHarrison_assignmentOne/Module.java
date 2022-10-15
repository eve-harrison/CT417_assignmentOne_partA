package eveHarrison_assignmentOne;

import java.util.ArrayList;

public class Module {
    private Lecturer lecturer;
    private String moduleID;
    private String moduleName;
    private ArrayList<Student> studentList = new ArrayList();

    private ArrayList<String> courseList = new ArrayList();

    public Module(String moduleName, Lecturer lecturer) {
        this.moduleName = moduleName;
        this.lecturer = lecturer;
        this.studentList = this.getListOfStudents();
        this.courseList = this.getRelatedCourses();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void addStudent(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
        }
    }
    public ArrayList<Student> getListOfStudents(){
        return studentList;
    }

    public void addCourses(String course) {
        if (!courseList.contains(course)) {
            courseList.add(course);
        }
    }
    public ArrayList<String> getRelatedCourses(){
        return courseList;
    }
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
    public Lecturer getLecturer() {
        return lecturer;
    }

}
