package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Adres 
{
	private String tamAdresi;

	public String getTamAdresi() {
		return tamAdresi;
	}
	
	public void setTamAdresi(String tamAdresi) {
		this.tamAdresi = tamAdresi;
	}

	@Override
	public String toString() {
		return "TAM ADRESİ : " 
	    + getTamAdresi().toUpperCase().toString();								
	}
}