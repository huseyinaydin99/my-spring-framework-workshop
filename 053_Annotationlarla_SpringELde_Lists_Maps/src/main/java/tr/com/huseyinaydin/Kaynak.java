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

	public Kaynak() {
		map = new HashMap<String, String>();
		map.put("Hibernate", "Hüseyin");
		map.put("Spring", "Yasin");
		map.put("Primefaces", "Veli");

		list = new ArrayList<String>();
		list.add("Rümeysa");
		list.add("Ömer");
		list.add("Hasan");
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