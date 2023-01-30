package basics;

public class VarArgs {
    static void display(int ...i) {
        for(int x: i) {
            System.out.print(x + " ");
        }
    }

    static void display(String s, int ...i) {
        for(int x: i) {
            System.out.print(x + " ");
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        display(1,2,3);
        display("s");
    }
}
