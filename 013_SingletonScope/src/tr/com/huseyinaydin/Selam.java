package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Selam {

	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}
	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public void goster(){
	System.out.println(getMesaj());
	}
}