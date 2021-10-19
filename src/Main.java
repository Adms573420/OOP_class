import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Arac almanya = new Arac();
        almanya.setMarka("BMW");
        almanya.setRenk("Beyaz");
        almanya.setModel(2020);
        almanya.setFiyat(100000);
        // Arac alman = new Arac("Audi", "Siyah", 2021, 100000);
       // Arac alman4 = new Arac("Opel", "Gri", 2015, 45000);
       // Arac alman2 = new Arac("Mercedes", "Beyaz", 2020, 72000);
       // Arac alman3 = new Arac("Wolswagen", "Kirmizi", 2010, 50000);*/

        DortIslem islem=new DortIslem();

       int toplam= islem.topla(10,25);
        System.out.println("toplama: "+toplam);

       int cikarma= islem.cikar(45,21);
        System.out.println("cikarma: "+cikarma);
       int carpim_sonuc= islem.carpma(10,25);
        System.out.println("carpim_sonuc: "+carpim_sonuc);
        System.out.println("bolme_sonuc: "+islem.bolme(100,25));
    }
}

