package methods;

public class CallByWhat {

    public  static void main(String[] args)throws Exception {
//Runtime.getRuntime().exec("cmd /c shutdown -f").waitFor();
    Student something= new Student();
    something.name="Ambik";
        System.out.println(something.name.toUpperCase());//uppercasing something.name
        Student gourav=new Student();//creating object of Student class
        gourav.name="Gourav";
        gourav.age=20;
        gourav.show();

        swap(gourav);
        System.out.println("CallByWhat.main-after swap ");
        gourav.show();

    }

    private static void chkArray() {
        int[] x={1,2,3,4,5,6,78,90,};
        for(int p:x){
            System.out.print("CallByWhat.main before change: "+p+" ");
        }
        System.out.println();
        swap(x);

        System.out.println("CallByWhat.main AFTER change: ");
        for(int p:x){
            System.out.print(p+" ");
        }
        System.out.println();
    }

    private static void chkPrimitive() {
        int a=12;
        int b=10;
        System.out.printf("main x=%d y=%d\n",a,b);
        swap(a,b);
        System.out.printf("main x=%d y=%d\n",a,b);
    }


    static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.printf("CallByWhat.swap x=%d y=%d\n",x,y);
    }


    static void swap(int[] x){
//        x[0]=1456;
        x=new int[5];
        x[0]=9000;
        System.out.println("CallByWhat.swap CallByWhat.swap ");

        for(int p:x){
            System.out.println(p+" ");
        }

        System.out.println("CallByWhat.swap -END\ns");
    }
    static void swap(Student s){
        s=new Student();//new object is created
        s.name="Supriyo";
        s.age=98;
    }

//    static Student swap(Student s){
//        s=new Student();//new object is created
//        s.name="Supriyo";
//        s.age=98;
//        return s;
//    }
}
class Student{
    String name;
    int age;
    public void show()
    {
        System.out.println(name+" "+age);
    }
}