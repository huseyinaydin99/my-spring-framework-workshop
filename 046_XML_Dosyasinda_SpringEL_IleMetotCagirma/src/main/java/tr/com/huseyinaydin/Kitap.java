package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

public class Kitap {

	private long eserISBN;
	private String eserAdi;

	public String kitapBilgisiniAl(String yazarAdi, String yazarSoyadi, String eserAdi, long eserISBN) {
		this.eserAdi = eserAdi;
		this.eserISBN = eserISBN;
		return "YAZAR: " + yazarAdi + " " + yazarSoyadi + " KİTAP: " + getEserAdi() + " ISBN: " + getEserISBN();
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