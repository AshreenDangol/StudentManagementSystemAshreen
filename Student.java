public class Student{

    public String name;
    public int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println("the name of the student is" + name + ", and the age of the student is  " + age);
    }
    public String getStudents(String name){
        return name;
    }
    public int getAge(int age){
        return age;
    }

public static void main(String[]args)
    {
        Student s = new Student("Ashreen", 21);

        
    };
}