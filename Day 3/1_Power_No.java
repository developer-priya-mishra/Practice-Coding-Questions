import java.util.Scanner;

class PowerNo {
    public static void main(String[] args) {
        int ans = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        System.out.print("Enter the power : ");
        int p = sc.nextInt();
        sc.close();
        for (int i = 1; i <= p; i++) {
            ans *= n;
        }
        System.out.println("Ans : " + ans);
    }
}