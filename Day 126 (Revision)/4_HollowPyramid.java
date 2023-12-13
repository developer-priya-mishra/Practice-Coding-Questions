class HollowPyramid {
    public static void main(String[] args) {
        int number = 5;

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == j || j == 5) {
                    System.out.print("*_");
                } else if (j == i + 1) {
                    System.out.print("__");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}