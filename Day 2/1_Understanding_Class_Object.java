class Add1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}

// ------------------------------------------------------------------------------------
class Add2 {
    int a;
    int b;

    // initializing instance data members a, b using constructor
    Add2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Add2 obj = new Add2(10, 20);
        System.out.println(obj.a + obj.b);
    }
}

// ------------------------------------------------------------------------------------
class Add3 {
    int a;
    int b;

    // initializing instance data members a, b using instance member method
    void addNo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Add3 obj = new Add3();
        obj.addNo(10, 20);
        System.out.println(obj.a + obj.b);
    }
}

class Add4 {
    static int a;
    static int b;

    // initializing static data members a, b using static member method
    static void addNo(int a, int b) {
        Add4.a = a;
        Add4.b = b;
    }

    public static void main(String[] args) {
        Add4.addNo(10, 20);
        System.out.println(Add4.a + Add4.b);

        addNo(10, 20);
        System.out.println(a + b);
    }
}

class AddUsing4 {
    public static void main(String[] args) {
        Add4.addNo(40, 50);
        System.out.println(Add4.a + Add4.b);
    }
}