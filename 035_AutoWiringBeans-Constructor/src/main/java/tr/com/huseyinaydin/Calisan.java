package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Calisan {
	
	private String adi, soyadi;
	private Adres adres;

	public Calisan(Adres adres) {                                  
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "ÇALIŞAN " + getAdi() + " " + getSoyadi() 
						 +"\n"+ getAdres();
	}

	public Adres getAdres() {
		return adres;
	}
	
	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
}