package Knjiga;

public class Knjiga {
    private String naslov;
    private int broj_strana;
    private int godina_izdavanja;

    public Knjiga(String naslov, int broj_strana, int godina_izdavanja) {
        this.naslov = naslov;
        this.broj_strana = broj_strana;
        this.godina_izdavanja = godina_izdavanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBroj_strana() {
        return broj_strana;
    }

    public void setBroj_strana(int broj_strana) {
        this.broj_strana = broj_strana;
    }

    public int getGodina_izdavanja() {
        return godina_izdavanja;
    }

    public void setGodina_izdavanja(int godina_izdavanja) {
        this.godina_izdavanja = godina_izdavanja;
    }

    public String toString () {
        return "Naziv knjige: " + naslov + ", broj strana: " + broj_strana + ", godina izdavanja: " + godina_izdavanja;
    }
}
