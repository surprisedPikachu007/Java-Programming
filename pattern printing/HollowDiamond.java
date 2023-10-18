class HollowDiamond {
    public static void main(String args[]) {
        int n = 5;
        int i,j;

        System.out.print("hollow diamond\n\n");
        // hollow pyramid for the first half
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++) { // for(j = i; j < n; j++) -> this also works
                System.out.print(" ");
            }

            for(j = 1; j <= 2*i-1; j++) {
                if(j == 1 || j == 2*i-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // hollow inverted pyramid for the second half with n = n-1
        n = n-1;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(j = 1; j <= 2*(n-i+1)-1; j++) {
                if(j == 1 || j == 2*(n-i+1)-1) {
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
