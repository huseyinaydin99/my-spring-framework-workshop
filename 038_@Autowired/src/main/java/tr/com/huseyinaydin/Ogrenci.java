package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Ogrenci {

	private Integer yasi;
	private String adi, soyadi;

	public void setYasi(Integer yasi) {
		this.yasi = yasi;
	}

	public Integer getYasi() {
		return yasi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getAdi() {
		return adi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getSoyadi() {
		return soyadi;
	}
}