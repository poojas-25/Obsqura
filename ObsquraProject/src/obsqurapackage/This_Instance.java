package obsqurapackage;

public class This_Instance {
	int a;

	public static void main(String[] args) {
		This_Instance var = new This_Instance(2);
		var.instance();

	}
	public void instance()
	{
		System.out.println(a);
	}
	public This_Instance(int a)
	{
		this.a = a;
	}

}
