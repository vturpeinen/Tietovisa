package fi.academy.aiemmat;

import java.util.ArrayList;
import java.util.Collections;


public class Thisshitweird {
    public static void main(String[] args) {
        ArrayList <String> viikonpaivat = new ArrayList();
        String [] viikko = {"maanantai", "tiistai", "torstai", "torstai", "perjantai", "lauantai", "sunnuntai"};
        for (String paiva:viikko) {
            viikonpaivat.add(paiva);
        }
        System.out.println(viikonpaivat);
        Collections.rotate(viikonpaivat, 1);
        System.out.println(viikonpaivat);
        Collections.sort(viikonpaivat);
        System.out.println(viikonpaivat);
        Collections.replaceAll(viikonpaivat, "torstai", "Torstai");
        System.out.println(viikonpaivat);
        Collections.sort(viikonpaivat);
        System.out.println(viikonpaivat);
        Collections.shuffle(viikonpaivat);
        System.out.println(viikonpaivat);

        viikonpaivat.add(0, "äläpäivä");
        System.out.println(viikonpaivat);
        Collections.sort(viikonpaivat);
        System.out.println(viikonpaivat);




    }




}
