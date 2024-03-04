package _3_decorator.upperCase_decorator;

import java.io.*;

public class Test {
    private static String path = "C:\\Users\\admin\\Desktop\\pattrens\\src\\main\\java\\_3_decorator\\upperCase_decorator\\app.txt";

    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(path)));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
