package edu.interview.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void removeDuplicate(String str){
		if(str!=null && str.length()>1){
			Set hs = new LinkedHashSet<Character>();
			for(char c:str.toCharArray()){
				hs.add(c);
			}
			
			
			str= "";
			Iterator itr = hs.iterator();
			while(itr.hasNext()){
				str=str+itr.next();
			}
			
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		removeDuplicate("xzrxtcfyvgbhjkjasdjfcnjdvnc");
	}
}
