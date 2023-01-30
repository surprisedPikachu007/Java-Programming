package basics;
class DataTypes {
  static double si;
  public static void main(String args[]) {
    byte b = 127;
    System.out.println("byte: " + b);

    short s = 32767;
    System.out.println("s: " + s);

    int i = 2147483647;
    System.out.println("i: " + i);

    long l = 9223372036854775807L;
    System.out.println("l: " + l);

    float f = 3.40282347e+38f;
    System.out.println("f: " + f);

    char c = 32767;
    System.out.println("char: " + c);

    boolean bool = true;
    System.out.println("boolean: " + bool);

    int in = 0b01+1+0x10+010; // takes decimal equivalent values
    System.out.printf("hex: %x\n",in); // can use format specifer

  }
}
