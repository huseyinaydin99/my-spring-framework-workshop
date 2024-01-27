package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Ucgen {

	private String cesit;

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	public String getCesit() {
		return cesit;
	}

	public void ciz() {
		System.out.println(getCesit() + " Üçgen çiz."); 
	}
}