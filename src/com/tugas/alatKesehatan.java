package com.tugas;

public class alatKesehatan extends toko{

    private String keunggulan;
    private String mottoToko;
    private String mainIncome1;
    private String mainIncome2;
    private String mainIncome3;


    public alatKesehatan(String namaToko) {
        super(namaToko);
        setPenjelasan("Kami menjual alatKesehatan dari berbagai batu mulia");
        this.keunggulan = "Kami menjual alatKesehatan yang original dan indah";
        this.mottoToko  = "MEMUTAR BALIKKAN KEMALANGAN ANDA";
        allocateSell("Kursi Roda", "Tongkat Bantu Jalan", "Stetoskop");
        //Bingung mau naroh Tusk Act 4 di mana
    
    }
    
    public void allocateSell(String mainIncome1, String mainIncome2, String mainIncome3){
        this.mainIncome1 = mainIncome1;
        this.mainIncome2 = mainIncome2;
        this.mainIncome3 = mainIncome3;
    }
    public void display(){
        super.display();
        System.out.println("====================================");
        System.out.println("TOKO ALAT KESEHATAN JHONNY JOESTAR");
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
