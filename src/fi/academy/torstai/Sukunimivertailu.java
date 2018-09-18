package fi.academy.torstai;
import java.util.Comparator;

//https://www.tutorialspoint.com/java/java_string_compareto.htm

public class Sukunimivertailu implements Comparator<Henkilo>{

        @Override
        public int compare (Henkilo a, Henkilo b) {
            String ia = a.getSukunimi();
            String ib = b.getSukunimi();
            int result = ia.compareToIgnoreCase(ib);
            return result;

        }

    }