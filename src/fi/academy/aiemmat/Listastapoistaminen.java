package fi.academy.aiemmat;

import javax.swing.text.AttributeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listastapoistaminen {
    public static void main(String[] args) {
        LinkedList <String> lista = new LinkedList();
        lista.add("maanantai");
        lista.add("tiistai");
        lista.add("torstai");
        lista.add("torstai");
        lista.add("perjantai");
        lista.add("lauantai");
        lista.add("sunnuntai");

        System.out.println(lista);

        List <String> poistettavat = new ArrayList();

        for (String paiva: lista) {
            if (paiva.charAt(0) == 't')
                poistettavat.add(paiva);
        }

        for (String paiva:poistettavat){
            lista.remove(paiva);

        }
        System.out.println(lista);
    }
}
