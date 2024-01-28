package tr.com.huseyinaydin;

import java.util.List;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

public class Personel {

	private List<?> listemiz;

	public List<?> getListemiz() {
		return listemiz;
	}

	public void setListemiz(List<?> listemiz) {
		this.listemiz = listemiz;
	}

	@Override
	public String toString() {
		return "PERSONELLER : " + listemiz;
	}
}