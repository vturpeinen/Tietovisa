package fi.academy.torstai;

public class Opiskelija extends Henkilo {

    private int opiskelijanumero;

    public Opiskelija(String etunimi, String sukunimi, int svuosi, int opiskelijanumero) {
        super(etunimi, sukunimi, svuosi);
        this.opiskelijanumero = opiskelijanumero;
    }

    public Opiskelija() {
        super();
    }

    public int getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Opiskelija ");
        sb.append(opiskelijanumero).append(" ");
        return sb+super.toString();
    }
}
