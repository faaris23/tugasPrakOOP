package com.tugas;

public class toko {
    private String namaToko;
    private String Produk;
    private String penjelasan;


    public toko(String namaToko){
        this.namaToko = namaToko;
        this.Produk = "none";
    }
    public String getNama(){
        return namaToko;

    }public void setNama(String namaToko) {
		this.namaToko = namaToko;
	}
	
	public String getProduk () {
		return Produk;
	}
	public void setProduk (String Produk) {
		this.Produk = Produk;
	}

    public String getPenjelasan(){
        return penjelasan;
    }
    public void setPenjelasan(String penjelasan){
        this.penjelasan = penjelasan;
    }
	void display(){
		System.out.println("\nNama \t\t: " + this.namaToko);
		System.out.println("Barang Yang di Jual \t\t: " + this.Produk);
        System.out.println("Penjelasan : \t\t" + this.penjelasan);
	}
}
