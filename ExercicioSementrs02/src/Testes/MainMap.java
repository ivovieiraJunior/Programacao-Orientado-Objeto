package Testes;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {

	public static void main(String[] args) {
		//HashMap<String,Integer> list = new HashMap<String,Integer>();
		TreeMap<String,Integer> list = new TreeMap<String,Integer>();
		
		list.put("Goiana", new Integer(232323));
		list.put("Sao Paulo", new Integer(32322323));
		list.put("Brasilia", new Integer(0222));
		//list.put(null, null);
		//list.put(null, null);
	//	list.put(null, null);
		
		System.out.println(list + "\ntamanho" + list.size());
	
	System.out.println();
	
	for(Map.Entry<String,Integer> pair: list.entrySet()) {
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
	}
	System.out.println();
	
	Iterator it = list.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + "=" + pairs.getValue());
		}
		
	System.out.println();
	
	list.forEach((key,values)->{
		System.out.println("Chave:" + key + ",valor:" + values);
	});
	
	}
}
