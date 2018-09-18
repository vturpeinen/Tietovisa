package fi.academy.aiemmat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tekstilukija {
    public static void main(String[] args)throws Exception {
        try {
            Files.walk(Paths.get("C:\\Users\\jadem\\IdeaProjects\\Jihuu"))
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith("txt"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Valitse tulostettava tiedosto:");
        String komento = scanner.nextLine();

        if (komento.contains("kissa")){
            File file = new File("C:\\Users\\jadem\\IdeaProjects\\Jihuu\\kissa.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }
        if (komento.contains("koira")){
            File file = new File("C:\\Users\\jadem\\IdeaProjects\\Jihuu\\koira.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }
        if (komento.contains("hevonen")){
            File file = new File("C:\\Users\\jadem\\IdeaProjects\\Jihuu\\hevonen.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }


    }
}
