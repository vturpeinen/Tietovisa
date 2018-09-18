package fi.academy.aiemmat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Hakemistolistaus {
    public static void main(String[] args){

        try {
            Files.walk(Paths.get("."))
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith("java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
