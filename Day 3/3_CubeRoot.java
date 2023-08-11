import java.util.Scanner;

class CubeRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no : ");
        int num= sc.nextInt();
        int res= num*num*num;
        System.out.println("Cube root of "+ num+ " is "+res);
        sc.close();
    }
}
