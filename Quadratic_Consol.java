import java.util.Scanner;
public class Quadratic_Consol {	
	public static void main(String[] args) {	
		//Input:
		Scanner input = new Scanner(System.in);		
		Double a, b, c, d;
		System.out.println("Enter a ->");
		a = input.nextDouble();
		System.out.println("Enter b ->");
		b = input.nextDouble();
		System.out.println("Enter c ->");
		c = input.nextDouble();

			a*=2;
			d = b*b - 2*a*c;			

		if(d<0){
			System.out.println("There are no decisions");
			return;
		}				
		if(d == 0)
			System.out.println("X = " + (-b/a) );
		else{
			d = Math.sqrt(d);
			System.out.println("X = " + (-b+d)/a + "\tor");
			System.out.println("X = " + (-b-d)/a);
		}
	}
}	
