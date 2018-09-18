package fi.academy.torstai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List <Henkilo> lista = new ArrayList();
        List <Palkansaaja> opet = new ArrayList<>();


//        Henkilo h1 = new Henkilo("Jade", "Paukkunen", 1988);
//        Henkilo h2= new Henkilo("Jemina", "Lehto", 1993);
//        Henkilo h3 = new Henkilo();
//        Henkilo h4 = new Henkilo("kissa", "pissa", 1965);
//        Henkilo h5 = new Henkilo ("koira", "kakka", 1975);
//        Henkilo testi = new Henkilo ("koira", "kakka", 1975);
//
//        lista.add(h1);
//        lista.add(h2);
//        lista.add(h3);
//        lista.add(h4);
//        lista.add(h5);
//
//        Opiskelija op1 = new Opiskelija ("Mau","Mou",1995, 12345);
//        Opiskelija op2 = new Opiskelija("Höpö", "Pöpö", 1732, 3456);
//        lista.add(op1);
//        lista.add(op2);

        Opettaja ope1 = new Opettaja("Kikkeli", "Kakkeli", 1963);
        Palkansaaja ope2 = new Opettaja();
        opet.add(ope2);

        Palkansaaja pertti = new Freelancer("pertti", "porkkana", 1980, 4,20,40);
        opet.add(pertti);


        Palkansaaja emilia = new Freelancer("Emilia", "Kakkanen", 1983, 8, 35, 80);
        opet.add(emilia);

        for (Palkansaaja a:opet) {
            System.out.println(a.laskePalkka());

        }

//        for (Henkilo a:lista){
//         https://stackoverflow.com/questions/212805/in-java-how-do-i-dynamically-determine-the-type-of-an-array

        }

//        Collections.sort(lista, new Sukunimivertailu());
//        System.out.println(lista);
//        Collections.reverse(lista);
//        System.out.println(lista);

//        Collections.sort(lista, new Ikavertailija());
//        System.out.println(lista);
//        Collections.reverse(lista);
//        System.out.println(lista);

//        int indeksi = 0;
//        int ikiensumma = 0;
//        while (indeksi < lista.size()) {
//            int ika = lista.get(indeksi).getIka();
//            ikiensumma = ikiensumma +(ika);
//            indeksi++;
//            System.out.println(ika);
//
//        }
//        System.out.println(ikiensumma);
    }

