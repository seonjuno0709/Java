import java.util.Scanner;

public class Step3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] result = new int[10];
		
		int v = 1;
		for(int i = 0; i < 3; i++)
		{
			v *= sc.nextInt();
		}
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = 0;
		}
		
		String a = Integer.toString(v);
		for(int i = 0; i < a.length(); i++)
		{
			result[Character.getNumericValue(a.charAt(i))]++;
		}
		
		for(int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
		
		
	}

}
