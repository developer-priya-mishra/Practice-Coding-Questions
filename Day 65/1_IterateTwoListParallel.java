class IterateTwoListParallel {
    public static void main(String[] args) {
        String name[] = { "Ram", "Sita", "Mata", "Pita" };
        int age[] = { 44, 54, 78, 69 };

        if (name.length == age.length) {
            for (int i = 0; i < name.length; i++) {
                System.out.println("Age of " + name[i] + " is " + age[i]);
            }
        } else {
            System.out.println("Something went wrong");
        }
    }
}