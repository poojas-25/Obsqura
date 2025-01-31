package obsqurapackage;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Hello");
		
		//append method
		a.append(" World");                         
		System.out.println(a);

		//insert method
		a.insert(6, "Good ");    //adds the string "Good" at 6th index position
		System.out.println(a);
		
		//replace method
		a.replace(11, 16, "Day"); //Will replace the string between the given index position
		System.out.println(a);
		
		//delete method
		a.delete(6, 11);          // till 11 for removing the extra space
		System.out.println(a);
		
		//reverse method
		a.reverse();
		System.out.println(a);
	}

}
