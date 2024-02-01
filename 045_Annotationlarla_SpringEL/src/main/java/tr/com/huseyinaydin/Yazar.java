package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

@Component("yazarBean")
public class Yazar {

	@Value("Mimar")
	private String adi;

	@Value("Aslan")
	private String soyadi;

	@Value("#{kitapBean}")
	private Kitap kitap;

	@Value("#{kitapBean.eserAdi}")
	private String kitapAdi;

	public String getKitapAdi() {
		return kitapAdi + " Mimar Aslan abinin güzel kitabı. En iyi Türkçe Spring Framework kitabı.";
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
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

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	@Override
	public String toString() {
		return "Yazar [adi=" + adi + ", soyadi=" + soyadi + ", kitap=" + kitap + ", kitapAdi=" + kitapAdi + "]";
	}
}