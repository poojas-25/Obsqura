package obsqurapackage;

public class This_Keyword {

	public static void main(String[] args) {
		This_Keyword var = new This_Keyword();
		var.instance();
		//var.instance(3);
	}
	 public void instance()
	 {
		 this.instance1(3);
		 System.out.println("This");
	 }
	 public void instance1(int a)
	 {
		 this.instance2();
		 System.out.println(a);
	 }
	 public void instance2()
	 {
		 System.out.println("Test");
	 }
	 
}
