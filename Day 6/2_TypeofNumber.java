import java.util.Scanner;

class TypeofNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
 
        System.out.print("Enter the no : ");
        float num=scan.nextFloat();

        if(num >= 0){
            System.out.println("No is positive");
        }else{
            System.out.println("No is negative");
        }

        scan.close();
    }
}
