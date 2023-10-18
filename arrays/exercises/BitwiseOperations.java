package arrays.exercises;

class BitwiseOperations {

    static int[] bitwiseAnd(int arr1[], int arr2[]) {
        int res[] = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i] && arr1[i] == 1) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

    static int[] bitwiseOr(int arr1[], int arr2[]) {
        int res[] = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 1 || arr2[i] == 1) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

    static int[] bitwiseXor(int arr1[], int arr2[]) {
        int res[] = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i]) {
                res[i] = 0;
            } else {
                res[i] = 1;
            }
        }
        return res;
    }

    static int[] bitwiseComplement(int arr1[]) {
        int res[] = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 0) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

    static int[] bitwiseLeftShift(int arr1[], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr1.length - 1; j++) {
                arr1[j] = arr1[j + 1];
            }
            arr1[arr1.length - 1] = 0;
        }
        return arr1;
    }

    static int[] bitwiseRightShift(int arr1[], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = arr1.length - 1; j > 0; j--) {
                arr1[j] = arr1[j - 1];
            }
            arr1[0] = 0;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int and[] = bitwiseAnd(new int[]{1, 0, 1, 1}, new int[]{1, 1, 1, 0});
        System.out.println("Bitwise AND: ");
        for(int i = 0; i < and.length; i++) {
            System.out.print(and[i]);
        }
        System.out.println();

        int or[] = bitwiseOr(new int[]{1, 0, 1, 1}, new int[]{1, 1, 1, 0});
        System.out.println("Bitwise OR: ");
        for(int i = 0; i < or.length; i++) {
            System.out.print(or[i]);
        }
        System.out.println();

        int xor[] = bitwiseXor(new int[]{1, 0, 1, 1}, new int[]{1, 1, 1, 0});
        System.out.println("Bitwise XOR: ");
        for(int i = 0; i < xor.length; i++) {
            System.out.print(xor[i]);
        }
        System.out.println();

        int comp[] = bitwiseComplement(new int[]{1, 0, 1, 1});
        System.out.println("Bitwise Complement: ");
        for(int i = 0; i < comp.length; i++) {
            System.out.print(comp[i]);
        }
        System.out.println();

        int leftShift[] = bitwiseLeftShift(new int[]{1, 0, 1, 1}, 2);
        System.out.println("Bitwise Left Shift: ");
        for(int i = 0; i < leftShift.length; i++) {
            System.out.print(leftShift[i]);
        }
        System.out.println();

        int rightShift[] = bitwiseRightShift(new int[]{1, 0, 1, 1}, 2);
        System.out.println("Bitwise Right Shift: ");
        for(int i = 0; i < rightShift.length; i++) {
            System.out.print(rightShift[i]);
        }
        System.out.println();
    }
}
