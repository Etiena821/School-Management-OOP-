package School.DeptModel;

public class Student extends Person {

    //declaration of member variables
    private int id;
    private Classes classRoom;


    public Student(String firstName, String lastName, int age, String gender, int id, Classes classRoom) {
        super(firstName, lastName, age, gender);
        this.id = id;
        this.classRoom = classRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // A method that gets the name of the class room.
    public String getClassName() {
        return classRoom.getClassName();
    }

    public Classes getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Classes classRoom) {
        this.classRoom = classRoom;
    }
}

