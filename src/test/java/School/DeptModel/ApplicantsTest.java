package School.DeptModel;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class ApplicantsTest {
    private static Applicants applicants;

    @Test
    public void admittedPass() {
        applicants = new Applicants("Mark", "Urmukoro", 19, "male", 80);
        boolean isUpToAge = applicants.getAge() > 15;
        assertTrue(isUpToAge);
        boolean passBy50 = applicants.getExamScore() > 49;
        assertTrue(passBy50);

        assertEquals("Congrats, you've been admitted.", applicants.admitted());
    }

    @Test
    public void admittedFail() {
        applicants = new Applicants("Mark", "Urmukoro", 14, "male", 30);
        boolean isUpToAge = applicants.getAge() > 15;
        assertFalse(isUpToAge);
        boolean passBy50 = applicants.getExamScore() > 49;
        assertFalse(passBy50);

        assertEquals("Sorry, you didn't meet the required conditions.", applicants.admitted());
    }
}