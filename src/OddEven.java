import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("Entered Number is Even");
		}
		else
		{
			System.out.println("Entered Number is odd");
		}
		s.close();
	}

}
