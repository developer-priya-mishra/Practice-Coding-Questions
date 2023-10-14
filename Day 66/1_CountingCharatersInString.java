class CountingCharatersInString {
    public static void main(String[] args) {
        String name[] = { "Ram", "Sita", "Priya", "NawNath", "Reena", "Chhabinath", "Satyam" };

        System.out.print("Names having less than 8 character in name : ");
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() < 8) {
                System.out.print(name[i] + ", ");
            }
        }
    }
}