package tr.com.huseyinaydin;

import org.springframework.context.*;
import org.springframework.context.support.*;

import tr.com.huseyinaydin.dao.PersonelDAO;
import tr.com.huseyinaydin.enterprise.Personel;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Merkez {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		PersonelDAO personelDAO = context.getBean("personelDAOBean", PersonelDAO.class);
		Personel personel = null;
		System.out.println("\n --- NESNEYİ VERİTABANINA KAYDETTİRME");
		personel = new Personel("Hüseyin", "Aydın", 9);
		personelDAO.ekle(personel);
		System.out.println(personel);
		System.out.println("\n --- id NUMARASI İLE YAPILAN ARAMA");
		personel = personelDAO.idAra(2);
		System.out.println(personel);
		System.out.println("\n --- adi DEĞERİ İLE YAPILAN ARAMA");
		personel = personelDAO.adiAra("Hüseyin");
		System.out.println(personel);
		System.out.println("\n --- id DEĞERİ İLE String BİR VERİYİ ÇEKME");
		String gelen = personelDAO.idDegeriyleStringBirVeriyiCekme(1);
		System.out.println(gelen);
		System.out.println("\n --- BÜTÜN KAYITLARI GETİREN ARAMA");
		for (Personel kayit : personelDAO.butunKayitlariAra()) {
			System.out.println(kayit + "-----------------");
		}
		context.close();
	}
}