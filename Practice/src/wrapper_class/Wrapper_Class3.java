package wrapper_class;

public class Wrapper_Class3 {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x);
		
		int y =	Integer.parseInt(x);
		System.out.println(y+20);
		
		System.out.println("\n******double******");
		String x1 = "12.30";
		System.out.println("x1 ="+x1);
		
		double d = Double.parseDouble(x1);
		System.out.println("d ="+d);
		
		System.out.println("\n******boolean******");
		String x2 = "true";
		boolean b = Boolean.parseBoolean(x2);
		System.out.println("b ="+b);
		
		System.out.println("\nint to String");
		int i = 100;
		String s = String.valueOf(i);
		System.out.println("s ="+s);
		System.out.println(s+20);
		
		System.out.println("\nint to Integer :");
		int a = 20;
		Integer c = Integer.valueOf(a);
		Integer e = a;
		System.out.println("c =" +c+ " & " +" e ="+e);
		
		System.out.println("\nInteger to int :");
		Integer m = 100;
		int n = m.intValue();
		System.out.println("n ="+n);
		
		System.out.println("\nsum of String :");
		String [] arr = {"10", "20"};
		System.out.println("before sum :"+arr[0]+arr[1]);
		
		int p = Integer.parseInt(arr[0]);
		int q = Integer.parseInt(arr[1]);
		int r = p+q;
		System.out.println("after sum : "+r);
		
		String o = "100A"; //numberFormatException---for input string "100A";
		int o1 = Integer.parseInt(o);
		System.out.println("o1 ="+o);
		
		
	}

}
