package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=7;
		int out,ans = 1;
		for(int i=input;i>=1;i--)
		{
			out=ans*i;
			ans=out;
		}
		System.out.println(ans);

	}

}
