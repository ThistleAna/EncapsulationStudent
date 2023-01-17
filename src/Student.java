public class Student {
    // encapsulation
    // describe the student attributes, all in private hidden from user
     private String name; // getName and setName methods
     private int age; // getName and setName methods

    // setter: setting method, no static, no return value
    public void setName(String name) { // passing newName value from Main
        this.name = name; // if parameter passing have same name, use this.name=name
    }

    // as name is private, we have to use method to access it from Main
    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }



}
