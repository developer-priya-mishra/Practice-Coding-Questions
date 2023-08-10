class Color {
    // ANSI codes are used for formatting, colorizing text, changing position when
    // displayed in terminal or console environments.

    // These codes are commonly used in various programming languages, including
    // Java, to enhance the visual appearance of text output in console-based
    // applications.
    public static void main(String args[]) {
        System.out.println("\u001B[31m This is Red color text \u001B[0m");
        System.out.println("\u001B[42m This is green bg \u001B[0m");
        System.out.println("\u001B[1m This text is bold.\u001B[0m");
    }
}