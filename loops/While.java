class While {
    public static void main(String[] args) {
        // primes in a range
        int n = 100;
        
        while(n > 1) {
            int i = 2;
            while(i < n) {
                if(n % i == 0) {
                    break;
                }
                i++;
            }
            if(i == n) {
                System.out.println(n);
            }
            n--;
        }
    }
}
