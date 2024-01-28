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
		Personel personel = appCtx.getBean("BeanPersonel", Personel.class);
		System.out.println(
				" ADI         : " + personel.getAdi() + "\n SOYADI      : " + personel.getSoyadi()
				+ "\n GÖREVİ      : " + personel.getGorevi() + "\n DOĞUM YILI  : " + personel.getDogumYili()
				+ "\n MAAŞI       : " + personel.getMaasi() + "\n EHLİYET     : " + personel.isEhliyet()
				+ "\n MEDENİ HALİ : " + personel.isMedeniHali() + "\n ANNE ADI    : " + personel.getAnneAdi()
				+ "\n BABA ADI    : " + personel.getBabaAdi() + "\n TELEFON NO  : " + personel.getTelNo()
				+ "\n ADRES       : " + personel.getAdres());
		((ConfigurableApplicationContext) appCtx).close();
	}
}