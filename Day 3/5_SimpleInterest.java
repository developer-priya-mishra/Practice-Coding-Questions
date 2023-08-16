import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {
        float p, r, t, sp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the rate : ");
        r = scan.nextFloat();
        System.out.print("Enter the time : ");
        t = scan.nextFloat();
        sp = (p * r * t) / 100;
        scan.close();
        System.out.println("Simple interest is : " + sp);
    }
}
