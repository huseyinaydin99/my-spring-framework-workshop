package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Merkez {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
			
		System.out.println("ADI          : " + ogrenci.getAdi());                          
		System.out.println("SOYADI       : " + ogrenci.getSoyadi());
		System.out.println("NUMRASI      : " + ogrenci.getNumarasi());	
		System.out.println("ÜNİVERSİTESİ : " + ogrenci.getUniveristesi().getKurumAdi());	   		
	}
}