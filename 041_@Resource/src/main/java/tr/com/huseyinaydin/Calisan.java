package tr.com.huseyinaydin;

import javax.annotation.Resource;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Calisan {
	
	private Sehir sehir;

	public Sehir getSehir() {
		return sehir;
	}
	
	@Resource(name="sehirBean")													
	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}
}