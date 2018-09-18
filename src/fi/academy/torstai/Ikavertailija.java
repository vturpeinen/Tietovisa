package fi.academy.torstai;

import java.util.Comparator;

public class Ikavertailija implements Comparator <Henkilo> {

    @Override
    public int compare (Henkilo a, Henkilo b) {
        int ia = a.getIka();
        int ib = b.getIka();
        int paluuarvo = 0;
        if (ia < ib){
            paluuarvo = -1;
        }else if (ia>ib){
            paluuarvo = 1;
        }
        return paluuarvo;
    }

}
