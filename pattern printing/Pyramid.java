class Pyramid {
    public static void main(String args[]) {
        int n = 5;

        int i,j;

        // pyramid
        System.out.print("pyramid\n\n");
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++) { // for(j = i; j < n; j++) -> this also works
                System.out.print(" ");
            }

            for(j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        // inverted pyramid
        System.out.print("inverted pyramid\n\n");
        for(i = 1; i <= n; i++) {
            for(j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(j = 1; j <= 2*(n-i+1)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
