package basics;
class Operator {
    public static void main(String args[]) {
        // Unary
        // postfix
        int a = 1, b = 2;
        System.out.println(a+++a); // a++ + a = 1 + 2 = 3
        System.out.println(b---b); // b-- - b = 2 - 1 = 1

        // prefix
        a = 1; b = 2;
        System.out.println(++a+a); // ++a + a = 2 + 2 = 4
        System.out.println(--b-b); // --b - b = 1 - 1 = 0

        a = 1; b = 2;
        System.out.println(-a++); // -1 => a = 2
        System.out.println(-b--); // -2 => b = -3

        a = 1;
        System.out.println(~a); // -(a+1) => -(1+1) -2
        System.out.println(~-a); // -(a+1) => -(-1+1) => 0

        System.out.println(a == ~~a); // 1 = ~(-(1+1)) => ~(-2) => -(-2+1) => -(-1) => 1


        // Shift
        a = 2;

    }
}
