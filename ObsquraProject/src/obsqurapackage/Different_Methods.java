package obsqurapackage;

public class Different_Methods {

	public static void main(String[] args) {
		System.out.println(Different_Methods.staticemethod(2,3));

        Different_Methods obj = new Different_Methods(2,3);
        System.out.println(obj.instancemethod(10, 2.4f));
        System.out.println(obj.instancemethod());
    }

    public static int staticemethod(int a ,int b)         //Static method
    {
        int sum = a + b;
        return sum;
    }

    public float instancemethod(int a, float b)           //Instance method
    {
        float diff = a-b;
        return diff;
    }

    public Different_Methods(int a ,int b)                //constructor
    {
        int prod = a*b;
        System.out.println(prod);
    }

    public String instancemethod()
    {
        String a ="Name";
        return a;
    }

	

}
