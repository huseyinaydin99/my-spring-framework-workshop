package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
	    Ders ders = appCtx.getBean("dersBean", Ders.class);
	    System.out.println("ADI   :" + ders.getOgrenci().getAdi());
	    System.out.println("SOYADI:" + ders.getOgrenci().getSoyadi().toString());									
	    System.out.println("YAŞI  :" + ders.getOgrenci().getYasi().toString());
	    
	    System.out.println("DERS  :" + ders.getDers() );
	    System.out.println("NOTU  :" + ders.getPuan() );
	   		
		((ConfigurableApplicationContext)appCtx).close(); 							
	}
}