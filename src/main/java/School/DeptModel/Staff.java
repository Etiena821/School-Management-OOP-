package School.DeptModel;

public abstract class Staff extends Person {
    //declaration of member variables
    private int id;
    private String designation;

    public Staff(String firstName, String lastName, int age, String gender, int id, String designation) {
        super(firstName, lastName, age, gender);
        this.id = id;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
