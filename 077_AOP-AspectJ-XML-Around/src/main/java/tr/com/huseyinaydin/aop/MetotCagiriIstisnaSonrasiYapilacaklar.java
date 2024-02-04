package tr.com.huseyinaydin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

//@Aspect
public class MetotCagiriIstisnaSonrasiYapilacaklar {

	/*@AfterThrowing(pointcut = "execution(* "
			+ "tr.com.huseyinaydin.IPersonelServis.adiSoyadiKontrolEt(..))", throwing = "hata")*/
	public void istisnadanSonrakiGorev(JoinPoint joinPoint, Throwable hata) {
		System.out.println("\n--- AspectJ --- " + joinPoint.getSignature().getName() + " metodun"
				+ " bir İSTİSNADAN SONRA" + " çalışan metot.");
		System.out
				.println(joinPoint.getSignature().getName() + " metodunda meydana gelen istisna türü : " + hata + "\n");
	}
}