package basics;
class ForEach {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        int arr2D[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i[] : arr2D) {
            for(int j : i) {
                System.out.print(j + " ");
            }
        }
    }    
}
