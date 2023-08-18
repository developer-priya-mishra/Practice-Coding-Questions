import java.util.Scanner;

class Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the character : ");
        char character = scan.next().toLowerCase().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("Character is alphabet");
        } else {
            System.out.println("Character is not alphabet");
        }

        scan.close();
    }
}