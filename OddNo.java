package week1.day1;

public class OddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i=0;i<=input.length-1;i++)
		{
			if(input[i]%2!=0)
			{
				System.out.println("Odd No. are:"+ input[i]);
			}
		}

	}

}
