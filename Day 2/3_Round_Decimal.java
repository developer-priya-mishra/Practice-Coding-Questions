class RoundDecimal {
    public static void main(String[] args) {
        double number = 1245.789469545;
        int n=4;

        //Formula
        number=Math.round(number*Math.pow(10, n))/Math.pow(10, n);
        System.out.println(number);
    }
}

// ** Using Format method -> System.out.format("%.df", number);
class RD2{
    public static void main(String[] args) {
        System.out.format("%.4f",42.87484556);
    }
}
