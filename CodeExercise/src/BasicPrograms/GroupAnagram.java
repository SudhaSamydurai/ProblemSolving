package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"cat", "dog", "tac", "god", "act"};
		System.out.println(groupAnagram(s));
	}
	
	public static List<List<String>> groupAnagram(String[] words){
		if(words.length == 0)
			return new ArrayList();
			Map<String, List> group = new HashMap<String, List>();
		for(String word: words) {
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String key = new String(letters);
			System.out.println(!group.containsKey(key));
			//System.out.println(group.get(key));
			if(!group.containsKey(key)) {
				System.out.println(key);
				group.put(key, new ArrayList());
				group.get(key).add(word);
				
			}
			else {
				group.get(key).add(word);
			}
	}
		return new ArrayList(group.values());

	}}
