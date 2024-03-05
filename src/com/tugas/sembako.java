package com.tugas;

public class sembako extends toko{

    private String keunggulan;
    private String mottoToko;
    private String mainIncome1;
    private String mainIncome2;
    private String mainIncome3;


    public sembako(String namaToko) {
        super(namaToko);
        setPenjelasan("Kami menjual kebutuhan sehari hari anda");
        this.keunggulan = "Kami menjual sembako dengan harga yang bersaing";
        this.mottoToko  = "PENGALAMAN BELANJA PALING MEMUASKAN";
        allocateSell("Beras", "Minyak Goreng", "Air Galon");
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
        System.out.println("SEMBAKO GOLDEN EXPERINCE");
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
