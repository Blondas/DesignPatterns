package headFirst.c_DecoratorPattern.InputStream;

import java.io.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = TestClass.class.getClassLoader();
        File inputFile = new File(classLoader.getResource("textInput.txt").getFile());

        int c;

        try {
            InputStream in =
                new LowerCaseInputStream(
                    new BufferedInputStream(
                        new FileInputStream(inputFile)
                    )
                );

            while((c = in.read()) >= 0) {
                System.out.println((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
