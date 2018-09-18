package fi.academy.aiemmat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jarjestaminen {
    public static void main(String[] args) {
        ArrayList<String> viikonpaivat = new ArrayList();
        viikonpaivat.add("maanantai");
        viikonpaivat.add("tiistai");
        viikonpaivat.add("torstai");
        viikonpaivat.add("torstai");
        viikonpaivat.add("perjantai");
        viikonpaivat.add("lauantai");
        viikonpaivat.add("sunnuntai");

        System.out.println(viikonpaivat);

        Collections.sort(viikonpaivat, Comparator.comparing(String::length));

        Collections.reverse(viikonpaivat);
        System.out.println(viikonpaivat);


    }

    public void vertailija(){

    }
}
