import java.util.Scanner;

// A composite number is a natural number which has more than two factors. For example, 15 has factors 1, 3, 5 and 15
class CompositeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }

        if (count >= 3) {
            System.out.println(num + " is a composite number");
        } else {
            System.out.println(num + " is not a composite number");
        }

        scan.close();
    }
}
