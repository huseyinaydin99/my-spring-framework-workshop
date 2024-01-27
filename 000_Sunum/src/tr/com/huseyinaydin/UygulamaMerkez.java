package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class UygulamaMerkez {
	public static void main(String[] args) {		
		Sekil sekil;
	
		sekil = new Dortgen();
		sekil.ciz(sekil);

		sekil = new Daire();
		sekil.ciz(sekil);		
	}
}