class TypeCasting {
    public static void main(String args[]) {
        // ** Integer to Long
        // Implicit typeCasting or Automatically typeCasting
        int intNum1 = 5;
        long longNum1 = intNum1;
        System.out.println("After converting into long :" + longNum1);

        // ** Long to Integer
        long longNum2 = 999999999;
        if (longNum2 >= Integer.MIN_VALUE && longNum2 <= Integer.MAX_VALUE) {
            // Explicitly typeCasting or Manual typeCasting or Forcefull typeCasting
            int intNum2 = (int) longNum2;
            System.out.println("After converting into int :" + intNum2);
        } else {
            System.out.println("Values is out of range");
        }

        // ** Integer to Double
        int intNum3 = 45478454;
        if (intNum3 >= Double.MIN_VALUE && intNum3 <= Double.MAX_VALUE) {
            double doubleNum1 = (double) intNum3;
            System.out.println("After converting into double :" + doubleNum1);
        } else {
            System.out.println("Value out of range");
        }

        // ** Double to Integer
        double doubleNum2= 84512524515685425.6878451;
        if(doubleNum2>=Integer.MIN_VALUE && doubleNum2<=Integer.MAX_VALUE){
            int intNum4= (int) doubleNum2;
            System.out.println("After cnverting into integer :"+intNum4);
        }else{
            System.out.println("Value out of range");
        }

        // ** Integer to Boolean
        int intNum5 = 7845125;
        if (intNum5 != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // ** Boolean to integer
        boolean bool = true;
        int intNum6 = bool ? 1 : 0;
        System.out.println(intNum6);

    }
}
