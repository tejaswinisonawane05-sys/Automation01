package Conditinalstatements;

public class nestedif3 {

	public static void main(String[] args) {
		int age= 16;
		if (age >=18)
			if (age<=17)
			{
				System.out.println(age +"Entry Denied");
			}
			else {
				System.out.println(age +" Entry allowed");
			}
	}

}
