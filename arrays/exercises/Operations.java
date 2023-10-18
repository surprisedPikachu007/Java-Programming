package arrays.exercises;

import java.util.Scanner;

class Operations {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // index of an element
        int arr[] = {3,5,2,8,6,1,9,7,4};
        int element = 8;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                index = i;
                break;
            }
        }
        System.out.println("index of " + element + ": " + index);
        System.out.println();

        // average of elements
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        System.out.println("average of elements: " + (sum/arr.length));
        System.out.println();

        // max, min, second max, second min
        int max = arr[0];
        int min = arr[0];
        int secondMax = arr[0];
        int secondMin = arr[0];
        for(int i: arr) {
            if(i > max) {
                secondMax = max;
                max = i;
            }
            else if(i > secondMax) {
                secondMax = i;
            }

            if(i < min) {
                secondMin = min;
                min = i;
            }
            else if(i < secondMin) {
                secondMin = i;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("second max: " + secondMax);
        System.out.println("second min: " + secondMin);
        System.out.println();

        // occurrences of an element
        int arr2[] = {1,2,5,6,4,5,7,4,9,5};
        int occurrences = 0;
        element = 5;
        for(int i: arr2) {
            if(i == element) {
                occurrences++;
            }
        }
        System.out.println("occurrences of " + element + ": " + occurrences);
        System.out.println();

        // report missing elements in an array
        int arr3[] = {1,2,3,5,6,7,8,10};
        int prev = arr3[0];
        for(int i = 1; i < arr3.length; i++) {
            if(arr3[i] - 1 != prev) {
                System.out.println("missing element: " + (prev + 1));
            }
            prev = arr3[i];
        }
        System.out.println();

        // print array in matrix form
        int arr4[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("enter column length: ");
        int col = sc.nextInt();
        for(int i = 0; i < arr4.length; i++) {
            if(i % col != 0) {
                System.out.print(arr4[i] + " ");
            }
            else {
                System.out.println();
                System.out.print(arr4[i] + " ");
            }
        }
        System.out.println();
    }
}
