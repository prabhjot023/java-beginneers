import java.util.*;
public class anagram_ques {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		s1=sc.next();
		s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String s=new String(ch);
		String ss=new String(ch1);
		if(s.equals(ss))
				{
			System.out.print("Anagrams");
				}
		else{
			
			System.out.print("Not Anagarams");
		}

	}

}
