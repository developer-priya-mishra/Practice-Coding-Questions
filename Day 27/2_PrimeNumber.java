import java.util.Scanner;

class PrimeNumber1 {
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
        if (count == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        scan.close();
    }
}

class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isPrimeNumber = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        scan.close();
    }
}

class PrimeNumber3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println(num + " is not a Prime Number");
        } else if (num == 2 || num == 3) {
            System.out.println(num + " is a Prime Number");
        } else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is not a Prime Number");
        } else {
            boolean isPrimeNumber = true;
            for (int i = 5; i < num; i++) {
                if (num % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is not a Prime Number");
            }
        }

        scan.close();
    }
}
