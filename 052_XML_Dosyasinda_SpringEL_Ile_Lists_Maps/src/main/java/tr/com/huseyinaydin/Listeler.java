package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Listeler {	
	private String mapElemani;
	private String listElemani;

	public String getMapElemani() {
		return mapElemani;
	}
	public void setMapElemani(String mapElemani) {
		this.mapElemani = mapElemani;
	}

	public String getListElemani() {
		return listElemani;
	}
	public void setListElemani(String listElemani) {
		this.listElemani = listElemani;
	}

	@Override
	public String toString() {											
	 return "SEÇİLEN MAP  ELEMANI = " + mapElemani 
	   + "\nSEÇİLEN LIST ELEMANI = " + listElemani;
	}	
}