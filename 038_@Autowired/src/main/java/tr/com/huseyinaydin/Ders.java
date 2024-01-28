package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Autowired;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Ders {

	private Ogrenci ogrenci;

	private int puan;
	private String ders;

	@Autowired 
	public Ders(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}
}