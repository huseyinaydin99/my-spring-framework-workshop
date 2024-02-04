package tr.com.huseyinaydin.impl;

import tr.com.huseyinaydin.IPersonelServis;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class PersonelServisImpl implements IPersonelServis {

	private String adi, soyadi;
	private int tecrube;

	@Override
	public void adiSoyadiKontrolEt() {
		System.out.println("Personel servisinin adiSoyadiKontrolEt() metodu");
		if (adi.length() < 2 || soyadi.length() > 2) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String selamVer(String mesaj) {
		System.err.println("Personel servisinin selamVer() metodu " + "\nGELEN MESAJ : " + mesaj);
		return mesaj;
	}

	@Override
	public void personelBilgisiniVer() {
		System.out.println("Personel servisinin personelBilgisiniAl() metodu" + "\nADI SOYADI : " + adi + " " + soyadi
				+ "\nTECRÜBE    : " + tecrube + " yıl");
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getTecrube() {
		return tecrube;
	}

	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}
}