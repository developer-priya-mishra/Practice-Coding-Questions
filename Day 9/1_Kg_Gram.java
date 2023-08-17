import java.util.Scanner;

class KgToGram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the weight in gram : ");
        int gram = scan.nextInt();

        int kg = gram / 1000;
        int grams = gram % 1000;

        System.out.println("Weight is " + kg + "kg " + grams + "g");

        scan.close();
    }
}