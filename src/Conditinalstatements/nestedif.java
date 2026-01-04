package CoreJava;

public class nestedif {

	public static void main(String[] args) {
		int marks = 87;
		int mathscore = 74;
		if (marks >=80)
		{
         System.out.println("eligible for admission "+ marks);
		if (mathscore>=75){
			System.out.println("your eligible bcz of maths score");
		}else {
			System.out.println("not eligible bcz of maths score");
		}
		}else {
			System.out.println("Not eligible");
		}
		

}}
