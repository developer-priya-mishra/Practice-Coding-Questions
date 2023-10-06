import java.util.Scanner;

// Co prime numbers are those numbers that have only one common factor, namely 1.

class HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scan.nextInt();

        int arr1[] = new int[num1];
        int arr2[] = new int[num2];

        int index1 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                arr1[index1] = i;
                index1 += 1;
            }
        }

        int index2 = 0;
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                arr2[index2] = i;
                index2 += 1;
            }
        }

        int count = 0;
        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                if (arr1[i] == arr2[j]) {
                    count += 1;
                }
            }
        }

        if (count == 1) {
            System.out.println(num1 + " and " + num2 + " are co-prime no");
        } else {
            System.out.println(num1 + " and " + num2 + " are not a co-prime no");
        }
        scan.close();
    }
}
