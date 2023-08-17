import java.util.Scanner;

class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the character : ");
        char str = scan.next().toLowerCase().charAt(0);

        if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u') {
            System.out.println("This is vowel");
        } else {
            System.out.println("This is consonant");
        }

        scan.close();
    }
}