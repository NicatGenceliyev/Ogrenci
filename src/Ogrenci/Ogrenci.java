package Ogrenci;

public class Ogrenci {
	private String ad, soyad, okuduguSinif, okuduguOkul, okuduguBolge;
	private int yas;
	private double boy;
	private char cinsiyet;
	
	Ogrenci(String ad, String soyad, String okduguSinif, String okuduguOkul, String okuduguBolge, int yas, double boy, char cinsiyet) {
		this.ad = ad;
		this.soyad = soyad;
		this.okuduguSinif = okuduguSinif;
		this.okuduguOkul = okuduguOkul;
		this.okuduguBolge = okuduguBolge;
		this.yas = yas;
		this.boy = boy;
		this.cinsiyet = cinsiyet;
	}
	
	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci("Nicat", "Genceliyev", "10e", "181", "Merdekan", 14, 1.68, 'k');
		Ogrenci ogrenci2 = new Ogrenci("Murad", "Mammedov", "10e", "181", "Merdekan", 15, 1.71, 'k');
		Ogrenci ogrenci3 = new Ogrenci("Ayxan", "Naqdaliyev", "10e", "181", "Merdekan", 14, 1.66, 'k');
	}
}
