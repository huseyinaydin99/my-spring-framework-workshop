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

		// 1.YOL - Casting (Tip dönüşümü) var.
		// Calisan calisan = (Calisan) context.getBean("beanCalisan");

		// 2.YOL - Casting (Tip dönüşümü) yok.
		Calisan calisan = context.getBean("beanCalisan", Calisan.class);

		// 3.YOL - Tip dönüşümü yok ve doğrudan sınıf adını da yeterli.
		// Calisan calisan = context.getBean(Calisan.class);

		System.out.println("ADI     : " + calisan.getAdi());
		System.out.println("SOYADI  : " + calisan.getSoyadi());
		System.out.println("YAŞI    : " + calisan.getYasi());
		System.out.println("ŞEHİR   : " + calisan.getAdres().getSehir());
		System.out.println("SEMT    : " + calisan.getAdres().getSemt());
		System.out.println("MAHALLE : " + calisan.getAdres().getMahalle());
		System.out.println("CADDE   : " + calisan.getAdres().getCadde());
		System.out.println("KAPI NO : " + calisan.getAdres().getNo());
		System.out.println("DAİRE   : " + calisan.getAdres().getDaire());
	}
}