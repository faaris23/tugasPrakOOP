package com.tugas;

public class pilihToko {

    public static void toko(String args[]){
        toko toko1 = new hewanPeliharaan("JOJO'S BIZZARE PETSHOP");
        toko toko2 = new perhiasan("TOKO PERHIASAN CRAZY DIAMOND");
        toko toko3 = new sembako("SEMBAKO GOLDEN EXPERINCE");
        toko toko4 = new travel("STONE FREE TRAVEL");
        toko toko5 = new alatKesehatan("TOKO ALAT KESEHATAN JHONNY JOESTAR");
        toko toko6 = new cleaningService("SOFT AND WET CLEANING SERVICE");

        toko[] sumAllTokos = {toko1,toko2,toko3,toko4,toko5,toko6,};
        
        for(toko TokoToko : sumAllTokos){
            TokoToko.display();
        }
    }
}
