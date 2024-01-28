package tr.com.huseyinaydin;

import java.util.Map;											

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Sehir {

	private Map<?, ?> mapimiz;								

	public Map<?, ?> getMapimiz() {
		return mapimiz;
	}

	public void setMapimiz(Map<?, ?> mapimiz) {
		this.mapimiz = mapimiz;
	}

	@Override
	public String toString() {
		return "ŞEHİRLER : " + mapimiz;
	}
}