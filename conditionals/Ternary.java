package conditionals;

class Ternary {
    public static void main(String[] args) {
        // max
        int a = 1, b = 2, c = 3;
        int max = a>b ? a>c ? a : c : b;
        System.out.println("max: " + max);

        // min
        int min = a<b ? a<c ? a : c : b;
        System.out.println("min: " + min);

        // abs diff
        int diff = a-b;
        int absDiff = diff<0 ? -diff : diff;
        System.out.println("abs diff: " + absDiff);

        // sign
        String sign = a>0 ? "positive" : a<0 ? "negative" : "zero";
        System.out.println("sign: " + sign);

        // isEven
        boolean isEven = a%2==0 ? true : false;
        System.out.println("isEven: " + isEven);

        // isOdd
        boolean isOdd = a%2==0 ? false : true;
        System.out.println("isOdd: " + isOdd);
    }
}
