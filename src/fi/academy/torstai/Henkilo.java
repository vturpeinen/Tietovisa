package fi.academy.torstai;

import java.util.Calendar;
import java.util.Objects;

public class Henkilo implements Comparable <Henkilo>{//


    private String etunimi;
    private String sukunimi;
    private int svuosi;


    public Henkilo(String etunimi, String sukunimi, int svuosi) {
        this.etunimi = etunimi;
        this.sukunimi=sukunimi;
        this.svuosi=svuosi;

    }

    public Henkilo() {
        this.etunimi = "default-Jaska";
        this.sukunimi = "Jokunen";
        this.svuosi = 1950;

    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public int getIka() {
        int nykyvuosi = Calendar.getInstance().get(Calendar.YEAR);
        int ika = nykyvuosi - svuosi;
        return ika;
    }
    public int getSvuosi(){
        return svuosi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public void setSvuosi(int svuosi) {
        if (svuosi >=0){
            this.svuosi = svuosi;
        }else{
            this.svuosi=0;
        }

    }

    @Override
    public String toString(){
        return etunimi+" "+sukunimi+" "+svuosi;
    }

    @Override
    public boolean equals(Object o) {
        Henkilo h = (Henkilo)o;
        if (this.etunimi == null ? h.etunimi == null : this.etunimi.equalsIgnoreCase(h.etunimi)) return true;
        return false;
    }



    @Override
    public int hashCode() {
        return Objects.hash(etunimi, sukunimi, svuosi);
    }

    @Override
    public int compareTo(Henkilo o) {

        return this.svuosi - o.svuosi;
    }

}

