package arrays;

class MergeSort {

    static void merge(int arr[], int l, int m, int r) {
        int i = l, j = m + 1, k = 0;

        int[] temp = new int[r - l + 1];

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= m) {
            temp[k++] = arr[i++];
        }
        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        if (r <= l) {
            return;
        }

        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
    
    public static void main(String args[]) {
        int arr[] = {3,5,2,8,6,1,9,7,4};

        mergeSort(arr, 0, arr.length-1);

        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
