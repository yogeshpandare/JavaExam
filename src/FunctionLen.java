import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionLen {

	public static void main(String[] args) {
		//List<String> strList = Arrays.asList("a", "aa", "aaa"); Function<String, Integer> f = x->x.length(); Consumer<Integer> c = x->System.out.print("Len:"+x+" "); strList.stream().map(f).forEach(c);

	/*	String val1 = "hello";         StringBuilder val2 = new StringBuilder("world");         
		UnaryOperator<String> uo1 = s1->s1.concat(val1); //1         
		UnaryOperator<String> uo2 = s->s.toUpperCase(); //2         
		System.out.println(uo1.apply(uo2.apply(val2))); //3 */
		
		//List<String> vals = Arrays.asList("a", "b"); String join = vals.parallelStream()         .reduce("_",                 (a, b)->a.concat(b)                 ); System.out.println(join);
		
//        var nums = List.of(1, 2, 3, 4, 5, 6, 7).stream();          
//        Predicate<Integer> p = a->a%2==0;          
//        Optional<Integer> value = nums.filter(p).reduce((a, b)->a+b);         
//        value.ifPresent(System.out::println); 
		
		//IntStream is = IntStream.range(1, 5); OptionalInt sum = is.reduce((a, b)->a+b); System.out.println(sum.orElse(0));
	
	
		/*
		 * List<Integer> ls = Arrays.asList(10, 47, 33, 23); int max =
		 * ls.stream().max(Comparator.comparing(a->a)).get(); System.out.println(max);
		 * //1
		 */	
		
	}
}
