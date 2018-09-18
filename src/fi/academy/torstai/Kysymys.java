package fi.academy.torstai;

import java.util.HashMap;

public class Kysymys {

    private String kysymys;
    private HashMap <Integer, String> kaikkiVastaukset;
    private HashMap<Integer,String> oikeatVastaukset;

    public Kysymys(String kysymys, HashMap <Integer, String> kaikkiVastauksetVastaukset, HashMap<Integer, String> oikeatVastaukset){
        this.kysymys = kysymys;
        this.kaikkiVastaukset = kaikkiVastaukset;
        this.oikeatVastaukset = oikeatVastaukset;

    }

    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }

    public HashMap<Integer, String> getOikeatVastaukset() {
        return kaikkiVastaukset;
    }

    @Override
    public String toString() {
        String s1 = "Oikea vastaus tai vastaukset: ";
        StringBuilder sb = new StringBuilder(s1);
        for (Integer key:this.getOikeatVastaukset().keySet()) {
            sb.append(this.getOikeatVastaukset().get(key) + " ");
        }
        return sb.toString();
    }
}
