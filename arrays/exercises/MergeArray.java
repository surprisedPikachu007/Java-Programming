package arrays.exercises;

class MergeArray {

    static int[] merge(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,5,6,9};
        int arr3[] = merge(arr1, arr2);
        for(int i: arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
