class TrinaglePattern {
    public static void main(String[] args) {
        int n = 5;
        int i,j;

        // left aligned triangle
        System.out.print("left aligned trianlge\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // inverted left aligned triangle
        System.out.print("inverted left aligned triangle\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        // right aligned triangle
        System.out.print("right aligned triangle\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();


        // inverted right aligned triangle
        System.out.print("inverted right aligned triangle\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
