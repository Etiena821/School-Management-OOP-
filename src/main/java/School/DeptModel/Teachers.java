package School.DeptModel;

import java.util.ArrayList;
import java.util.List;

public class Teachers extends Staff{

    // ArrayList<Course> is initialized in order to create new courses.
    private final ArrayList<Course> myCourse =  new ArrayList<Course>();

    public Teachers(String firstName, String lastName, int age, String gender, int id, String designation) {
        super(firstName, lastName, age, gender, id, designation);
    }

    // A method that allows the teacher add a course to the ArrayList.
    public void addCourse(Course course){
        myCourse.add(course);
    }

    // This returns all the courses a teacher is teaching.
    public List<Course> teachCourse() {
        return myCourse;
    }
}
