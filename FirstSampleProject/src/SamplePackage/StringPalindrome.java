package SamplePackage;

public class StringPalindrome {

	public static void main(String[] args) {
		String str1="sjava";
		String str2="malayalam";
		String rev1="";
		String rev2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev1=rev1+str1.charAt(i);
		}
		if(str1.equals(rev1)) 
		{
			System.out.println(str1+" is a Palindrome String");
		}
		else 
		{
			System.out.println(str1+" is  Not Palindrome String");
		}
		for(int j=str2.length()-1;j>=0;j--)
		{
			rev2=rev2+str2.charAt(j);
		}
		if(str2.equals(rev2)) 
		{
			System.out.println(str2+" is a Palindrome String");
		}
		else 
		{
			System.out.println(str2+" is a Not Palindrome String");
		}

	}

}
