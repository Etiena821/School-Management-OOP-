package School.DeptModel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrincipalTest {

    private static Principal principal;

    @Test
    public void admitPass() {

        Applicants applicants = new Applicants("Nkechi", "Akpan", 17, "male", 70);
        assertEquals("Congrats, you've been admitted.",applicants.admitted());
    }

    @Test
    public void admitFail() {

        Applicants applicants = new Applicants("Sammy", "Ojo", 10, "male", 42);
        assertEquals( "Sorry, you didn't meet the required conditions.",applicants.admitted());
    }



    @Test
    public void expelStudentTrue() {

        Student student = new Student("Ejiro", "Thomas", 18, "male", 06, (new Classes("ss3 B")));
        principal = new Principal("Akin", "Wahib", 48, "male", 004, "Principal");
        boolean expelStudent = student.getId() == 06;
        assertTrue(expelStudent);
        assertEquals("You are hereby expelled", principal.expel(06));
    }

}