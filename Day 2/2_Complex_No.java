import java.util.Scanner;

class ComplexNo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first complex no");
        System.out.print("Real no : ");
        double realNo1 = scan.nextDouble();
        System.out.print("Imaginary No : ");
        double imaginaryNo1 = scan.nextDouble();

        System.out.println("Enter second complex no");
        System.out.print("Real no : ");
        double realNo2 = scan.nextDouble();
        System.out.print("Imaginary No : ");
        double imaginaryNo2 = scan.nextDouble();

        scan.close();

        double realNo3 = realNo1 + realNo2;
        double imaginaryNo3 = imaginaryNo1 + imaginaryNo2;
        System.out.println("Sum = " + realNo3 + "+" + imaginaryNo3 + "i");

    }
}

class ComplexNo2 {
    double realNo;
    double imaginaryNo;

    ComplexNo2(double a, double b) {
        this.realNo = a;
        this.imaginaryNo = b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first complex no");
        System.out.print("Real no : ");
        double r1 = scan.nextDouble();
        System.out.print("Imaginary No : ");
        double i1 = scan.nextDouble();

        ComplexNo2 obj1 = new ComplexNo2(r1, i1);

        System.out.println("Enter second complex no");
        System.out.print("Real no : ");
        double r2 = scan.nextDouble();
        System.out.print("Imaginary No : ");
        double i2 = scan.nextDouble();

        ComplexNo2 obj2 = new ComplexNo2(r2, i2);

        ComplexNo2 obj3 = new ComplexNo2(obj1.realNo + obj2.realNo, obj1.imaginaryNo + obj2.imaginaryNo);
        scan.close();
        System.out.println("Sum = " + obj3.realNo + "+" + obj3.imaginaryNo + "i");

    }
}

class ComplexNo3 {
    double real;
    double imaginaryNo;

    ComplexNo3(double r, double i) {
        this.real = r;
        this.imaginaryNo = i;
    }

    ComplexNo3 add(ComplexNo3 other) {
        double sumReal = this.real + other.real;
        double sumImagine = this.imaginaryNo + other.imaginaryNo;
        return new ComplexNo3(sumReal, sumImagine);
    }

    @Override
    public String toString(){
        if(imaginaryNo >=0 ){
            return real + "+" + imaginaryNo + "i";
        }else{
            return real + "-" + (-imaginaryNo) + "i";
        }
    }
}

class ComplexAddition {
    public static void main(String[] args) {
        ComplexNo3 num1 = new ComplexNo3(5, 10);
        ComplexNo3 num2 = new ComplexNo3(4, -12);

        ComplexNo3 sum = num1.add(num2);

        System.out.println("First Complex No : " + num1);
        System.out.println("Second Complex No : " + num2);
        System.out.println("Sum of Complex No : " + sum);
    }
}

class ComplexNo4{
    double real;
    double imaginary;
    ComplexNo4(double r,double i){
        this.real=r;
        this.imaginary=i;
    }

    ComplexNo4 sub(ComplexNo4 other){
        double subReal= this.real - other.real;
        double subImag= this.imaginary - other.imaginary;
        return new ComplexNo4(subReal,subImag);
    }

    @Override
    public String toString(){
        if(imaginary>=0){
            return real+ "+" + imaginary + "i";
        }else{
            return real+ "-" + (-imaginary) + "i";
        }
    }
}

class Subtraction{
    public static void main(String[] args) {
        ComplexNo4 num1= new ComplexNo4(5, 12);
        ComplexNo4 num2 = new ComplexNo4(54, 45);
        
        ComplexNo4 sub= num1.sub(num2);
        System.out.println("First Complex no : "+num1);
        System.out.println("Second Complex No : "+num2);
        System.out.println("Subtraction of Complex No : "+sub);
    }
}
