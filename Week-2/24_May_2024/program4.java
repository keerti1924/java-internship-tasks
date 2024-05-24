// 4. WAP to Add two Complex Numbers in Java. 

class Complex{
    int real, imaginary;
    public Complex(int real, int imaginary){ 
        this.real=real;
        this.imaginary=imaginary;
    }
    public String GetValue(){
        return real + " + " + imaginary + "i";
    }
    public static Complex Add(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.real=c1.real+c2.real;
        c3.imaginary=c1.imaginary+c2.imaginary;
        return c3;
    } 
}

public class program4{
    public static void main(String[] args) {

        Complex a = new Complex(5,4);
        Complex b = new Complex(7,2);
        Complex c = Complex.Add(a,b);

        System.out.println("Value of a = " + a.GetValue());
        System.out.println("Value of b = " + b.GetValue());
        System.out.println("Addition of a and b = " + c.GetValue());
    }
}


 


