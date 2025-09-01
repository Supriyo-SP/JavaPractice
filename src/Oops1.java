class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Oops1 {
    public static void main(String[] args) {


   Student s1= new Student();
   s1.name="Sani";
   s1.age=16;
   s1.printInfo();
}
}
