package edu.interview.test;

public class Palindrome {
	
	public boolean isPalindrome(String str){
		if(str==null|| str.length()==0){
			return false;
		}else if(str.length()==1){
			return true;
		}else{
			
			for(int i=0,j=str.length()-1;i<j;){
				if(str.charAt(i)!=str.charAt(j)){
					return false;
				}
				if(i==j){
					break;
				}
				i++;j--;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new Palindrome().isPalindrome("!-63-!"));
	}

}
