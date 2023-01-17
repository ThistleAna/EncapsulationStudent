// Encapsulation : all setting inside the method
public class Main {
    public static void main(String[] args) {
        // create student object s
        Student s1 = new Student(); // accsess Student class and create object called s1
        s1.setName("Gloria");
        s1.setAge(23);
        System.out.println("Student number 1 :");
        System.out.println("Name: " + s1.getName() + " Age: " + s1.getAge());


        // create student  object s2 - Waheeb

        Student s2 =new Student();
        s2.setName("Tom");
        s2.setAge(20);
        System.out.println("Student number 2 :");
        System.out.println("Name: " + s2.getName() + " Age: " + s2.getAge());


        // create student object 3 - Aloka
        Student s3 = new Student();
        s3.setName("Maria");
        s3.setAge(19);
        System.out.println("Student number 3 :");
        System.out.println("Name: " + s3.getName() + " Age: " + s3.getAge());


        // create student object 4 - Eva
        Student s4 = new Student();
        s4.setName("Edward");
        s4.setAge(22);
        System.out.println("Student s4 is" + s4.getAge () + " old and is called" + s4.getName ());

        // create student object 5 - Emma
        Student s5 = new Student();
        s5.setName("Emma");
        s5.setAge(34);
        System.out.println("Student s5 age is " + s5.getAge () + "Student name is" + s5.getName ());



        // create student object 6 - Abidemi
        Student s6 = new Student ();
        s6.setName ("Abidemi");
        s6.setAge (24);
        System.out.println("Student s6 age is " + s6.getAge() + "Student name is" + s6.getName ());
    }
}
