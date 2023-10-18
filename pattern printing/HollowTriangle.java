class HollowTriangle {
    public static void main(String args[]) {
        int n = 5;
        int i,j;

        // hollow left aligned triangle
        System.out.print("hollow left aligned trianlge\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                if(i == 1 || i == n || j == 1 || j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


        // hollow inverted left aligned triangle
        System.out.print("hollow inverted left aligned triangle\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i+1; j++) {
                if(i == 1 || j == 1 || j == n-i+1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


        // hollow right aligned triangle
        System.out.print("hollow right aligned triangle\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(; j <= n; j++) {
                if(i == n || j == n-i+1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();


        // hollow inverted right aligned triangle
        System.out.print("inverted right aligned triangle\n\n");

        for(i = 1; i <= n; i++) {
            for(j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(; j <= n; j++) {
                if(i == 1 || j == i || j == n) {
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
