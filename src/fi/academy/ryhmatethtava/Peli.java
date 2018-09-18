package fi.academy.ryhmatethtava;

/**
 * --------------- Known problems: ---------------
 *
 * 1. LueKysymyksetJaVastauksetTiedostosta()-metodin outofbounds ongelma,
 * joka on paikattu väliaikaisesti metodissa valitseKysymykset().
 * 2. Yksikin oikea vastaus oikeiden vastausten joukosta riittää "oikeaan vastaukseen".
 * 3. Komentorivitulostuksessa IntelliJ:ssä ei näy rivinvaihdot.
 * 4. Virhe-tarkistusta ei ole tehty jokaiseen vaiheeseen - esim. käyttäjän antaman vastauksen
 * kohdalla ei tarkisteta, onko vastaus int-tyyppinen.
 *
 * --------------- In future updates: ---------------
 *
 * 1. Lisätään oikeanVastauksenTarkistaminen()-metodiin usean vastauksen kehittyneempi käsittely
 * sekä pisteenlaskun kehittyneempi versio, joka laskee osittaisista vastauksista osittaiset pisteet.
 * 2. Lisätään kysymysten numerointi.
 * 3. Lisätään mahdollisuus keskeyttää peli.
 * 4. Tehdään vähän sivistyneemmät Java-aiheiset kysymykset. ;)
 * 5. Lisäluokka, joka sisältää kysymystenkirjoitussovelluksen opettajille, jotka haluavat valmistaa
 * pelin omilla kysymyksillään.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Peli {
    private List <Kysymys> kaikkiKysymykset;
    private List <Kysymys> valitutKysymykset;
    private List <Integer> vastattu;
    private double pisteet = 0;

    public Peli() {
        this.kaikkiKysymykset = new ArrayList<>();
        this.valitutKysymykset = new ArrayList<>();
    }

    public double getPisteet() {
        return pisteet;
    }

    // Testaamista varten getterit
    public List<Kysymys> getKaikkiKysymykset(){
        return this.kaikkiKysymykset;
    }

    public List<Kysymys> getValitutKysymykset() {
        return this.valitutKysymykset;
    }

    public void kysymyksenLisays(Kysymys uusi){
        this.kaikkiKysymykset.add(uusi);
    }

    /** Shufflaa tiedoston kaikkien kysymysten listaa ja valitsee niistä 10 ensimmäistä pelin kysymyksiksi. */
    public void valitseKysymykset(){
        Collections.shuffle(this.kaikkiKysymykset); // muuttaako listaa pysyvästi?
        for (int i = 0; i<11; i++){
            this.valitutKysymykset.add(this.kaikkiKysymykset.get(i));
        }
    }

    /** Käyttäjän input-metodi, joka kysyy vastausvaihtoehtoja ja tallentaa annetut vastaukset palautettavaan listaan. */
    public List<Integer> kysyVastausta(){
        Scanner lukija = new Scanner(System.in);

        List<Integer> vastattu = new ArrayList<>();
        System.out.println("Syötä vastaus/vastaukset (välilyönti vastausten välissä mikäli useita): ");
        while (true) {
            String sisalto = lukija.nextLine();
            if ("".equals(sisalto)) {
                break;
            }
            String [] numerot = sisalto.split(" ");
            for (String numero : numerot) {
                int num = Integer.parseInt(numero);
                vastattu.add(num);
            }
        }
        return vastattu;
    }

    /** Lukee tiedostosta oikeassa muodossa esitetyt kysymykset ja vastaukset Stringiin (kysymys) ja HashMappiin (vastaukset),
     * jotka tallennetaan luokka-attribuuttiin kaikkiKysymykset.
     */
    public void lueKysymyksetJaVastauksetTiedostosta(String tiedostonNimi) {
        System.out.println("Luetaan kysymykset tiedostosta...");


        // hyödynnetty aiemman tehtävän esimerkkikoodia
        try (FileReader fr = new FileReader(tiedostonNimi);
             BufferedReader reader = new BufferedReader(fr)) {
            String rivi;
            while((rivi = reader.readLine()) != null) {
                String kysymys = "";
                HashMap<Integer, String> kaikkiVastaukset = new HashMap<>();
                HashMap<Integer, String> oikeatVastaukset = new HashMap<>();
                ArrayList<String> rivinSisalto = new ArrayList<>();
                String rivi2;
                // testaaaaaa:
                rivinSisalto.add(rivi);
                while((rivi2 = reader.readLine()) != null) {
                    rivinSisalto.add(rivi2);
                    if (rivi2.isEmpty()) {
                        break;
                    }
                }
                kysymys = rivinSisalto.get(0);
                for (int i = 1; i < rivinSisalto.size()-1; i++) {
                    if (rivinSisalto.get(i) != null) {
                        if (rivinSisalto.get(i).charAt(0) == '@'){
                            String tamarivi = rivinSisalto.get(i);
                            String [] rivinosat = tamarivi.split("@");
                            for (int key : kaikkiVastaukset.keySet()) {
                                if (rivinosat[1].equals(kaikkiVastaukset.get(key))) {
                                    oikeatVastaukset.put(key, rivinosat[1]);
                                }
                            }
                            
                        } else {
                            kaikkiVastaukset.put(i, rivinSisalto.get(i));
                        }
                    }
                }

                Kysymys kysymys1 = new Kysymys(kysymys, kaikkiVastaukset, oikeatVastaukset);
                kysymyksenLisays(kysymys1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /** Tarkistaa, löytyykö käyttäjän antama vastaus tai jokin vastauksista mapista oikeita vastauksia.
     * Nykyisessä versiossa yhteen pisteeseen riittää, että yksi vastauksista on oikein. */
    public void oikeanVastauksenTarkistaminen(Kysymys nykyinen, List <Integer> annetutVastaukset){
        for (int vastaus:annetutVastaukset) {
            for(Integer key:nykyinen.getOikeatVastaukset().keySet()){
                if (vastaus == key){
                    System.out.println("Vastasit oikein!");
                    lisaaPiste();
                }
            }
        }
        System.out.println(nykyinen);
    }

    public void lisaaPiste(){
        this.pisteet++;
    }

    public void tulostaPistaat() {
        System.out.println("Kokonaispistemäärä: " + this.getPisteet() + "/10.0");
    }

    // KESKEN
    public void pelaaPelia(){
        System.out.println("Alustetaan peli...");
        lueKysymyksetJaVastauksetTiedostosta("./src/fi/academy/ryhmatethtava/kysymykset.txt");
        valitseKysymykset(); // tässä kohtaa kusee jokin asia! ottaa 12 elementtiä, ei 10
        System.out.println("---- Tervetuloa pelaamaan! ----");
        for (Kysymys kysymys:valitutKysymykset) {
            System.out.println(kysymys.getKysymys());
            List<Integer> vastaukset = kysyVastausta();
            oikeanVastauksenTarkistaminen(kysymys, vastaukset);

        }

        tulostaPistaat();
    }

}


