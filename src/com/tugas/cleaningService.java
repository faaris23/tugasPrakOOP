package com.tugas;

public class cleaningService extends toko{

    private String keunggulan;
    private String mottoToko;
    private String mainIncome1;
    private String mainIncome2;
    private String mainIncome3;


    public cleaningService(String namaToko) {
        super(namaToko);
        setPenjelasan("Kami membersihkan rumah anda sesuai pesanan anda");
        this.keunggulan = "Kami sangat terkenal dalam membersihkan berbagai macam ruangan";
        this.mottoToko  = "SAKING BERSIH NYA, SERASA TIDAK ADA GAYA GESEK";
        allocateSell("Paket 1 Rumah", "Paket 1 Ruangan", "Paket Rubanah");
        
    
    }
    
    public void allocateSell(String mainIncome1, String mainIncome2, String mainIncome3){
        this.mainIncome1 = mainIncome1;
        this.mainIncome2 = mainIncome2;
        this.mainIncome3 = mainIncome3;
    }
    public void display(){
        super.display();
        System.out.println("====================================");
        System.out.println("SOFT AND WET CLEANING SERVICE");
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
