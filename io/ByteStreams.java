import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("input.txt");
            fos = new FileOutputStream("output.txt");

            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } catch (IOException ioe) {
            System.out.println("IOException" + ioe);
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
