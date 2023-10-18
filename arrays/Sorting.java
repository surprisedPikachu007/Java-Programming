package arrays;

class Sorting {
    public static void main(String args[]) {
        int arr[] = {3,5,2,8,6,1,9,7,4};
        int tempArr[] = arr.clone();

        // sort in ascending order
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("ascending order: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // sort in descending order
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("descending order: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

		// sort even indices and odd indices separately {3,5,2,8,6,1,9,7,4} -> {2,1,3,5,4,7,6,8,9}
        arr = tempArr.clone();
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(i%2 == 0 && j%2 == 0) {
                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                else if(i%2 != 0 && j%2 != 0) {
                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        System.out.print("even indices and odd indices separately: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }        
        System.out.println();
        
    }
}
