package obsqurapackage;

public class String_Methods {

	public static void main(String[] args) {
		//Length method
	String a ="String Length Method";
	int size = a.length();              //Calculate the length of the string
	System.out.println(size);
	
	//charAt
	String b = "Index Position of the character";
	char position = b.charAt(4);       //Returns the character at the specified index (position)
	System.out.println(position);
	
	//Value of method
	int c = 52;
	String d = String.valueOf(c);   //Returns the string representation of the specified value
	System.out.println(c);
	
	//Equals method
	String e = "Equals method";
	String f = "Equals method";
	String g = "equals Method";
	System.out.println(e.equals(f));   //Compares content and case of two strings
	System.out.println(g.equals(e));
	
	//equalsIgnoreCase
	System.out.println(g.equalsIgnoreCase(e)); //Compares the content of two strings
	
	//concat two string
	String h = "Concat ";
	String i = h.concat("Two Strings ");       //will add new string with existing string 
	String j = i.concat("With Another String ");
	System.out.println(j);
			
	//split
	String array[] = a.split(" ");
	for (int k =0; k<array.length; k++)
	{
		System.out.println(array[k]);
	}
	
	// Split one world
	String array1[] = e.split(" ");
	System.out.println(array1[0]); // will display the element in the given index position only
	
	//trim
	String l = " Check Trim ";
	String m = l.trim();
	System.out.println(m);  //Removes whitespace from both ends of a string	
	}

}
