package conditionals;

class Conditionals {
    public static void main(String[] args) {
        // if - only takes boolean values
        int a = 1, b = 2;
        if(a>b) {
            System.out.println("a>b");
        } else if(a<b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }

        // ternary - ?:
        int c = a>b ? a : b;
        System.out.println("max: " + c);
    }
}
