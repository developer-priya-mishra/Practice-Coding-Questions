class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String x : args) {
                System.out.println("Arguments are " + x);
            }
        } else {
            System.out.println("No argument");
        }
    }
}
