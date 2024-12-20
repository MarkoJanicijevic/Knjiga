package Knjiga;

import java.util.ArrayList;

public class Pisac {
    private String ime;
    private int godina_rodjenja;
    private ArrayList<Knjiga> lista_knjiga;

    public Pisac(String ime, int godina_rodjenja, ArrayList<Knjiga> lista_knjiga) {
        this.ime = ime;
        this.godina_rodjenja = godina_rodjenja;
        this.lista_knjiga = lista_knjiga;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodina_rodjenja() {
        return godina_rodjenja;
    }

    public void setGodina_rodjenja(int godina_rodjenja) {
        this.godina_rodjenja = godina_rodjenja;
    }

    public ArrayList<Knjiga> getLista_knjiga() {
        return lista_knjiga;
    }

    public void setLista_knjiga(ArrayList<Knjiga> lista_knjiga) {
        this.lista_knjiga = lista_knjiga;
    }

    public String toString () {
        return "Ime pisca: " + ime + ", godina rodjenja: " + godina_rodjenja + ", lista knjiga: " + lista_knjiga;
    }

    public String najpoznatijaKnjga () {
        int max_strana = lista_knjiga.get(0).getBroj_strana();
        int index = 0;
        for (int i = 0; i < lista_knjiga.size(); i++) {
            if (lista_knjiga.get(i).getBroj_strana() > max_strana) {
                max_strana = lista_knjiga.get(i).getBroj_strana();
                index = i;
            }
        }
        return lista_knjiga.get(index).getNaslov();
    }

    public int vremePisanja () {
        int najstarija_godina = lista_knjiga.get(0).getGodina_izdavanja();

        for (int i = 0; i < lista_knjiga.size(); i++) {
            if (lista_knjiga.get(i).getBroj_strana() < najstarija_godina) {
                najstarija_godina = lista_knjiga.get(i).getBroj_strana();

            }
        }

        int najmladja_godina = lista_knjiga.get(0).getGodina_izdavanja();
        for (int i = 0; i < lista_knjiga.size(); i++) {
            if (lista_knjiga.get(i).getBroj_strana() > najmladja_godina) {
                najmladja_godina = lista_knjiga.get(i).getBroj_strana();

            }
        }

        return najmladja_godina - najstarija_godina;


    }

}
