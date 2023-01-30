package basics;
class Print {
    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("a = " + a + ", b = " + b); // a = 10, b = 20

        System.out.print("a = " + a); // a = 10
        System.out.println(", b = " + b); // b = 20

        System.out.println("a = " + a + "\nb = " + b); // a = 10
                                                       // b = 20

        System.out.println("a = " + a); // a = 10
        System.out.println("b = " + b); // b = 20

        System.out.println("a + b = " + (a + b)); // a + b = 30
        System.out.println("" + a + " + " + b + " = " + (a + b)); // b = 20

        System.out.println("" + a + b); // b = 20
    }
}
