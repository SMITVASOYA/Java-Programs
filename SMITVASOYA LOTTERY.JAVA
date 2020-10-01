import java.util.Scanner;
public class Lottery
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			int d =(int) (Math.random()*100);
		int a,b,c,e;
		System.out.println("enter lottery number : " );
		int x= sc.nextInt();
		while(true)
		{
		if(d==x)
		{
			System.out.println("you win 10000");
			break;
		}
				a=x/10;
				b=((x%10)*10)+a;
		if(d==b)
		{
		System.out.println("you win 3000");
		break;
		}
		c=x%10;
		e=d%10;
		a=x%10;
		if(e==a || e==c)
		{
			System.out.println("you win 1000");
			break;
		}
		x= sc.nextInt();
		}
	}
}
	
