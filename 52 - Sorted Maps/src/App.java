import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		//SortedMap<Integer, String> sortedMap = new SortedMap<Integer, String>() {	};
		
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map){
		map.put(9, "fox");
		map.put(1, "lion");
		map.put(8, "pig");
		map.put(4, "dog");
		map.put(14, "snake");
		map.put(45, "bear");
		map.put(0, "giraffe");
		
		for(Integer key: map.keySet()){
			String value = map.get(key);
			System.out.println(key + ": " + value);
			//System.out.printf("%2d: %s\n",key,value);
		}
		
	}
}
