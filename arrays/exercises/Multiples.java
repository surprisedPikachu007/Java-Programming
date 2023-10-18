package arrays.exercises;

import java.util.Scanner;

class Multiples {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 1; i <= n; i++) {
            arr[i-1] = n * i;
        }

        System.out.println("Multiples of " + n + " are: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
