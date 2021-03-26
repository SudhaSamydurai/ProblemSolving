package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Get Sun";
		String a = "Water Heater";
		Demo obj = new Demo();
		boolean flag = obj.getUnique(a);
		if(flag)
			System.out.println("String is unique");
		else
			System.out.println("Strign is not unique");
	}
	
	
	
	public boolean getUnique(String s) {
		try {
			List<Character> nonRepeating = new ArrayList<Character>();
			Set<Character> repeating = new HashSet<Character>();
			
			for(int i=0; i< s.length(); i++) {
				char letter = s.charAt(i);
				if(repeating.contains(letter))
					break;
				if(nonRepeating.contains(letter)) {
					nonRepeating.remove((Character)letter);
					repeating.add(letter);
				}
				else {
					nonRepeating.add(letter);
					}
				}
			if(repeating.size()>0)
				return false;
			else
				return true;
		}catch(Throwable t) {
			return false;
		}
	}

}
