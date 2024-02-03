package tr.com.huseyinaydin;

import org.springframework.context.*;
import org.springframework.context.support.*;

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
		PersonelServis personelServis = context.getBean("personelServisBeanProxy", PersonelServis.class);
		try {
			personelServis.adiSoyadiKontrolEt();
			personelServis.selamVer("Hoşgeldiniz.");
			personelServis.personelBilgisiniVer();
		} catch (Exception e) {
			System.out.println("Personel Servisinin " + "adiSoyadiKontrolEt() metodunda istisna oluştu.");
			System.out.println("istisna mesajı : " + e);
		}
		context.close();
	}
}