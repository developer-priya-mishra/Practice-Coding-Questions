class CheckStringIsNoOrNot {
    public static void main(String[] args) {
        String s = "201.245";

        System.out.println(s + 2);
        System.out.println(Integer.parseInt(s));
        System.out.println(Integer.decode(s));

        char ch[] = s.toCharArray();
        double number = 0;

        boolean isNumber = true;
        int dotCount = 0;
        double decimalMultipler = 0.1;
        int baseMultipler = 1;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '.') {
                dotCount++;
                continue;
            }

            else if (dotCount > 1) {
                isNumber = false;
                System.out.println("This string is not a number");
                break;
            }

            else if (ch[i] >= '0' && ch[i] <= '9') {
                if (dotCount == 1) {
                    baseMultipler *= 10;
                    number = number + (ch[i] - 48) * (decimalMultipler * 1) / baseMultipler;
                } else {
                    number = number * 10.0 + ch[i] - 48;
                }
            }

            else {
                isNumber = false;
                System.out.println("This string is not a number");
                break;
            }

        }

        if (isNumber) {
            System.out.println("This string is a number: " + number);
        }
    }
}
