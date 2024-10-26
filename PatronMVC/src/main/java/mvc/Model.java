package mvc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model {
    private String name;
    private int age;

    public Model() {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
