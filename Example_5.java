//multiple arguements
public class Example_5{
	public static void main(String[]args)
	{
		int size;
		size=args.length;
		System.out.print("this is what you supplied....");
		for(int index =0;index<size;index++)
		{
			System.out.print(args[index]+" ");
		}
	}
}