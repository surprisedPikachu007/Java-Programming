package string;

public class StringTest {
    public static void main(String[] args) {
        System.out.println(isDouble("blahblah"));
    }

    static boolean isGmail(String str) {
        if(str.endsWith("gmail.com")) {
            return true;
        }

        return false;
    }

    static boolean decode(String str) {
        byte[] b = str.getBytes();
        byte[] org = {97, 97, 97, 97};

        for(int i = 0; i < b.length; i++) {
            if(b[i] != org[i]) {
                return false;
            }
        }

        return true;
    }

    static boolean hasFirstName(String str, String firstName) {
        if(str.regionMatches(true, 0, firstName, 0, firstName.length())) {
            return true;
        }

        return false;
    }

    static boolean hasDuplicates(String str, char ch) {
        if(str.indexOf(ch) == str.lastIndexOf(ch)) {
            return false;
        }

        return true;
    }

    static boolean isDouble(String str) {
        int n = str.length();
        int mid = n/2;

        if(str.substring(0, mid).equals(str.substring(mid, n))) {
            return true;
        }

        return false;
    }
}
