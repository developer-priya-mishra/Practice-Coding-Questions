import java.util.Scanner;

// A number is called Disarium if sum of its digits powered with their respective positions is equal to the number itself. Example : 1^1 + 3^2 + 5^3 = 135
class DisariumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int tempNum = num;
        int count = 0;
        while (tempNum != 0) {
            count += 1;
            tempNum = tempNum / 10;
        }

        tempNum = num;
        int sum = 0;
        while (tempNum != 0) {
            for (int i = count; i >= 1; i--) {
                int remainder = tempNum % 10;
                double result = Math.pow(remainder, i);
                sum += result;
                tempNum = tempNum / 10;
            }

        }

        if (sum == num) {
            System.out.println(num + " is a Disarium Number");
        } else {
            System.out.println(num + " is not a Disarium Number");
        }

        scan.close();
    }
}
