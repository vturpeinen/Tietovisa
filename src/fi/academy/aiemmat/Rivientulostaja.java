package fi.academy.aiemmat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

import static java.util.Arrays.asList;

public class Rivientulostaja {
    public static void main(String[] args)throws Exception {
//        try {
//            Files.walk(Paths.get("C:\\Users\\jadem\\IdeaProjects\\Jihuu"))
//                    .filter(Files::isRegularFile)
//                    .filter(p -> p.getFileName().toString().endsWith("txt"))
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        File file = new File("C:\\Users\\jadem\\IdeaProjects\\Jihuu\\kissa.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        String st;
        int laskuri = 0;
        int pituus = 0;
        int sanojenMaara =0;

        while ((st = br.readLine()) != null){

            pituus = pituus + st.length();
            System.out.println(st);
            ++laskuri;
            sanojenMaara = sanojenMaara + st.split(" ").length;

        }

        System.out.println("");
        System.out.println("Rivien lukumäärä: "+laskuri );
        System.out.println("Merkkien määrä: "+pituus);
        System.out.println("Sanojen määrä: " +(laskuri+sanojenMaara));




    }
}
