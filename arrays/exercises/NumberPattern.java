package arrays.exercises;

class NumberPattern {
    public static void main(String[] args) {
        // left aligned triangle of array elements
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <= i && k < arr.length; j++) {
                System.out.print(arr[k] + " ");
                k++;
            }
            System.out.println();
        }
    }
}
