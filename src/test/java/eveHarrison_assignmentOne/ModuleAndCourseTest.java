package eveHarrison_assignmentOne;

import org.joda.time.DateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ModuleAndCourseTest {

    private Module module;
    private Course course;


    @Test
    @DisplayName("Get Module Name is Working")
    public void getModuleName_ReturnsCorrectInput() {
        String result = module.getModuleName();
        assertEquals("CT417", result);
    }

    @Test
    @DisplayName("Add Course Function Adds to ArrayList")
    public void addModule_addsToArray() {
        module.addCourses(new Course("Electronic Engineering", null, null));
        ArrayList result = module.getRelatedCourses();
        assertEquals("Electronic Engineering" , result);
    }

    @Test
    @DisplayName("End Date in Course Returns Correct Format")
    public void getEndDate_ReturnsDateTimeFormat() {
        course.setEndDate(new DateTime(2022, 9, 3, 4, 6));
        DateTime result = course.getEndDate();
        assertEquals("03-09-2022", result);
    }
}
