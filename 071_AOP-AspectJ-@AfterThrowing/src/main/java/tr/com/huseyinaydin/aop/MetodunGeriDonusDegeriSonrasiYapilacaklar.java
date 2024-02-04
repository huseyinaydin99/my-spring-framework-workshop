package tr.com.huseyinaydin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

@Aspect
public class MetodunGeriDonusDegeriSonrasiYapilacaklar {

	@AfterReturning(pointcut = "execution(* " + "tr.com.huseyinaydin." + "IPersonelServis."
			+ "selamVer(..))", returning = "sonuc")
	public void geriDonusSonrasiGorev(JoinPoint joinPoint, Object sonuc) {
		System.out.println("\n--- AspectJ --- " + joinPoint.getSignature().getName() + " metodun"
				+ " GERİ DÖNÜŞ DEĞERİNDEN SONRA" + " çalışan metot.");
		System.out.println(joinPoint.getSignature().getName() + " metodunun geri dönüş değeri : " + sonuc + "\n");
	}
}