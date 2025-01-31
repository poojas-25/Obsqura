package obsqurapackage;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) 
	{
        Factorial.fact1();
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the number");
        Factorial.fact2(v.nextInt());
    }

    public static void fact1()                     //Non-parameterized method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        double f = 1;

        for(int i=1; i<=a; i++)
        {
            f = f*i;
        }
        System.out.println("Factorial of "+ a + " is " +f);
        System.out.println();
    }


    public static void fact2(int a)                //parameterized method
    {
        double f =1;
        for(int i=1; i<=a; i++)
        {
            f = f*i;
        }
        System.out.println("Factorial of "+ a + " is " +f);
    }
}
