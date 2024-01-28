package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

public class Musteri {

	private Siparis siparis;

	public Musteri() {
		System.out.println("Müşteri sınıfının yapılandırıcısı.");
	}

	public void setSiparis(Siparis siparis) {
		System.out.println("Müşteri sınıfındaki setSiparis metodu.");
		this.siparis = siparis;
	}

	public Siparis getSiparis() {
		System.out.println("Müşteri sınıfındaki getSiparis metodu.");
		return siparis;
	}

	public void hesabiOde() {
		System.out.println("Müşteri sınıfındaki hesabiOde metodu.");
		siparis.toplamSonucuAl();
	}
}