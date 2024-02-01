package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

@Component("ternaryOperatorBean")
public class TernaryOperator {

	@Value("#{sayilarBean.sayi1 lt sayilarBean.sayi4 ? true : false}")
	private boolean kontrol;

	public boolean isKontrol() {
		return kontrol;
	}

	public void setKontrol(boolean kontrol) {
		this.kontrol = kontrol;
	}

	@Override
	public String toString() {
		return "TernaryOperator kontrol sonucu : " + kontrol;
	}
}