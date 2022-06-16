import java.util.Scanner;

public class Step1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i < n; i++)
		{
			int temp = sc.nextInt();
			if(max < temp)
				max = temp;
			if(min > temp)
				min = temp;
		}
		
		System.out.print(min + " " + max);
	}

}
