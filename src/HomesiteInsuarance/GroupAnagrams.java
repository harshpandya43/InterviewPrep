package HomesiteInsuarance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagrams g = new GroupAnagrams();
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res = g.groupAnagrams(str);
		System.out.println(res);
	}
	
	List<List<String>> groupAnagrams(String[] str) {
		if(str == null || str.length == 0) {
			return new ArrayList<>();
		}
		HashMap<String, List<String>> map = new HashMap<>();
		
		for(String s : str) {
			char c[] = s.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			
			map.get(key).add(s);
		}
		
		return new ArrayList<>(map.values());
	}

}
