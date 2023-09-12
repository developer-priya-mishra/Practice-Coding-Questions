import java.util.Random;

class RandomNumber1 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(1000);
        System.out.println("Random integers : " + num1);

        float num2 = random.nextFloat();
        System.out.println("Random float : " + num2);

        double num3 = random.nextDouble();
        System.out.println("Random double : " + num3);

    }
}

// Math a methods i.e, random(), this method returns a double value with a
// positive sign, greater than or equal to 0.0 and less than 1.0.

class RandomNumber2 {
    public static void main(String[] args) {

        System.out.println("Random double : " + Math.random());
    }
}