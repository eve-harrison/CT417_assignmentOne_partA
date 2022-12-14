package eveHarrison_assignmentOne;
import org.joda.time.DateTime;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lecturer {
    private String lecturerName;
    private int lecturerAge;
    private DateTime lecturerDOB;
    private int lecturerID;
    private String lecturerUserName;
    private ArrayList<Module> lecturerModules = new ArrayList();

    public Lecturer(String lecturerName, int lecturerID, DateTime lecturerDOB) {
        this.lecturerName = lecturerName;
        this.lecturerDOB = lecturerDOB;
        this.lecturerID = lecturerID;
        this.lecturerAge = this.getAge();
        this.lecturerUserName = this.getUserName();
    }

    public void setName(String name) {
        this.lecturerName = name;
    }

    public String getName() {
        return lecturerName;
    }

    public String getUserName() {
        lecturerUserName = lecturerName + lecturerAge;
        return lecturerUserName;
    }

    public void setAge(int age) {
        this.lecturerAge = age;
    }

    public int getAge() {
        return lecturerAge;
    }

    public DateTime getLecturerDOB() {
        return lecturerDOB;
    }

    public void setLecturerDOB(DateTime DOB) {
        this.lecturerDOB = DOB;
    }

    public void setLecturerModule(ArrayList<Module> lecturerModules) {
        this.lecturerModules = lecturerModules;
    }

    public void addModule(Module module) {
        lecturerModules.add(module);
    }

    public boolean removeModule(Module module) {
        return lecturerModules.remove(module);
    }

    public ArrayList<Module> getListOfModules(){
        return lecturerModules;
    }

}
