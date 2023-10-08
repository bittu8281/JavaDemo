package ProgrammingCode;

public class PlandromNumber {

	public static void main(String[] args) {
		  int n= 121;
				   int p ;
//			string	 n=n.toString();
				 
				      for(int j=n;j>=0;j--){
				            p+=n[j];
				 }
				 if(n==p){
				    System.out.println(" Yes it is a Palindrome Number");
				 }
				 else{
				    System.out.println("No it's not a Palindrome Number");
				 }

	}

}
