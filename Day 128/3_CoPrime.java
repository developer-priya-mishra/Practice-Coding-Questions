import java.util.Scanner;

class CoPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scan.nextInt();

        int arr1[] = new int[num1];
        int arr2[] = new int[num2];

        int index1 = 0;
        for (int i = 2; i <= num1; i++) {
            if (num1 % i == 0) {
                arr1[index1] = i;
                index1++;
            }
        }

        int index2 = 0;
        for (int i = 2; i <= num2; i++) {
            if (num2 % i == 0) {
                arr2[index2] = i;
                index2++;
            }
        }

        boolean isCoPrime = true;
        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                if (arr1[i] == arr2[j]) {
                    isCoPrime = false;
                    break;
                }
            }
        }

        if (isCoPrime) {
            System.out.print(num1 + " and " + num2 + " are Co-Prime number");
        } else {
            System.out.print(num1 + " and " + num2 + " are not Co-Prime number");
        }

        scan.close();
    }
}
