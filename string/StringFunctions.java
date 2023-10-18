package string;

public class StringFunctions {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        s1.concat(" world");
        System.out.println(s1); // Hello - s1 is not modified

        s1 = s1.concat(" world");
        System.out.println(s1); // Hello world - s1 is modified

        System.out.println(s1.charAt(1)); // e - returns the character at index 1

        char ch[] = new char[10];
        s1.getChars(0, 4, ch, 0);
        System.out.println(ch); // Hell - copies the characters from index 0 to 4 to ch

        char ch1[] = new char[10];
        s1.getChars(0, 5, ch1, 3);
        System.out.println(ch1); // \u0000\u0000\u0000Hell - copies the characters from index 0 to 5 to ch1 starting from index 3

        s1.getChars(0, 3, ch1, 0);
        System.out.println(ch1); // HelHello - copies the characters from index 0 to 3 to ch1 starting from index 0 which proves there were null characters in ch1

        char ch2[] = {'W', 'o', 'r', 'l', 'd', '!'};
        s1.getChars(0, 5, ch2, 0);
        System.out.println(ch2); // Hello! - copies the characters from index 0 to 5 to ch2 starting from index 0

        byte b[] = s1.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " "); // 72 101 108 108 111 32 119 111 114 108 100
        }
        System.out.println();

        ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " "); // H e l l o   w o r l d
        }
        System.out.println();

        String s2 = new String("Hello world");
        System.out.println(s1.equals(s2)); // true - compares the content of s1 and s2

        String s3 = new String("hello world");
        System.out.println(s1.equals(s3)); // false - compares the content of s1 and s3
        System.out.println(s1.equalsIgnoreCase(s3)); // true - compares the content of s1 and s3 ignoring the case

        // regionMatches() compares the content of two strings from the specified index
        System.out.println(s1.regionMatches(0, s2, 0, 5)); // true - compares the content of s1 and s2 from index 0 to 5
        System.out.println(s1.regionMatches( 0, s3, 0, 5)); // false - case sensitive
        System.out.println(s1.regionMatches(true, 0, s3, 0, 5)); // true - case insensitive

        // startsWith() and endsWith() checks if the string starts or ends with the specified string
        System.out.println(s1.startsWith("Hello")); // true
        System.out.println(s1.startsWith("llo", 2)); // true - checks if the string starts with "llo" from index 2
        System.out.println(s1.endsWith("world")); // true
    }
}
