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

@Component("kitapBean")
public class Kitap {

	@Value("57163212991453")
	private long eserISBN;

	@Value("Spring Framework")
	private String eserAdi;

	public String kitapBilgisiniAl(String yazarAdi, String yazarSoyadi, String eserAdi, long eserISBN) {
		this.eserAdi = eserAdi;
		this.eserISBN = eserISBN;
		return "YAZAR: " + yazarAdi + " " + yazarSoyadi + "KİTAP: " + getEserAdi() + "ISBN: " + getEserISBN();
	}

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}

	@Override
	public String toString() {
		return "Kitap [eserISBN=" + eserISBN + ", eserAdi=" + eserAdi + "]";
	}
}