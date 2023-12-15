import java.util.Scanner;

class GoldbachNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int arr[] = new int[num];
        int index = 0;
        boolean isPrime = true;
        for (int i = 3; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    arr[index] = i;
                    index++;
                    break;
                }
            }
        }

        boolean isGoldbach = false;
        System.out.println("Goldbach number are ");
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (arr[i] + arr[j] == num) {
                    isGoldbach = true;
                }
            }
        }

        if (isGoldbach) {
            System.out.print(num + " is a goldbach number");
        } else {
            System.out.print(num + " is not a goldbach number");
        }

        scan.close();
    }
}
