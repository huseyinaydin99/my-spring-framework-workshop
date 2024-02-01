package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Sozler {
	private String cumle;

	public String getCumle() {
		return cumle;
	}

	public void setCumle(String cumle) {
		this.cumle = cumle;
	}

	public void ekranaYaz() {
		System.out.println(getCumle());
		System.out.println("Hüseyin AYDIN - BABA");
	}
}