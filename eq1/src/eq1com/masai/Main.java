package eq1com.masai;

import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		List<Integer> p=Arrays.asList(2,3,4,5,-6,-8,-5);
		
		List<Double> d=Arrays.asList(1.0,-1.0,-3.0,7.0,8.0);
		
		List<Number> n=new ArrayList<>();
		
		findNegativeOnly(p,d,n);
		System.out.println("List of Intger:"+p);
		System.out.println("List of Double:"+d);
		System.out.println("List of all negative number:"+n);

	}

	private static void findNegativeOnly(List<? extends Number> p, List<? extends Number> d, List<? super Number> n) {
	
		p.forEach(a -> 
		{
			if(a.doubleValue()<0) {
				n.add(a);
			}
		});
				

		d.forEach(a -> 
		{
			if(a.doubleValue()<0) {
				n.add(a);
			}
		});
	}

}
