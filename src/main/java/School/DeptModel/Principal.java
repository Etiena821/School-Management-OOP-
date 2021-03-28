package School.DeptModel;

public class Principal extends  Staff {

    public Principal(String firstName, String lastName, int age, String gender, int id, String designation) {
        super(firstName, lastName, age, gender, id, designation);
    }
    // A method that allows the principal to admit new applicants.
    public String admit() {

        Applicants applicants = new Applicants("Daniel", "Okoro", 17, "male", 70);
        System.out.println(applicants.admitted());
        return applicants.admitted();
    }

    // A method that allows the principal to expel a student.
    public String expel(int id) {

        Student student = new Student("Akpos", "Emu", 18, "male", 03, (new Classes("ss1 A")));

        if(student.getId() == 03){
            System.out.println("You have been expelled");
            return "You are hereby expelled";
        }else {
            System.out.println("Wrong student, kindly return to your class");
            return "Wrong student called";
        }
    }
}
