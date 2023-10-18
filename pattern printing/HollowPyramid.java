class HollowPyramid {
    public static void main(String args[]) {
        int n = 5;

        int i,j;

        // hollow pyramid
        System.out.print("hollow pyramid\n\n");
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++) { // for(j = i; j < n; j++) -> this also works
                System.out.print(" ");
            }

            for(j = 1; j <= 2*i-1; j++) {
                if(i == n || j == 1 || j == 2*i-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();

        // inverted hollow pyramid
        System.out.print("inverted hollow pyramid\n\n");
        for(i = 1; i <= n; i++) {
            for(j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(j = 1; j <= 2*(n-i+1)-1; j++) {
                if(i == 1 || j == 1 || j == 2*(n-i+1)-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
