package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class test03 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("source.txt");
             FileOutputStream out = new FileOutputStream("copy.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
