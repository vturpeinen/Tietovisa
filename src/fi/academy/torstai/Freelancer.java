package fi.academy.torstai;

public class Freelancer extends Henkilo implements Palkansaaja{

    private int tyotunnit;
    private int tuntipalkka;
    private int veroprosentti;
    private int etunimi;
    private int sukunimi;
    private int svuosi;

    public Freelancer(){
        super();
    }
    public Freelancer(String etunimi, String sukunimi, int svuosi, int tyotunnit, int veroprosentti, int tuntipalkka){
        super(etunimi, sukunimi, svuosi);
        this.tuntipalkka=tuntipalkka;
        this.tyotunnit=tyotunnit;
        this.veroprosentti=veroprosentti;

    }

    public int getTyotunnit() {
        return tyotunnit;
    }

    public void setTyotunnit(int tyotunnit) {
        this.tyotunnit = tyotunnit;
    }

    public int getTuntipalkka() {
        return tuntipalkka;
    }

    public void setTuntipalkka(int tuntipalkka) {
        this.tuntipalkka = tuntipalkka;
    }

    public int getVeroprosentti() {
        return veroprosentti;
    }

    public void setVeroprosentti(int veroprosentti) {
        this.veroprosentti = veroprosentti;
    }
    @Override
    public double laskePalkka() {
        double paivapalkka = tyotunnit*tuntipalkka*1.0;
        double palkka = paivapalkka-(paivapalkka*0.01*veroprosentti);
        return palkka;
    }

    @Override
    public String toString() {
    return super.toString();
    }
}
