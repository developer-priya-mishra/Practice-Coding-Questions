import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first no :");
        int num1= scan.nextInt();
        System.out.print("Enter second no :");
        int num2 = scan.nextInt();

        //Addition
        int sum= num1+num2;
        System.out.println("Addtion of two no :" +sum);

        //Substraction
        int sub= num1-num2;
        System.out.println("Substraction of two no :" +sub);

        //Multiplication
        int mul= num1*num2;
        System.out.println("Multiplication of two no :" +mul);

        //Division
        int div= num1/num2;
        System.out.println("Division of two no :" +div);

        scan.close();
    }
}
