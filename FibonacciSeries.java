package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0, 1, 1, 2, 3, 5, 8, 13
		int num1=0;
		int num2=1, sum=0;
		System.out.println(num1);
		System.out.println(num1+num2);
		for(int i=1;i<=6;i++)
		{
		    sum=num1+num2;
		    System.out.println(sum);
			num1=num2;
			num2=sum;
			//System.out.println(num1);
			//1
			
		}
		
	}

}
