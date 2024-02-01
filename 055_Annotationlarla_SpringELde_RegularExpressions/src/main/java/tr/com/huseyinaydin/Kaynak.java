package tr.com.huseyinaydin;

import java.util.*;
import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

@Component("kaynakBean")
public class Kaynak {

	private Map<String, String> map;
	private List<String> list;
	private String eposta;

	public Kaynak() {
		eposta = "huseyinaydin99@gmail.com";

		map = new HashMap<String, String>();
		map.put("Murat Yavuz", "muromeftun99@facebook.com");
		map.put("Selami Zımba", "selamii.zimba99@facebook.com");
		map.put("Rümeysa AYDIN", "rumissa.99@facebook.com");
		map.put("Yasin AYDIN", "yasin.siyahbeyaz99@facebook.com");
		map.put("Hüseyin AYDIN", "huseyinaydin99@gmail.com");

		list = new ArrayList<String>();
		list.add("Murat Yavuz");
		list.add("Selami Zımba");
		list.add("Rümeysa AYDIN");
		list.add("Yasin AYDIN");
		list.add("Hüseyin AYDIN");
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}