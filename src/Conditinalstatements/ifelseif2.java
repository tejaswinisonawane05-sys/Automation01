package Conditinalstatements;

public class ifelseif2 {

	public static void main(String[] args) {
		int temp = 29;
		if (temp>30) {
			System.out.println(temp+ " Hot");
		}
		else if (temp>=20 && temp<=30) {
			System.out.println(temp+ " Warm");
		}
		else if (temp>=10 && temp<=19) {
			System.out.println(temp+ " Cold");
		}
		else {
			System.out.println(temp+ " Very cold");
		}
	}
	
}
