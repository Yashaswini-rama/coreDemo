import java.util.Scanner;
public class SwsitchDemo {

	public static void main(String[] args) {
		int a,b,res;
	    String op;
	   Scanner   s=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("Enter operator:");
	     op=s.next();
	     
	     switch(op)
	     {
	     case "+": res=a+b;
	               System.out.println("The Addition is: " +res);
	               break;
	     case "-": res=a-b;
                   System.out.println("The Substraction is: " +res);
                   break;
	     case "*": res=a*b;
                   System.out.println("The Multiplication is: " +res);
                   break;
	     case "/": res=a/b;
                   System.out.println("The Division is: " +res);
                   break;
	     case "%": res=a%b;
                   System.out.println("The Remainder is: " +res);
                   break;

         default:  System.out.println("Invalid Operator");
                   break;

	     }
	}

}
