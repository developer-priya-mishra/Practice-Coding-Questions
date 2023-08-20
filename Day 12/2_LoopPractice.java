class LoopPractice1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = i;
            System.out.println(sum);
        }
    }
}

class LoopPractice2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // int sum = 0;
            int sum = i;
            System.out.println(sum);
        }
    }
}

class LoopPractice3 {
    public static void main(String[] args) {

        // int sum = 1;
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            // sum=sum*i;
            // sum *= i; factorial
            sum += i; // sum of natural numbers
        }
        System.out.println(sum);
    }
}