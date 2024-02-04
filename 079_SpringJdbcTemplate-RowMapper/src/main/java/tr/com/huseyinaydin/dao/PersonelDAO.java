package tr.com.huseyinaydin.dao;

import java.util.List;

import tr.com.huseyinaydin.enterprise.Personel;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public interface PersonelDAO {
	public void ekle(Personel personel);
	public Personel idAra(int id);
	public Personel adiAra(String adi);
	public Personel soyadiAra(String soyadi);
	public Personel tecrubeyeAra(int tecrube);
	public List<Personel> butunKayitlariAra();
	public String idDegeriyleStringBirVeriyiCekme(int id);
}