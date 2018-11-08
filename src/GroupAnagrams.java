import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class GroupAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionGA  soln = new SolutionGA();
		String[] result = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(soln.groupAnagrams(result));
	}

}

class SolutionGA {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		if(strs == null || strs.length == 0)
			return new ArrayList<List<String>>();
		for(String words : strs) {
			char[] letters = words.toCharArray();
			Arrays.sort(letters);
			String keyString = String.valueOf(letters);
			if(!map.containsKey(keyString)) {
				map.put(keyString, new ArrayList<String>());
			}
			map.get(keyString).add(words);
		}
		return new ArrayList<List<String>>(map.values());	
	}
}


//if (strs.length == 0) return new ArrayList();
//Map<String, List> ans = new HashMap<String, List>();
//for (String s : strs) {
//    char[] ca = s.toCharArray();
//    Arrays.sort(ca);
//    String key = String.valueOf(ca);
//    if (!ans.containsKey(key)) ans.put(key, new ArrayList());
//    ans.get(key).add(s);
//}
//return new ArrayList(ans.values());
