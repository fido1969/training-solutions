package week12d4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma {

    public void printSecret(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                System.out.print(c);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String printSecretWithStringBuilder(Path path) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                sb.append(c);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sb.toString();
    }

    public String printSecretWithBestSolutionStringPieced(Path path) {
        StringBuilder sb = new StringBuilder();

        try (InputStream is = Files.newInputStream(path)) {
            byte[] buffer = new byte[1000];
            int size;
            while ((size = is.read(buffer)) > 0) {
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i] + 10);
                    sb.append(c);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new Enigma().printSecret(Path.of("secret.dat"));

        String reslt = new Enigma().printSecretWithStringBuilder(Path.of("secret.dat"));
        System.out.println(reslt);

        String reslt1 = new Enigma().printSecretWithBestSolutionStringPieced(Path.of("secret.dat"));
        System.out.println(reslt1);


    }
}