class NameHaving8Charaters {
    public static void main(String[] args) {
        String str[] = { "Aragon", "Gandolf", "MarkZukerberg", "Elvish", "BillGates", "Frodo", "Aryabhata" };

        System.out.print("Students having character less than 8 character : ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < 8) {
                System.out.print(str[i] + ", ");
            }
        }
    }
}
