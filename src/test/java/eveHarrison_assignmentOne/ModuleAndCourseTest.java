package eveHarrison_assignmentOne;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ModuleAndCourseTest {

    private Module module;
    private Course course;

    @BeforeEach
    public void SetUp() {
        DateTime sampleDate1 = new DateTime(2022, 9, 03, 04, 06);
        DateTime sampleDate2 = new DateTime(2023, 05, 04, 04, 06);
        module = new Module("CT417", new Lecturer("Michael Scott", 1098, sampleDate1));
        course = new Course("Electronic Engineering", sampleDate1, sampleDate2);
    }

    @Test
    @DisplayName("Get Module Name is Working")
    public void getModuleName_ReturnsCorrectInput() {
        String result = module.getModuleName();
        assertEquals("CT417", result);
    }

    @Test
    @DisplayName("Add Course Function Adds to ArrayList")
    public void addModule_addsToArray() {
        module.addCourses("Electronic Engineering");
        module.addCourses("Energy Systems Engineering");
        ArrayList result = module.getRelatedCourses();
        String resultantString = result.toString();
        assertEquals("[Electronic Engineering, Energy Systems Engineering]" , resultantString);
    }

    @Test
    @DisplayName("End Date in Course Returns Correct Format")
    public void getEndDate_ReturnsDateTimeFormat() {
        course.setEndDate(new DateTime(2022, 9, 3, 4, 6));
        DateTime result = course.getEndDate();
        String resultantString = result.toString();
        assertEquals("2022-09-03T04:06:00.000+01:00", resultantString);
    }
}
