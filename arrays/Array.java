package arrays;

class Array {
    public static void main(String[] args) {
        // int a[]; 
        // System.out.println(a.length); // The local variable a may not have been initialized

        int a[] = {};
        System.out.println(a.length); // 0

        // int a2[][];
        // System.out.println(a2.length); // The local variable a may not have been initialized
        int a2[][] = {{1}};
        System.out.println(a2.length); // 1

        /*
         * valid
         * 
         * int a[]; not initialized
         * int[] a;
         * int a[];
         * int []a;
         * int [] a;
         * int[] a = {1,2,3};
         */

        /*
         * invalid
         * int a[5];
         * int[5] a;
         */

        /*
         * multi-dimensional array
         * valid
         * int a[][]; not initialized
         * int a[][] = new int[5][];
         * int a[][][] = new int[5][5][];
         * int[] a[];
         * int[] a[],b; // a -> 2d, b -> 1d
         * int[] a[],b[] // a -> 2d, b -> 2d
         * int[] []a,b; // a->2d, b->2d\
         * int[] []a[],b; // a -> 3d, b -> 2d 
         * 
         * invalid
         * int a[5][];
         * int a[][5];
         * int a[][] = new int[][5];
         * int a[][][] = new int[5][][5];
         */

         /*
          * jagged array
          * int a[][] = new int[5][];
          * a[0] = new int[5];
          * a[1] = new int[2];
          * .
          * .
          * .
          */

          /*
           * only integer values can be used to specify size of array - byte, short, char, int
           * integer range : -2147483648 to 2147483647
           * int a[] = new int[2147483647]; valid but 'OutOfMemoryError' might occur at runtime 
           * int a[] = new int[-5]; valid but 'NegativeArraySizeException' occurs at runtime
           */

           /*
            * length
            * int a[] -> a.length
            * String a -> a.length()
            * String a[] -> a.length
            */
    }
}
