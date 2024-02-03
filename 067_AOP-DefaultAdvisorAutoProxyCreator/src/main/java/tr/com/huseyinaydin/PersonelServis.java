package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class PersonelServis {

	private String adi, soyadi;
	private int tecrube;

	public void adiSoyadiKontrolEt() {
		System.out.println("Personel servisinin adiSoyadiKontrolEt() metodu");
		if (adi.length() < 2 || soyadi.length() < 2) {
			throw new IllegalArgumentException();
		}
	}

	public void selamVer(String mesaj) {
		System.out.println("Personel servisinin selamVer() metodu " + "\nGELEN MESAJ : " + mesaj);
	}

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