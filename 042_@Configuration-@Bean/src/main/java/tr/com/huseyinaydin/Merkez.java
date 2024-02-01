package tr.com.huseyinaydin;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBeansConfig.class);
		context.refresh();

		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		System.out.println(ogrenci.getSehir().getSehirAdi());
		System.out.println(ogrenci.getSehir().getPlakaNo());

		((ConfigurableApplicationContext) context).close();
	}
}