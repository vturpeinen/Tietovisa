package fi.academy.torstai;

public class Opettaja extends Henkilo implements Palkansaaja {

    public Opettaja(){
        super();
    }
    public Opettaja(String etunimi, String sukunimi, int svuosi){
        super(etunimi, sukunimi, svuosi);

    }

    @Override
    public double laskePalkka() {
        return 17500;
    }
}
