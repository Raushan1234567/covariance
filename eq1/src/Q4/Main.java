package Q4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		
		List<Data> p=new ArrayList<>();
		
		p.add(new Data(2, 3.2f, "raush"));
		p.add(new Data(4, 3.2f, "paush"));
		p.add(new Data(6, 4.2f, "laush"));
		p.add(new Data(7, 5.2f, "haush"));
		p.add(new Data(8, 6.2f, "waush"));
		p.add(new Data(9, 7.2f, "baush"));
		p.add(new Data(1, 8.2f, "qaush"));
		p.add(new Data(23, 9.2f, "aaush"));
		p.add(new Data(56, 1.2f, "zaush"));
		p.add(new Data(67, 12.2f, "xaush"));
		
		
		System.out.println(p.stream().map(a -> a.getFloatvar()).sorted().skip(2).limit(5).toList());
		
		System.out.println(p.stream().mapToInt(Data::getIntVar).reduce(0, Integer::sum));
		
		

	}

}
