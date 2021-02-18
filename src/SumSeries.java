import java.util.Scanner;
public class SumSeries {

	public static void main(String[] args) {
		int i,n,sum=0;
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is:"+sum);

	}

}
