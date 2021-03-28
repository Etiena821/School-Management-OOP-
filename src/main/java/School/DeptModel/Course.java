package School.DeptModel;

import java.util.ArrayList;

public class Course {

    //declaration of member variables
    private String Name;
    private String Code;


    public Course(String name, String code) {
        this.Name = name;
        this.Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
}

