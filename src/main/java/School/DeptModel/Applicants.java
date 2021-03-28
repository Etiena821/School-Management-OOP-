package School.DeptModel;

public class Applicants extends Person{

    //declaration of member variables
    private int examScore;

    public Applicants(String firstName, String lastName, int age, String gender, int examScore) {
        super(firstName, lastName, age, gender);
        this.examScore = examScore;
    }

    // A method that returns admission message based on the given conditions.
    public String admitted() {
        if (this.examScore > 49 && getAge() > 15) {
           return  "Congrats, you've been admitted.";
        } else {
            return  "Sorry, you didn't meet the required conditions.";
        }
    }

    public int getExamScore() {
        return examScore;
    }

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }
}
