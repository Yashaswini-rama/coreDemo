import java.util.Scanner;
public class GreatestTo {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		
		if(a>b)
		{
			System.out.println(a+ " is greater than" +b);
		}
		else
		{
			System.out.println(b+ " is greater than " +a);
		}
		s.close();
	}

}
