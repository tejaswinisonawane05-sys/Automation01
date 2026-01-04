package CoreJava;

public class Switch {

	public static void main(String[]args) {  
	char ch = 'Z';
      switch (ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
    	  System.out.println(ch  + " is Vowel"); break;
      default:System.out.println(ch  + " is Consonant");
      
           }
		
	}

}
