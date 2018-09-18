import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {

        String q1 = "Mikä näistä ei ole String-luokan metodi? \n"
                + " (a) char charAt()\n (b) int length()\n (c) skip() \n";

        String q2 = "Mikä näistä on java.io:n luokka? \n"
                + " (a) Writer\n (b) Printer\n (c) Radio \n";

        String q3 = "Mikä näistä esittää binäärilukua numero 14? \n"
                + " (a) 1110\n (b) 11100\n (c) 101 \n";

        String q4 = "Mitä tarkoittaa serialisointi? \n"
                + " (a) uuden rajapinnan toteuttamista\n (b) olion tilan muuntamista tallennettavaan muotoon\n (c) Kahden olion vertailua \n";

        String q5 = "Mitä tekee keySet()? \n"
                + " (a) Palauttaa kotiavaimesi\n (b) Palauttaa oletusasetukset\n (c) Palauttaa joukon merkkijonoja \n";

        String q6 = "Missä tilanteessa saat NullPointerException-virheen? \n"
                + " (a) Et ole importannut NullPointerExceptionia\n (b) Jos kutsut metodia, joka ei viittaa mihinkään\n (c) Jos haet taulukon ulkopuolella olevaa indeksiä \n";

        String q7 = "Millä lauseella käsittelet poikkeuksen? \n"
                + " (a) try-catch-lauseella\n (b) try-check-lauseella\n (c) try-throw-lauseella \n";

        String q8 = "Jos korvaat kantaluokan metodin, mikä notaatio lisätään tiedostoon? \n"
                + " (a) @Overread\n (b) @Overwrite\n (c) @Override \n";

        String q9 = "Kuinka monta bittiä on float- ja double-tyyppien koko? \n"
                + " (a) 64 bittiä\n (b) 32 bittiä\n (c) 16 bittiä \n";

        String q10 = "Milloin olio syntyy? \n"
                + " (a) Kun se luodaan new-operaattorilla\n (b) Kun sille tekee konstruktorin\n (c) Kun olio kapseloidaan \n";

        String q11 = "Missä Anssi vietti hiihtolomansa muutama vuosi sitten? \n"
                + " (a) Puuhamaassa\n (b) Mount Everestillä\n (c) Himoksella \n";

        Kysymykset[] kysymys = {
                new Kysymykset(q1, "c"),
                new Kysymykset(q2, "a"),
                new Kysymykset(q3, "a"),
                new Kysymykset(q4, "b"),
                new Kysymykset(q5, "c"),
                new Kysymykset(q6, "b"),
                new Kysymykset(q7, "a"),
                new Kysymykset(q8, "c"),
                new Kysymykset(q9, "a"),
                new Kysymykset(q10, "a"),
                new Kysymykset(q11, "c")};

        List<Kysymykset> list = new ArrayList<Kysymykset>(kysymys.length);
        Collections.addAll(list, kysymys);
        Collections.shuffle(list);

        Kysymykset[] kysymyksetKaksi = new Kysymykset[list.size()];
        kysymyksetKaksi = list.toArray(kysymyksetKaksi);

        for (Kysymykset k : kysymyksetKaksi) {

        }

        System.out.println("Tervetuloa parhaimman ryhmän mahtavimpaan tietovisaan!");
        System.out.println("Valitse vaihtoehdoista a, b tai c");
        System.out.println("");
        teeTesti(kysymys);
    }


    public static void teeTesti(Kysymykset [] kysymys) {
        int tulos = 0;
        Scanner lukija = new Scanner(System.in);

        for(int i =  0; i < kysymys.length; i++) {
            System.out.println(kysymys[i].prompt);
            String vastaus = lukija.nextLine();
            if(vastaus.equals(kysymys[i].vastaus)){
                tulos++;
            }
        }
        System.out.println("Tuloksesi!" + tulos + "/" + kysymys.length);
    }
}
