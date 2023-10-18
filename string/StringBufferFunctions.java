package string;

public class StringBufferFunctions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.ensureCapacity(30);
        System.out.println(sb.capacity());

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        sb.ensureCapacity(44);
        System.out.println(sb.capacity());

        sb.replace(2, 4, "r");
        System.out.println(sb);

        sb.insert(2, "ll");
        System.out.println(sb);
    }
}
