import java.util.Scanner;

// Pronic number is a number which is the product of two consecutive integers. Eg, n = x * (x+1).
// sqrt(n)*(sqrt(n)+1)=n

class PronicNumber1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isPronicNumber = false;
        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                isPronicNumber = true;
                break;
            }
        }
        if (isPronicNumber) {
            System.out.println(num + " is a Pronic Number");
        } else {
            System.out.println(num + " is not a Pronic Number");
        }

        scan.close();
    }
}

class PronicNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int squareRoot = (int) Math.sqrt(num);

        if (squareRoot * (squareRoot + 1) == num) {
            System.out.println(num + " is a Pronic Number");
        } else {
            System.out.println(num + " is not a Pronic Number");
        }

        scan.close();
    }
}