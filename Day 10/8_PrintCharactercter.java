import java.util.Scanner;

class PrintCharactercter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (char character = 'A'; character <= 'Z'; character++) {
            System.out.println(character);
        }

        scan.close();
    }
}
