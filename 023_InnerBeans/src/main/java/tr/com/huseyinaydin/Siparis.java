package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Siparis {

	private int tutar;

	public Siparis() {
		System.out.println("Sipariş sınıfının yapılandırıcısı.");
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}

	public void toplamSonucuAl() {
		System.out.println("Sipariş sınıfındaki toplamSonucuAl metodu.");
		System.out.println("Toplam : " + tutar);
	}
}