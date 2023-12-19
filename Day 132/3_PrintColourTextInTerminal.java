class PrintColourTextInTerminal {
    public static void main(String[] args) {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String Yellow = "\u001B[33m";

        System.out.println(GREEN + "This is green color" + RESET);
        System.out.println(RED + "This is red color" + RESET);
        System.out.println(Yellow + "This is yellow color" + RESET);

    }
}
