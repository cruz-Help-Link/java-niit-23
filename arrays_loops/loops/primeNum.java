import java.util.*;
class primeNum {
	public static void main(String[] args) {
		int i =0;
      	int num =0;
      	String  primeNums = "";

      	for (i = 1; i <= 100; i++) { 		  	  
         	int next=0; 	  
         	for(num =i; num>=1; num--){
            	if(i%num==0){
 				next = next + 1;}
	  		}
	  		if (next ==2){
	     		primeNums = primeNums + i + " ";
			}	
       	}	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNums);
   }
	}

// for (int i = 1; i < 100; i++) {
// 			if (i % 2 != 0) {