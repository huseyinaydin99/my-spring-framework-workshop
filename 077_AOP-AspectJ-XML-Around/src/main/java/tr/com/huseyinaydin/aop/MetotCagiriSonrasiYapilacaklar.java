package tr.com.huseyinaydin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
public class MetotCagiriSonrasiYapilacaklar {

	//@After("execution(* tr.com.huseyinaydin.IPersonelServis.selamVer(..))")
	public void sonGorev(JoinPoint joinPoint) {
		System.out.println("--- AspectJ --- " + joinPoint.getSignature().getName() + " isimli metottan"
				+ " SONRA çalışan sonGorev() metodu.\n");
	}
}