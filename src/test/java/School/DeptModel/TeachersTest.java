package School.DeptModel;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeachersTest {
    private static final Teachers teachers = new Teachers("Francis", "Jesse", 47, "male", 27, "Teacher");

    @Test
    public void teachCourse() {
        Course course = new Course("Maths", "MTH101");
        teachers.addCourse(course);
        boolean result = teachers.teachCourse().contains(course);
        assertTrue(result);
    }
}