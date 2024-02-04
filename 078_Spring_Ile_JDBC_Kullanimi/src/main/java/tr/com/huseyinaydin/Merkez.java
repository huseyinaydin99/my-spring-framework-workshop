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
		Personel personel = new Personel("Huseyin", "Aydin", 10);
		personelDAO.ekle(personel);
		personel = personelDAO.idAra(1);
		System.out.println(personel);
		personel = personelDAO.adiAra("Huseyin");
		System.out.println(personel);
		context.close();
	}
}