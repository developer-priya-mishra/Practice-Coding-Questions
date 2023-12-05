class HollowRightTriangle {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0 || i == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
