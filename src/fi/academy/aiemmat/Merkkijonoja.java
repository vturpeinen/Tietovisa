package fi.academy.aiemmat;

import java.util.ArrayList;
import java.util.LinkedList;

public class Merkkijonoja {
    public static void main(String[] args) {
        LinkedList <String> lista = new LinkedList<>();
        lista.add("Ville");
        lista.add("Galle");
        lista.add("Jare");
        lista.add("Antti");
        lista.add("Sanni");

        System.out.println(lista);

        int indeksi = 0;
        while (indeksi < lista.size()){
            System.out.println(lista.get(indeksi));
            indeksi++;

        }
    }
}
