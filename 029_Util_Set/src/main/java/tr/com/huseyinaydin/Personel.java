package tr.com.huseyinaydin;

import java.util.Set;												

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Personel {

	private Set<?> setimiz;																	

	public Set<?> getSetimiz() {
		return setimiz;
	}

	public void setSetimiz(Set<?> setimiz) {
		this.setimiz = setimiz;
	}

	@Override
	public String toString() {
		return "PERSONELLER =" + setimiz;
	}
}