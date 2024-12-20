package Knjiga;

import java.util.ArrayList;

public class Pesnik extends Pisac {
    public Pesnik(String ime, int godina_rodjenja, ArrayList<Knjiga> lista_knjiga) {
        super(ime, godina_rodjenja, lista_knjiga);
    }

    public int BrojZbirki () {
        int brojac = 0;
        for (int i = 0; i < getLista_knjiga().size(); i++) {
            if (getLista_knjiga().get(i).getBroj_strana() < 100) {
                brojac++;
            }
        }
        return brojac;
    }

}
