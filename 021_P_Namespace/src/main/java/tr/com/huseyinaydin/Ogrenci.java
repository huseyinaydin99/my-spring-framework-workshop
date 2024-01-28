package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

public class Ogrenci {

	private String adi, soyadi;
	private int numarasi;

	private Okul univeristesi;

	public Okul getUniveristesi() {
		return univeristesi;
	}

	public void setUniveristesi(Okul univeristesi) {
		this.univeristesi = univeristesi;
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

	public int getNumarasi() {
		return numarasi;
	}

	public void setNumarasi(int numarasi) {
		this.numarasi = numarasi;
	}
}