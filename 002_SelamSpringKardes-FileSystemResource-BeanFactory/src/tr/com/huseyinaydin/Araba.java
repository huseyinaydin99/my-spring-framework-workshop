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
	
	private Yakit yakit; 

/*
	public Araba() {	
	  this.yakit = new Yakit();	
	}
*/
	
	public Araba(Yakit yakit) {
		this.yakit = yakit;		
	}
	
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba harekete geçti.");
	}
}