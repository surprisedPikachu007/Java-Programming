package basics;
import java.util.Scanner;

class ScannerExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
/*
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a+b: " + (a+b));

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1.equals(str2) ? "same" : "not same");

        boolean bool = sc.nextBoolean();

        if(bool) {
            System.out.println(bool);
        }*/

        sc.nextLine();
        System.out.print("Enter sentence 1: ");
        String sentence1 = sc.nextLine();
        System.out.println("Enter sentence1 len: " + sentence1.length());
        System.out.print("Enter sentence 2: ");
        String sentence2 = sc.nextLine();
        System.out.println("Enter sentence2 len: " + sentence2.length());

        for(String str : sentence1.split(" ")) {
            System.out.println(str);
        }

        System.out.println("str");

        sc.close();
    }
}
