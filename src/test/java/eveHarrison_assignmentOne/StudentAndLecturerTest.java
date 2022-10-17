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
        student.setAge(21);
        String result = student.getUserName();
        assertEquals("Eve Harrison21", result);
    }

    @Test
    @DisplayName("Get Username is Working For Lecturer")
    public void getUsernameLecturer_ReturnsCorrectInput() {
        lecturer.setAge(50);
        String result = lecturer.getUserName();
        assertEquals("Michael Scott50", result);
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
        student.setStudentDOB(new DateTime(2000, 11, 29, 4, 20));
        DateTime result = student.getStudentDOB();
        String resultantString = result.toString();
        assertEquals(("2000-11-29T04:20:00.000Z"), resultantString);
    }

    @Test
    @DisplayName("Add Module Function Adds to ArrayList")
    public void addModule_addsToArray() {
        Module newModule = new Module("CT417", new Lecturer("Michael", 105567, null));
        ArrayList<Module> lecturersModules = new ArrayList<>();
        lecturer.addModule(newModule);
        lecturersModules.add(newModule);
        assertEquals(lecturersModules, lecturer.getListOfModules());
        assertEquals(newModule, lecturer.getListOfModules().get(0));
        assertTrue(lecturer.removeModule(newModule));
        assertTrue(lecturer.getListOfModules().isEmpty());

    }
}
