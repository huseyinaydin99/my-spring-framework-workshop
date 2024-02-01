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

	@Value("#{kitapBean.kitapBilgisiniAl('MİMAR','ASLAN'," + "'Hibernate'," + "'107115171923')}")
	private String bilgi;

	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}

	public String getKitapAdi() {
		return kitapAdi;
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
		return "Yazar [adi=" + adi + ", soyadi=" + soyadi + ", kitap=" + kitap + ", kitapAdi=" + kitapAdi + ", bilgi="
				+ bilgi + "]";
	}
}