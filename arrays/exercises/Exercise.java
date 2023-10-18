package arrays.exercises;

class Exercise {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        // print odd numbers
        System.out.println("odd numbers: ");
        for(int i: arr) {
            if(i%2==1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // odd indices in reverse
        System.out.println("odd indices in reverse: ");
        for(int i = arr.length-1; i >= 0; i--) {
            if(i%2==1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");

        // second half and first half
        System.out.println("second half and first half: ");
        for(int i=arr.length/2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i < arr.length/2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // reverse second half reverse first half
        System.out.println("reverse second half reverse first half: ");
        for(int i=arr.length-1; i > arr.length/2; i--) {
            System.out.print(arr[i] + " ");
        }
        for(int i=arr.length/2; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        
        // sum of adjacent indices - 0 + 1, 2 + 3
        System.out.println("sum of adjacent indices: ");
        for(int i = 0; i < arr.length; i+=2) {
            if(i == arr.length-1) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
            else {
                System.out.println("arr[" + i + "]" + " + " + "arr[" + (i+1) + "] = " + (arr[i] + arr[i+1]));
            }
        }

        // sum of alternate indices - 0 + 2, 1 + 3
        System.out.println("sum of alternate indices: ");
        for(int i = 0; i < arr.length; i++) {
            if(i < arr.length-2) {
                System.out.println("arr[" + i + "]" + " + " + "arr[" + (i+2) + "] = " + (arr[i] + arr[i+2]));
            }
            else {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }

        // even indices staright, odd indices reverse
        System.out.println("even indices staright, odd indices reverse: ");
        for(int i = 0; i < arr.length; i++) {
            if(i%2==0) {
                System.out.print(arr[i] + " ");
            }
        }
        for(int i = arr.length-1; i >= 0; i--) {
            if(i%2==1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");

        // odd indices staright, even indices reverse
        System.out.println("odd indices staright, even indices reverse: ");
        for(int i = 0; i < arr.length; i++) {
            if(i%2==1) {
                System.out.print(arr[i] + " ");
            }
        }
        for(int i = arr.length-1; i >= 0; i--) {
            if(i%2==0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");

        // if odd index add with next index else add with previous index
        System.out.println("if odd index add with next index else add with previous index: ");
        for(int i = 0; i < arr.length; i++) {
            if(i%2==1) {
                if(i == arr.length-1) {
                    System.out.println("arr[" + i + "] = " + arr[i]);
                }
                else {
                    System.out.println("arr[" + i + "]" + " + " + "arr[" + (i+1) + "] = " + (arr[i] + arr[i+1]));
                }
            }
            else {
                if(i == 0) {
                    System.out.println("arr[" + i + "] = " + arr[i]);
                }
                else {
                    System.out.println("arr[" + i + "]" + " + " + "arr[" + (i-1) + "] = " + (arr[i] + arr[i-1]));
                }
            }
        }
        System.out.println("\n");

        // count of multiples of 3
        System.out.println("count of multiples of 3: ");
        int count = 0;
        for(int i: arr) {
            if(i%3==0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();

        Sort.fun();
    }
}

class Sort {
    static void fun() {
        int arr[] = {3,5,2,8,6,1,9,7,4};

        // sort first half in ascending order and second half in descending order
        for(int i = 0; i < arr.length/2-1; i++) {
            for(int j = i+1; j < arr.length/2; j++) {
                if(arr[i] > arr[j]) {
                    utils.Sorting.swap(arr, i, j);
                }
            }
        }

        for(int i = arr.length/2; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    utils.Sorting.swap(arr, i, j);
                }
            }
        }


        System.out.println("first half in ascending order and second half in descending order: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

