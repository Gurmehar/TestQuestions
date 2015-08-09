package edu.interview.test;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class ArraySum {

	/*searchMinSumPair
	 * Finds the pair from array with minimum Sum
	 * */
	static int[] searchMinSumPair(int[] inputArray) {
		
		int [] pair= {0,0};
		int sum =999999999;
		for (int i=0;i<inputArray.length-1;i++){
			for(int j=i+1;j<inputArray.length;j++){
				if(sum>(inputArray[i]+inputArray[j])){
					sum=inputArray[i]+inputArray[j];
					pair[0]=inputArray[i];
					pair[1]=inputArray[j];
				}
			}
		}
		
		Arrays.sort(pair);
		
		return pair;

    }
	
	/*validate
	 * Functions find out if the char input is b/w a-z,A-Z,0-9  */
	 static boolean validate(String identifier) {
		 	if(identifier==null){
		 		return false;
		 	}
		 	else if(identifier.length()==0){
		 		return false;
		 	}
		 	else if(identifier.length()==1){
		 		return false;
		 	}else{
		 		int iden=(int)identifier.charAt(0);
		 		if(iden==36||iden==95 || (iden>=65 && iden<=90) ||(iden>=97 && iden<=122)){
		 			for(int i=0;i<identifier.length();i++){
		 				iden=identifier.charAt(i);
		 				if(iden==36||iden==95 || (iden>=65 && iden<=90) ||(iden>=97 && iden<=122)||(iden>=48 && iden<=57) ){
		 					continue;
		 				}
		 				return false;
		 			}
		 			
		 		}else{
		 			return false;
		 		}
		 	}
		 	
		 	
		 	
		 
		 return true;
	    }
	 /*minimumDenominations
	  * Breaks amount into minimum denomination as per the array
	  * */
	 static int minimumDenominations(int totalAmount) {
		 int [] denom={20,10,5,3,2,1};
		 //Arrays.sort(denom);
		 
		 String str="";
		 
		 while(totalAmount>1){
			 
			 for(int i=0;i<denom.length;i++){
				 if(totalAmount>=denom[i]){
					 str=str+denom[i]+"*"+totalAmount/denom[i]+"\n";
					 System.out.println(str);
					 totalAmount=totalAmount%denom[i];
				 }
				 
			 }
			 System.out.println(str);
		 }
		 
		 	return -1;
	    }
	 /*minimumDenomination
	  * Find minimumDenomination of amount , from the denomination given in array
	  * */
	 static void  minimumDenomination(int amount,int []denoms){
		 HashMap <Integer,Integer> hm = new  HashMap<Integer,Integer>();
		 if(denoms.length>1){
			 Arrays.sort(denoms);
			 while(amount>1){
				 for(int i=denoms.length-1;i>0;i--){
					 if(amount>=denoms[i]){
						 hm.put(denoms[i], amount/denoms[i]);
					 	 amount=amount%denoms[i];
					 }
				 }	

			 }
			 for(Integer k:hm.keySet()){
				 System.out.println(k+" : "+hm.get(k));
			 }

		 }
		    	
		 }
	 
	 static int covertBase16toBase10(String str){
		 str=str.toUpperCase();
		 HashMap<String,Integer> hm = new HashMap<String, Integer>();
		 hm.put("0", 0);
		 hm.put("1",1);
		 hm.put("2",2);
		 hm.put("3",3);
		 hm.put("4",4);
		 hm.put("5",5);
		 hm.put("6",6);
		 hm.put("7",7);
		 hm.put("8",8);
		 hm.put("9",9);
		 hm.put("A",10);
		 hm.put("B",11);
		 hm.put("C",12);
		 hm.put("D",13);
		 hm.put("E",14);
		 hm.put("F",15);
		
		 
		 if(str==null ||str.equals("")){
			 return 0;
		 }
		 else if(str.length()<1){
			 return 0;
		 }else{
			 int base10=0;
			 for(int i=str.length()-1,j=0;i>=0;i--,j++){
				 if(hm.containsKey(""+str.charAt(j))){
					base10=(int) (base10+ (hm.get(""+str.charAt(i))*(Math.pow(16, j))));
					 System.out.println(i+"Value of j "+j +"---"+str.charAt(i)+"  base10 is "+ base10);
				 }
				 else{
					 return -1;	
				 }
			 }
			 return base10;
		 }
		 
		 
		 
	 }
	 
	 static int convert(int num) {
		  
		  String base5="";
		 		 while(num%10>0){
		 			 base5= num%5+base5;
		 			 
		 			 num=num/5;
		 			 	
		 		
		 			 
		 			 
		 		 }
		 		 System.out.println(base5);
		  return Integer.parseInt(base5);	
	    }


	
public static void main(String[] args) {
	int[] inputArray={25,10,5};
//	int[] pair=(searchMinSumPair(inputArray));
	//System.out.println(convert(5901));
	//minimumDenominations(136);
	//minimumDenomination(70,inputArray);
//	System.out.println((int)'$');
//	System.out.println((int)'_');
//	System.out.println((int)'A');
//	System.out.println((int)'Z');
//	System.out.println((int)'a');
//	System.out.println((int)'z');
//	System.out.println((int)'0');
//	System.out.println((int)'9');
	System.out.println(covertBase16toBase10("12CA"));
}




}
