import java.lang.StringBuilder;

public class StringPool {

	public static void main(String[] args) {
		
	  System.out.println("\nInside stringPool ...");
	  String s1 = "hello!";				// A String pool is created for the String literal "hello" in the heap
	  String s2 = "hello!";				// s2 references the same memory in the String pool (Points to same string object in the String Table
	  String s3 = "hello!".intern();	// Double intern invocation (the first one by JVM itself)
	  String s4 = new String("hello!");	// New starage that holds reference to the string literal "hello" in the Sting Pool but the object is in the heap 
	  String s5 = "lo!";				// 
	  String s6 = s1;					// s3 references the same memory in the String pool (s1)
	  
      System.out.println("s1 == s2: " + (s1 == s2));
      System.out.println("s1 == s3: " + (s1 == s3));
      System.out.println("s1 == s4: " + (s1 == s4));
      System.out.println("s1 == s4.intern(): " + (s1 == s4.intern())); // Creates an intern in the String Pool ... so the String is there ... it will reference to the String object already created
      System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
      System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5)); // The variable s5 is a variable and it is not going to be evaluated until run-time so it will not be considered as Literal. (Literals are created at compile time) 
	  System.out.println("s1 == s6: " + (s1 == s6));
	
	
		//String Immutability
		System.out.println("\n\n Concept of String immutability");
		String str1 = new String("abc");
		System.out.println(str1);
		str1 = new String ("1234");
		System.out.println(str1); //above object is abandoned and ready for garbage collection 

		
		//StringBuilder allow us to mutate Strings
		//StringBuffer sb = new StringBuffer();  // Obselet! It is synchronized but slow
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" world");
		String s9 = sb.append("Good").append(" morning").toString(); 
		System.out.println(sb);
		sb.delete(1,5); //Start and end index
		System.out.println(sb.toString());
		sb.insert(1,"ey");
		System.out.println(sb.toString());
		System.out.println("Length of the String is " + sb.length());
	}
}