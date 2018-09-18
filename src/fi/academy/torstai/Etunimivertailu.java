package fi.academy.torstai;

import java.util.Comparator;

    public class Etunimivertailu implements Comparator<Henkilo> {

        @Override
        public int compare (Henkilo a, Henkilo b) {
            String ia = a.getEtunimi();
            String ib = b.getEtunimi();
            int result = ia.compareToIgnoreCase(ib);
            return result;
        }

    }

