package Knjiga;

import java.util.ArrayList;

public class Romanopisac extends Pisac {
    public Romanopisac(String ime, int godina_rodjenja, ArrayList<Knjiga> lista_knjiga) {
        super(ime, godina_rodjenja, lista_knjiga);
    }


    public void DugometrazniRoman () {

        for(int i = 0; i < getLista_knjiga().size(); i++) {
            if (getLista_knjiga().get(i).getBroj_strana() > 500) {
                System.out.println(getLista_knjiga().get(i).getNaslov() + " je dugometrazni roman.");
            }
        }
    }
}
