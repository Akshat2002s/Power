import java.util.*;
public class power {
	static double calculate(double a, int b) {
		double ans= Math.pow(a, b);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the base");
		double base= sc.nextDouble();
		System.out.println("Input the power");
		int exp= sc.nextInt();
		double ans= calculate(base,exp);
		System.out.println(ans);
		sc.close();

	}

}
