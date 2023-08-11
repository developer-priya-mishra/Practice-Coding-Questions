import java.util.Scanner;

class SP {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the selling price : ");
        int sp= scan.nextInt();
        System.out.print("Enter the cost price : ");
        int cp= scan.nextInt();
        if(sp>cp){
            int profit=sp-cp;
            System.out.println("Profit is :"+profit +"Rs");
        }else{
            System.out.println("There is no profit");
        }
        scan.close();
    }
}
