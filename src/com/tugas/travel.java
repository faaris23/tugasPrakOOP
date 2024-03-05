package com.tugas;

public class travel extends toko{

    private String keunggulan;
    private String mottoToko;
    private String mainIncome1;
    private String mainIncome2;
    private String mainIncome3;


    public travel(String namaToko) {
        super(namaToko);
        setPenjelasan("Kami menjual perhiasan dari berbagai batu mulia");
        this.keunggulan = "Kami menyediakan paket traveling ke berbagai destinasi wisata di dunia";
        this.mottoToko  = "BEBASKAN DIRI ANDA DARI PENJARA KEHIDUPAN DENGAN LIBURAN";
        allocateSell("BALI", "JEPANG", "KOREA UTARA");
        //Harga beras tembus 20K bjirrrrr
    
    }
    
    public void allocateSell(String mainIncome1, String mainIncome2, String mainIncome3){
        this.mainIncome1 = mainIncome1;
        this.mainIncome2 = mainIncome2;
        this.mainIncome3 = mainIncome3;
    }
    public void display(){
        super.display();
        System.out.println("====================================");
        System.out.println("STONE FREE TRAVEL");
        System.out.println("Keunggulan  \t\t: " + this.keunggulan);
        System.out.println("\t\tTOP 3 PENDAPATAN UTAMA: \t\t");
        System.out.println("1. \t\t: " + this.mainIncome1);
        System.out.println("2. \t: " + this.mainIncome2);
        System.out.println("3. \t: " + this.mainIncome3);
        System.out.println("====================================");

    }

    public void mottoToko(){
        System.out.println("MOTTO TOKO KAMI ADALAH : " + this.mottoToko);
    }
}
