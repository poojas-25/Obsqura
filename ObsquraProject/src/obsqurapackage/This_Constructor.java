package obsqurapackage;

public class This_Constructor {

	public static void main(String[] args) {
		This_Constructor var = new This_Constructor();

	}
	public This_Constructor()
	{
		this(2);                                    //calling constructor with parameter int. 
		System.out.println("Non parameterized");
	}
	public This_Constructor(int a)
	{
		this(3.4f);                                //calling constructor with parameter float
		System.out.println(a);
	}
	public This_Constructor(float a)
	{
		System.out.println(a);
	}

}
