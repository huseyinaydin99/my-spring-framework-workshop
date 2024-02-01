package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class TernaryOperator {

	private boolean kontrol;

	public boolean isKontrol() {
		return kontrol;
	}
	
	public void setKontrol(boolean kontrol) {
		this.kontrol = kontrol;
	}

	@Override
	public String toString(){																								
		return "TernaryOperator kontrol sonucu : " + kontrol;
	}
}