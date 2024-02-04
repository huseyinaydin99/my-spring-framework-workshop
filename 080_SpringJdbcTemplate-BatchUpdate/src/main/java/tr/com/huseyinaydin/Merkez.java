package tr.com.huseyinaydin;

import java.util.ArrayList;
import java.util.List;

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
		Personel personel01 = new Personel("Salim", "Baysil", 3);
		Personel personel02 = new Personel("Cessur", "Tekir", 2);
		Personel personel03 = new Personel("Necmiye", "Bekir", 6);
		Personel personel04 = new Personel("Magnus", "Andersson", 5);
		Personel personel05 = new Personel("Onur", "Beyazbağ", 0);
		Personel personel06 = new Personel("Evren", "Kılkır", 2);
		Personel personel07 = new Personel("Yasin", "Yoklu", 1);
		Personel personel08 = new Personel("Şakir", "Taş", 0);
		Personel personel09 = new Personel("Mehmet", "Ünlü", 1);
		Personel personel10 = new Personel("Yonuz", "Özdoğan", 1);
		List<Personel> personelListesi = new ArrayList<Personel>();
		personelListesi.add(personel01);
		personelListesi.add(personel02);
		personelListesi.add(personel03);
		personelListesi.add(personel04);
		personelListesi.add(personel05);
		personelListesi.add(personel06);
		personelListesi.add(personel07);
		personelListesi.add(personel08);
		personelListesi.add(personel09);
		personelListesi.add(personel10);
		System.out.println(" EKLENCEK LİSTE\n" + personelListesi);
		System.out.println("\n\n***KAYIT ÖNCESİ BÜTÜN KAYITLAR\n" + personelDAO.butunKayitlariAra());
		// LİSTEDEKİ KAYITLAR TABLOYA GİRİLİYOR
		personelDAO.topluVerisiGirisiBatch1(personelListesi);
		System.out.println("\n\n***TOPLU VERİ GİRİŞİ VE BÜTÜN KAYITLAR\n" + personelDAO.butunKayitlariAra());
		// SORGUYA GÖRE YAPILAN GÜNCELLEME İŞLEMİ
		personelDAO.topluVerisiGirisiBatch2("UPDATE personel " + "SET soyadi='Kalpkaplan' " + "WHERE soyadi='Beyazbağ'");
		System.out.println("\n\n***GÜNCELLEME İŞLEMİ VE BÜTÜN KAYITLAR\n" + personelDAO.butunKayitlariAra());
		context.close();
	}
}