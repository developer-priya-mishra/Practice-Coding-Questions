class Pyramid {
    public static void main(String[] args) {
        int number = 5;

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= number; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}