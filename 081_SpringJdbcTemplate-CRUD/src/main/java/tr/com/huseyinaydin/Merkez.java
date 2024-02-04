package tr.com.huseyinaydin;

import java.util.List;
import java.util.Random;

import org.springframework.context.*;
import org.springframework.context.support.*;

import tr.com.huseyinaydin.dao.PersonelDAO;
import tr.com.huseyinaydin.pojo.Personel;

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
		int rastgeleSayi = new Random().nextInt(25);
		Personel personel1 = new Personel();
		personel1.setAdi("Cumali");
		personel1.setSoyadi("Perşembeali");
		personel1.setTecrube(rastgeleSayi);
		
		System.out.println("CREATE (OLUŞTUR)");
		personelDAO.craateOlustur1(personel1);

		System.out.println("READ (OKUMA)");
		personelDAO.readOku1(rastgeleSayi);

		System.out.println("UPDATE (GÜNCELLEME)");
		personel1.setAdi("Veli");
		personel1.setSoyadi("Emmi");
		personel1.setTecrube(rastgeleSayi);
		personelDAO.updateGuncelle1(personel1, rastgeleSayi);

		System.out.println("GÜNCELLEME LİSTEDEKİ SONRASI SON DURUM)");
		List<Personel> personelListesi1 = personelDAO.getAllHesiniGetir2();
		System.out.println(personelListesi1);

		System.out.println("DELETE (SİLME)");
		personelDAO.deleteSil1(rastgeleSayi - 2);
		personelDAO.deleteSil1(rastgeleSayi - 1);
		personelDAO.deleteSil1(rastgeleSayi);
		personelDAO.deleteSil1(rastgeleSayi + 1);
		personelDAO.deleteSil1(rastgeleSayi + 2);

		System.out.println("\nSİLME SONRASI LİSTEDEKİ SON DURUM");
		System.out.println(personelDAO.getAllHesiniGetir1());

		Personel personel2 = new Personel("Mehman", "Beshirov", rastgeleSayi);

		System.out.println("CREATE (OLUŞTUR)");
		personelDAO.craateOlustur2(personel2);

		System.out.println("READ (OKUMA)");
		personelDAO.readOku2(rastgeleSayi);

		System.out.println("UPDATE (GÜNCELLEME)");
		personel2.setAdi("Salih");
		personel2.setSoyadi("Ertuğrul");
		personel2.setTecrube(rastgeleSayi);
		personelDAO.updateGuncelle2(personel2, rastgeleSayi);

		System.out.println("GÜNCELLEME LİSTEDEKİ SONRASI SON DURUM)");
		List<Personel> personelListesi2 = personelDAO.getAllHesiniGetir2();
		System.out.println(personelListesi2);

		System.out.println("DELETE (SİLME)");
		personelDAO.deleteSil2(rastgeleSayi - 2);
		personelDAO.deleteSil2(rastgeleSayi - 1);
		personelDAO.deleteSil2(rastgeleSayi);
		personelDAO.deleteSil2(rastgeleSayi + 1);
		personelDAO.deleteSil2(rastgeleSayi + 2);

		System.out.println("\nSİLME SONRASI LİSTEDEKİ SON DURUM");
		System.out.println(personelDAO.getAllHesiniGetir2());

		System.out.println("İŞLEM TAMAM.");

		context.close();
	}
}