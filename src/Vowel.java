import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character: ");
		c=s.next().charAt(0);
		
		if(c=='a' || c=='A' || c=='E' || c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is not a vowel");
		}

	}

}
