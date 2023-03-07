import java.util.Scanner;
public class Project {
	public static void main(String[] args) {
		int num1,num2,result=1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value ");
		num1 = input.nextInt();
		
		System.out.print("Enter a value ");
		num2 = input.nextInt();
		
		for(int i=1;i<=num2;i++) {
			result = result * num1;
		}
		System.out.print("Result is " + result);
	}
}
