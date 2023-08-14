import java.util.Scanner;

class Equality {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter first no : ");
        int num1=scan.nextInt();

        System.out.print("Enter second no : ");
        int num2=scan.nextInt();
 
        if(num1 == num2){
            System.out.println("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal");
        }
        scan.close();
    }
}
