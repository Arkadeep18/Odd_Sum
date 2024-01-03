import java.util.*;
public class Prac42 {
	
	public static void OddSum(int n) {
		int sum = 0;
		
		for(int a = 1; a<=n; a++) {
			if( a%2 != 0) {
			  sum = sum +a;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		OddSum(n);
	}
	

}

 