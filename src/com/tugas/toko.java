package com.tugas;

public class toko {
    private String namaToko;
    private String penjelasan;
    private String mototoko;
    private String keunggulan;
    private String mainIncome1;
    private String mainIncome2;
    private String mainIncome3;

    public toko(String namaToko){
        this.namaToko = namaToko;
        
    }
    public String getNama(){
        return namaToko;

    }public void setNama(String namaToko) {
		this.namaToko = namaToko;
	}
	
    public String getPenjelasan(){
        return penjelasan;
    }
    public void setPenjelasan(String penjelasan){
        this.penjelasan = penjelasan;
    }

	void display(){
        System.out.println("====================================");
		System.out.println("\nNama \t\t: " + this.namaToko);
        System.out.println("Penjelasan : \t\t" + this.penjelasan);
        System.out.println("Keunggulan  \t\t: " + this.keunggulan);
        System.out.println("\t\tTOP 3 PENDAPATAN UTAMA: \t\t");
        System.out.println("1. \t: " + this.mainIncome1);
        System.out.println("2. \t: " + this.mainIncome2);
        System.out.println("3. \t: " + this.mainIncome3);
        System.out.println("====================================");
	}
    
    public void mototoko(){
        //Encapsulation (ini sebenarnya kek orang teriak gitu, tapi bingung nulis gimana, soalny kalo TerikkanMoto() malah aneh)
        System.out.println("MOTTO TOKO KAMI ADALAH : " + this.mototoko);
    }
}
