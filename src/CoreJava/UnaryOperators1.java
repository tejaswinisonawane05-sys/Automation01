package CoreJava;

public class UnaryOperators1 {

	public static void main(String[] args) {
		int a =10;
		int b = 5;
		int expressionresult =(++a - --b + a-- - b++); //11-4+11 -4
		System.out.println("expressionresult "+ expressionresult);
//++ a= 11 --b=4 a--=it will print same 11 and b++=4
}
}
