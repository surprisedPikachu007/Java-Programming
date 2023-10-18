package arrays.exercises;

public class Matrix
{
    static int[][] copyMatrix(int arr[][]) {
        int res[][] = new int[arr.length][];
        for(int i=0; i<arr.length; i++) {
            res[i] = new int[arr[i].length];
            for(int j=0; j<arr[i].length; j++) {
                res[i][j] = arr[i][j];
            }
        }
        
        return res;
    }
    
    static int[][] addMatrix (int a[][], int b[][]) {
        int res[][] = new int[a.length][];
        for(int i=0; i<a.length; i++) {
            res[i] = new int[a[i].length];
            for(int j=0; j<a[i].length; j++) {
                res[i][j] = a[i][j]+b[i][j];
            }
        }
        
        return res;
    }
    
    static int[][] subtractMatrix (int a[][], int b[][]) {
        int res[][] = new int[a.length][];
        for(int i=0; i<a.length; i++) {
            res[i] = new int[a[i].length];
            for(int j=0; j<a[i].length; j++) {
                res[i][j] = a[i][j]-b[i][j];
            }
        }
        
        return res;
    }

    //static int[][] transpose(int arr[][]) {
        
    //}
    
    
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = copyMatrix(a);

        for(int[] i: b) {
            for(int j: i) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        for(int i = 0; i < a.length; i++) {
            int sum = 0;

            for(int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            System.out.println("Sum of row " + (i+1) + ": " + sum);
        }
	}
}
