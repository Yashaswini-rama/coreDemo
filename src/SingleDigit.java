import java.util.Scanner;
public class SingleDigit {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=s.nextInt();
		if(a>=-9 && a<=9)
		{
			System.out.println("Entered number is a single digit");
		}
		else
		{
			System.out.println("Entered number is not a single digit number");
		}
		s.close();

	}

}
