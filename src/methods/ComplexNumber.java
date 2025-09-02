package methods;

public class ComplexNumber {
    public static void main() {
    Complex a=new Complex(2,3);
    Complex b=new Complex(1,2);
       Complex sum=a.add(b);
       Complex sub=a.sub(b);
       sum.display();
       sub.display();
    }

}
class Complex{
    int real;
    int imag;
 Complex(int r ,int i){
     real=r;
     imag=i;
 }
 Complex add(Complex c){
     return new Complex(this.real + c.real,this.imag+c.imag);
 }
    Complex sub(Complex c){
        return new Complex(this.real - c.real,this.imag-c.imag);
    }
 void display(){
        System.out.println(real+"+"+"i*"+ imag);
    }
}