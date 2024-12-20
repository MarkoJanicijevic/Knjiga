package Knjiga;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Knjiga StaracIMore = new Knjiga("Starac i More", 99, 1951);
        Knjiga KraljAlkohol = new Knjiga ("Kralj Alkohol", 550, 1913);
        Knjiga NocULisabonu = new Knjiga("Noc u Lisabonu", 33, 1965);

        ArrayList<Knjiga> k = new ArrayList<>();
        k.add(StaracIMore);
        k.add(KraljAlkohol);
        k.add(NocULisabonu);


        Romanopisac r = new Romanopisac("Ernest Hemingvej", 1901, k);
        Pesnik p = new Pesnik("Dzek London", 1900, k);
        Eseista e = new Eseista("Erik Maria Remark", 1902, k);


        System.out.println(r.vremePisanja());
        r.DugometrazniRoman();
        System.out.println(p.BrojZbirki());
        System.out.println(e.BrojEseja());




        
    }
}
