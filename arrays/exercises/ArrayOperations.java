package arrays.exercises;

class ArrayOperations {

    static void delete(int arr[], int element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                for(int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
    }

    static void insert(int arr[], int index, int element) {
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }

    static void moveElementsToFront(int arr[], int element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                int temp = arr[i];
                for(int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
    }

    static void moveElementsToBack(int arr[], int element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                int temp = arr[i];
                for(int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
    }

    static int[] union(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        int dupes = 0;

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr3.length; j++) {
                if(arr1[i] == arr3[j]) {
                    dupes++;
                    break;
                }
                if(j == arr3.length - 1) {
                    arr3[k++] = arr1[i];
                }
            }
            
        }

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr3.length; j++) {
                if(arr2[i] == arr3[j]) {
                    dupes++;
                    break;
                }
                if(j == arr3.length - 1) {
                    arr3[k++] = arr2[i];
                }
            }
        }

        int res[] = new int[arr3.length - dupes];
        for(int i = 0; i < res.length; i++) {
            res[i] = arr3[i];
        }

        return res;
    }

    static int[] intersection(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        int length = 0;

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    arr3[k++] = arr1[i];
                    length++;
                    break;
                }
            }
        }

        int res[] = new int[length];
        for(int i = 0; i < res.length; i++) {
            res[i] = arr3[i];
        }

        return res;
    }

    static int[] uniqueElements(int arr[]) {
        int arr3[] = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            int k = 0;  
            for(int j = 0; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                    k++;    
                }
            }  
            if(k == 1) {
                arr3[count++] = arr[i];
            }
        }  

        int res[] = new int[count];
        for(int i = 0; i < res.length; i++) {
            res[i] = arr3[i];
        }
        
        return res;
    }

    static int[] nonUniqueElements(int arr[]) {
        int arr3[] = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                    arr3[count++] = arr[i];    
                }
            }  
        }  

        int res[] = new int[count];
        for(int i = 0; i < res.length; i++) {
            res[i] = arr3[i];
        }

        return res;
    }

    static int[] leftShift(int arr[], int n) {
        int temp[] = arr.clone();

        for(int i = 0; i < arr.length - n; i++) {
            arr[i] = arr[i + n];
        }

        for(int i = arr.length - n, j = 0; i < arr.length; i++, j++) {
            arr[i] = temp[j];
        }

        return arr;
    }

    static int[] rightShift(int arr[], int n) {
        int temp[] = arr.clone();

        for(int i = arr.length - 1; i >= n; i--) {
            arr[i] = arr[i - n];
        }

        for(int i = 0, j = arr.length - n; i < n; i++, j++) {
            arr[i] = temp[j];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("array: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        delete(arr, 5);
        System.out.print("array after deleting 5: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        insert(arr, 4, 5);
        System.out.print("array after inserting 5 at index 4: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int arr2[] = {1,5,2,3,2,5,2};
        moveElementsToFront(arr2, 5);
        System.out.print("array after moving all 5s to the front: ");
        for(int i: arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int arr3[] = {1,5,2,3,2,5,2};
        moveElementsToBack(arr3, 5);
        System.out.print("array after moving all 5s to the back: ");
        for(int i: arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        int union[] = union(new int[]{1,2,4,5,6}, new int[]{2,3,5,7});
        System.out.print("union: ");
        for(int i: union) {
            System.out.print(i + " ");
        }
        System.out.println();

        int intersection[] = intersection(new int[]{1,2,4,5,6}, new int[]{2,3,5,7});
        System.out.print("intersection: ");
        for(int i: intersection) {
            System.out.print(i + " ");
        }
        System.out.println();

        int unique[] = uniqueElements(new int[]{1,2,4,5,6,2,3,5,7});
        System.out.print("unique elements: ");
        for(int i: unique) {
            System.out.print(i + " ");
        }
        System.out.println();

        int nonUnique[] = nonUniqueElements(new int[]{1,2,4,5,6,2,3,5,7});
        System.out.print("non-unique elements: ");
        for(int i: nonUnique) {
            System.out.print(i + " ");
        }
        System.out.println();

        int leftShift[] = leftShift(new int[]{1,2,3,4,5}, 3);
        System.out.print("array after left shifting by 3: ");
        for(int i: leftShift) {
            System.out.print(i + " ");
        }
        System.out.println();

        int rightShift[] = rightShift(new int[]{1,2,3,4,5}, 3);
        System.out.print("array after right shifting by 3: ");
        for(int i: rightShift) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
