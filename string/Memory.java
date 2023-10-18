package string;

public class Memory {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true - both s1 and s2 refer to the same string literal in SCP

        String s3 = "Hello world";
        String s4 = s1 + " world";
        System.out.println(s3 == s4); // false - runtime undecidability

        final String s5 = "Hello";
        String s6 = s5 + " world";
        System.out.println(s3 == s6); // true - decidable at runtime

        String s7 = new String("Hello");
        String s8 = new String("Hello");
        System.out.println(s7 == s8); // false - both s7 and s8 refer to different objects in heap

        System.out.println(s7.equals(s8)); // true - both s7 and s8 have the same content
    }
}
