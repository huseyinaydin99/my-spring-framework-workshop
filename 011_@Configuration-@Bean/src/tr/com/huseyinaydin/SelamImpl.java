package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class SelamImpl implements ISelam {

	@Override
	public void mesajYaz(String mesaj) {
		System.out.println(mesaj + "\nHüseyin AYDIN");
	}
}