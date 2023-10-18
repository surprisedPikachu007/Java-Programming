class Diamond {
    public static void main(String args[]) {
        int n = 5;
        int i,j;

        System.out.print("diamond\n\n");
        // pyramid for the first half
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++) { // for(j = i; j < n; j++) -> this also works
                System.out.print(" ");
            }

            for(j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        // inverted pyramid for the second half with n = n-1
        n = n-1;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(j = 1; j <= 2*(n-i+1)-1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
