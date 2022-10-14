package eveHarrison_assignmentOne;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAndLecturerTest {

    private Student student;
    private Lecturer lecturer;

    @BeforeEach
    public void SetUp() {
        DateTime sampleDOB = new DateTime(2000, 11, 29, 4, 20);
        student = new Student("Eve Harrison", 19464796, sampleDOB);
        lecturer = new Lecturer("Michael Scott", 1098, sampleDOB);
    }

    @Test
    @DisplayName("Get Username is Working For Student")
    public void getUsernameStudent_ReturnsCorrectInput() {
        String result = student.getUserName();
        assertEquals("Eve Harrison, 19464796", result);
    }

    @Test
    @DisplayName("Get Username is Working For Lecturer")
    public void getUsernameLecturer_ReturnsCorrectInput() {
        String result = lecturer.getUserName();
        assertEquals("Eve Harrison, 19464796", result);
    }

    @Test
    @DisplayName("Set Name is Working in Student")
    public void getSetName_ReturnsCorrectInput() {
        student.setName("Robyn Meaney");
        String result = student.getName();
        assertEquals("Robyn Meaney", result);
    }

    @Test
    @DisplayName("Set Age is Working in Lecturer")
    public void getSetAge_ReturnsCorrectInput() {
        lecturer.setAge(50);
        int result = lecturer.getAge();
        assertEquals(50, result);
    }

    @Test
    @DisplayName("Date of Birth Returns Date Time Format")
    public void getDOB_ReturnsDateTimeFormat() {
        student.setStudentDOB(new DateTime("11-10-2022"));
        DateTime result = student.getStudentDOB();
        assertEquals(DateTime.parse("11-10-2022"), result);
    }

    @Test
    @DisplayName("Add Module Function Adds to ArrayList")
    public void addModule_addsToArray() {
        lecturer.addModule("CT417");
        lecturer.addModule("EE345");
        ArrayList result = lecturer.getListOfModules();
        assertEquals("CT417 , EE345", result);
    }
}
