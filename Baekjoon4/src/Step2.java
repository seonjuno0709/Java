import java.util.Scanner;

public class Step2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int count = 0;
		
		for(int i = 1; i <= 9; i++)
		{
			int temp = sc.nextInt();
			if(max < temp)
			{
				max = temp;
				count = i;
			}
		}
		
		System.out.println(max);
		System.out.println(count);
	}

}
