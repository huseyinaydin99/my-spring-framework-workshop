package tr.com.huseyinaydin;									

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Araba {
	private Yakit yakit; //Composition Komposizyon Bileşim

	public Araba() {
		this.yakit = new Yakit();
	}
	
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba harekete geçti.");
	}
}