package com.tugas;

public class hewanPeliharaan extends toko{

    private String keunggulan;
    private String mottoToko;
    private String mainIncome1;
    private String mainIncome2;
    private String mainIncome3;


    public hewanPeliharaan(String namaToko) {
        super(namaToko);
        setPenjelasan("Toko yang menjual berbagai kebutuhan hewan peliharaan anda");
        this.keunggulan = "Kami menyediakan berbagai kebutuhan hewan peliharaan anda";
        this.mottoToko  = "TEMPAT TERBAIK PELIHARAAN ANDA!!!";
        allocateSell("Penitipan Hewan", "Catfood", "mainan hewan");
    }
    
    public void allocateSell(String mainIncome1, String mainIncome2, String mainIncome3){
        this.mainIncome1 = mainIncome1;
        this.mainIncome2 = mainIncome2;
        this.mainIncome3 = mainIncome3;
    }
    public void display(){
        super.display();
        System.out.println("====================================");
        System.out.println("JOJO'S BIZZARE PETSHOP");
        System.out.println("Keunggulan  \t\t: " + this.keunggulan);
        System.out.println("\t\tTOP 3 PENDAPATAN UTAMA: \t\t");
        System.out.println("1. : " + this.mainIncome1);
        System.out.println("2. : " + this.mainIncome2);
        System.out.println("3. : " + this.mainIncome3);
        System.out.println("====================================");

    }

    public void mottoToko(){
        System.out.println("MOTTO TOKO KAMI ADALAH : " + this.mottoToko);
    }
}
