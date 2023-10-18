class Switch {
    public static void main(String[] args) {
        // 5 examples of switch statements

        // 1
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 2
        int num = 65;
        switch(num) {
            default:
                System.out.println(num);
                break;
        }   


        // 3
        switch(2) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Default");
        }
    }
}
