class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Fibonacci Series of first 10 series are 0, 1, ");

        int a = 0;
        int b = 1;

        for (int i = 1; i < 10; i++) {
            int c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}
