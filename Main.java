import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int a =1;
		int b=2;
		int c=3;
		int d=4;
		int e=0;
		String input;
		String[] in = null;
		input=sc.nextLine();
		in=input.split("");
		for(int i=0; i<(input.length()); i++)
		{
			if(in[i].equals("V"))
			{
				e=a;
				a=b;
				b=e;
				e=c;
				c=d;
				d=e;
			}
			else
			{
				e=a;
				a=c;
				c=e;
				e=b;
				b=d;
				d=e;
			}
		}
		System.out.println(a+" "+ b);
		System.out.println(c+" " +d);
		sc.close();
	}
}