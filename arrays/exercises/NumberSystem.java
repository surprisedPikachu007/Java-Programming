package arrays.exercises;

class NumberSystem {
    public static void main(String[] args) {
        // check whether the elements are in binary or not
        int binary[] = {0,1,0,1,1,0,1,0,1};
        int notBinary[] = {0,1,0,1,1,0,1,0,1,2};
        boolean isBinary = true;

        System.out.println("check whether the elements are in binary or not: ");

        for(int i: binary) {
            if(i != 0 && i != 1) {
                isBinary = false;
                break;
            }
        }
        System.out.println("{0,1,0,1,1,0,1,0,1} -> " + (isBinary ? "binary" : "not binary"));

        isBinary = true;
        for(int i: notBinary) {
            if(i != 0 && i != 1) {
                isBinary = false;
                break;
            }
        }
        System.out.println("{0,1,0,1,1,0,1,0,1,2} -> " + (isBinary ? "binary" : "not binary"));
        System.out.println();

        // check whether the elements are in octal or not
        int octal[] = {5,7,6,3,1,2,4,0,7};
        int notOctal[] = {5,7,6,3,1,2,4,0,7,8};
        boolean isOctal = true;

        System.out.println("check whether the elements are in octal or not: ");
        for(int i: octal) {
            if(i < 0 || i > 7) {
                isOctal = false;
                break;
            }
        }
        System.out.println("{5,7,6,3,1,2,4,0,7} -> " + (isOctal ? "octal" : "not octal"));

        isOctal = true;
        for(int i: notOctal) {
            if(i < 0 || i > 7) {
                isOctal = false;
                break;
            }
        }
        System.out.println("{5,7,6,3,1,2,4,0,7,8} -> " + (isOctal ? "octal" : "not octal"));
        System.out.println();

        // check whether the elements are in hexadecimal or not
        int hexadecimal[] = {5,7,6,3,1,2,4,0,7,10,11,12,13,14,15};
        int notHexadecimal[] = {5,7,6,3,1,2,4,0,7,10,11,12,13,14,15,16};
        boolean isHexadecimal = true;

        System.out.println("check whether the elements are in hexadecimal or not: ");
        for(int i: hexadecimal) {
            if(i < 0 || i > 15) {
                isHexadecimal = false;
                break;
            }
        }
        System.out.println("{5,7,6,3,1,2,4,0,7,10,11,12,13,14,15} -> " + (isHexadecimal ? "hexadecimal" : "not hexadecimal"));

        isHexadecimal = true;
        for(int i: notHexadecimal) {
            if(i < 0 || i > 15) {
                isHexadecimal = false;
                break;
            }
        }
        System.out.println("{5,7,6,3,1,2,4,0,7,10,11,12,13,14,15,16} -> " + (isHexadecimal ? "hexadecimal" : "not hexadecimal"));
        System.out.println();
    }
}
