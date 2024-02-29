class ReplaceAllLineBreakWith {
    public static void main(String[] args) {
        String str = "This\n" + " is\n" + " Spoon\n" + " and\n" + " It\n" + " is\n" + " used\n" + " as\n" + " to\n"
                + " eat\n" + " cake";
        System.out.println(str);

        System.out.println("After replacing all line break : ");
        System.out.println(str.replaceAll("\n", ""));

    }
}
