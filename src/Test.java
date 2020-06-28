import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

public class Test {

	/*
	 * Bar modify(Foo1 foo) { int i = foo.change(2); return (x, y) -> x.change(y) +
	 * i;}
	 */
	/*
	 * static long calculate(int factor, Function<Integer, Long> func) { return
	 * func.apply(factor); }
	 */

	/*
	 * static boolean validate(Validator v, Predicate<Validator> predicate) { return
	 * predicate.test(v); } // Line 1
	 */

	/*
	 * boolean m2(Foo2 foo) { return !foo.m1(); }
	 */

	/*
	 * static int i;
	 * 
	 * static int increase() { return i++; }
	 */

	/*
	 * static int add(int i1, int i2) { System.out.print(0); return i1 + i2; }
	 */

	/*
	 * static int calculate(List<Integer> list, int seed, BinaryOperator<Integer>
	 * func) { // Line 1 if (list.isEmpty()) { return seed; } int result = seed; for
	 * (Integer integer : list) { result = func.apply(result, integer); // Line 2 }
	 * return result; }
	 */

	public static void main(String[] args) throws IOException {

		
		String output = Stream.of("hi", "fi").parallel()
				.reduce("-", (s1, s2) -> s1 + s2);
				System.out.println(output);
		/*
		 * Stream.iterate(0, i -> i < 5, i -> i + 1).filter(i -> i % 2 == 0).filter(i ->
		 * i % 3 == 0) .forEach(System.out::print);
		 */

		/*
		 * Object o = Stream.empty().findAny().get(); System.out.println(o);
		 */

		/*
		 * List<Integer> list = List.of(1, 2); int i = list.stream().reduce(0,
		 * Integer::sum, Integer::sum); System.out.println(i);
		 */
		/*
		 * StringBuilder result = Stream.of("a",
		 * "b").parallel().collect(StringBuilder::new, StringBuilder::append, (a, b) ->
		 * a.append(b)); System.out.println(result);
		 */

		/*
		 * boolean b = Stream.of("Alice", "Bob").anyMatch(s -> { System.out.println(s);
		 * return s.startsWith("B"); }); if (b) { System.out.println("Bob"); } else {
		 * System.out.println("Alice"); }
		 */
		/*
		 * List<Integer> integers = List.of(1, 2, 3, 4); int result =
		 * calculate(integers, 0, (i1, i2) -> i1 * i2); // Line 3
		 * System.out.println(result);
		 */
		/*
		 * List<Integer> integers = List.of(0, 1, 2, 3); integers.stream().peek(i -> {
		 * if (i % 2 != 0) System.out.print(i); }).forEach(i -> { if (i % 2 == 0)
		 * System.out.print(i); });
		 */

		/*
		 * Path path1 = Path.of("a/b"); Path path2 = Path.of("a/c");
		 * System.out.println(path1.relativize(path2));
		 */

		/*
		 * Path path = Paths.get("a/b/c"); Path sub = path.subpath(1, 2);
		 * System.out.println(sub);
		 */

		/*
		 * String result = List.of("a", "b").parallelStream().collect(String::new,
		 * String::concat, String::concat); System.out.println(result);
		 */

		/*
		 * Data1 data1 = new Data1(1); Data1 data2 = new Data1(2); int result =
		 * Stream.of(data1, data2).reduce(0, (d1, d2) -> d1 + d2.number, Test::add);
		 * System.out.print(result);
		 */

		/*
		 * List<String> list = Arrays.asList("A", "B", "C"); UnaryOperator<String>
		 * operator = String::toLowerCase; // Line 1 Consumer<String> consumer =
		 * System.out::print; // Line 2 list.stream().map(operator).forEach(consumer);
		 * // Line 3
		 */
		/*
		 * Stream<String> strings = Stream.of("United", "States");
		 * BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2.toUpperCase());
		 * String result = strings.reduce("-", operator); System.out.println(result);
		 */

		/*
		 * int j = Stream.of(0).findAny().orElse(increase()); System.out.println(i + " "
		 * + j);
		 */
		/*
		 * Path p = Path.of("f1.txt"); Files.writeString(p, "Hello"); var out =
		 * Files.newOutputStream(Path.of("f2.txt")); Files.copy(p, out,
		 * REPLACE_EXISTING);
		 */

		// Stream.of(0).findFirst().map(i ->
		// null).orElseThrow(ArithmeticException::new);

		/*
		 * Stream<Integer> stream = Stream.of(1, 2, 3, 4); stream.filter(i -> i % 2 ==
		 * 0).skip(2).forEach(System.out::print);
		 */

		/*
		 * Path p = Path.of("logs/today.txt"); Files.createFile(p.getParent()); // Line
		 * 1 Files.createDirectory(p.getFileName()); // Line 2
		 */

		/*
		 * Person1 person = new Person1("John", "Smith"); Supplier<String> supplier =
		 * person::getFullName; System.out.print(supplier.get());
		 */

		/*
		 * Data data1 = new Data(1); Data data2 = new Data(2); Stream.of(data2, data1)
		 * .sorted() .forEach(d -> System.out.print(d.number));
		 */

		/*
		 * Test test = new Test(); boolean result = test.m2();
		 */
		/*
		 * Path path1 = Path.of("/a/b/c/d"); Path path2 = Path.of("/a/b/");
		 * System.out.println(path1.relativize(path2));
		 */

		/*
		 * List<Integer> integers = List.of(0, 1); integers.stream().count().forEach(i
		 * -> System.out.print(i));
		 */

		/*
		 * Stream<Integer> stream = Stream.of(1, 3, 5); Optional optional =
		 * Optional.of(stream.filter(i -> i % 2 == 0).reduce(Integer::sum)); // Line 1
		 * System.out.println(optional.get()); // Line 2
		 */
		/*
		 * Predicate<Integer> p1 = (int i) -> i % 2 == 0; // Line 1 Predicate p2 =
		 * (Integer i) -> i % 2 == 0; // Line 2 Predicate p3 = (Integer i) -> (int) i %
		 * 2 == 0; // Line 3 Predicate p4 = (var i) -> (Integer) i % 2 == 0; // Line 4
		 */
		/*
		 * try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt")))
		 * { String line; while ((line = reader.readLine()) != null) {
		 * System.out.println(line); } reader = new BufferedReader(new
		 * FileReader("file2.txt")); while ((line = reader.readLine()) != null) {
		 * System.out.println(line); } } catch (IOException e) { }
		 */

		/*
		 * List<Data> data = Arrays.asList(new Data(2), new Data(1)); Optional<Data>
		 * data1 = data.stream().findFirst(); Optional<Data> data2 =
		 * data.stream().findAny(); System.out.println(data1.get().getValue());
		 * System.out.println(data2.get().getValue());
		 */

		/*
		 * Function<String, Object> f1 = s -> s.toLowerCase(); // Line 1
		 * Function<String, Object> f2 = String::toUpperCase; // Line 2 Object o =
		 * f1.compose(f2).apply("Java"); // Line 3 System.out.println(o);
		 */

		/*
		 * Stream<Integer> stream = Stream.of(1, 2, 3); stream.filter(i -> i % 2 != 0);
		 * stream.forEach(System.out::print);
		 */

		/*
		 * StringBuilder result = Stream.of("x", "y").collect(() -> new
		 * StringBuilder("c"), StringBuilder::append, (a, b) -> b.append(a));
		 * System.out.println(result);
		 */

		/*
		 * Validator v = new Validator(false); boolean result = validate(v, v ->
		 * v.isValid()); // Line 2 System.out.println(result);
		 */

		/*
		 * Item i1 = new Item(Tag.CHEAP, 5.0); Item i2 = new Item(Tag.NORMAL, 10.0);
		 * Item i3 = new Item(Tag.NORMAL, 15.0); List<Item> items = List.of(i1, i2, i3);
		 * items.stream() .filter(i -> i.price > 5.0) .forEach(i -> i.tag =
		 * Tag.EXPENSIVE); items.stream() .forEach(i -> System.out.println(i.tag));
		 */
		/*
		 * Path p1 = Path.of("Z1.txt"); Path p2 = Path.of("Z2.txt"); Files.move(p1, p2);
		 * Files.delete(p1);
		 */

		/*
		 * int i = Stream.<Data>empty().findAny().map(d -> d.number).orElseGet(() -> 1);
		 * System.out.println(i);
		 */

		/*
		 * Optional o1 = Optional.empty(); Optional o2 = Optional.of(1); Optional o3 =
		 * Stream.of(o1, o2) .filter(Optional::isPresent) .findAny() .flatMap(o -> o);
		 * System.out.println(o3.orElse(2));
		 */

		/*
		 * Path root = Path.of("root123"); Path file = Path.of("root123/dir/f.txt");
		 * Files.createDirectories(file.getParent()); Files.createFile(file); long count
		 * = Files.find(root, 2, (p, a) -> true).count(); System.out.println(count);
		 */

		/*
		 * Person mandy = new Person(25, "Mandy"); Person zoey = new Person(20, "Zoey");
		 * Person alex = new Person(30, "Alex"); Optional<Person> person =
		 * Stream.of(zoey, mandy).max((p1, p2) -> p1.age + p2.age);
		 * System.out.println(person.get().name);
		 */
		/*
		 * Stream<String> stream1 = Stream.of("A").peek(System.out::print);
		 * System.out.print("B"); Stream<String> stream2 = Stream.of("A").distinct();
		 * Stream.concat(stream1, stream2).forEach(System.out::print);
		 */

		/*
		 * Path p1 = Path.of("logs/today"); // Line 1 Path p2 =
		 * Files.createDirectory(p1); // Line 2 Files.createDirectory(p1); // Line 3
		 * boolean refComp = p1 == p2; boolean valComp = p1.equals(p2);
		 * System.out.println(refComp + " " + valComp);
		 */

		/*
		 * Path path = Path.of("/a/../../b/././c");
		 * System.out.println(path.normalize());
		 */

		/*
		 * List<String> l1 = List.of("a", "b"); List<Integer> l2 = List.of(1, 2);
		 * Stream.of(l1, l2).flatMap(Stream::of).forEach(System.out::print);
		 * Stream.of(l1, l2).flatMap(Collection::stream).forEach(System.out::print);
		 */

		/*
		 * Test test = new Test(); Bar bar = test.modify(i -> i * 2); int result =
		 * bar.change(i -> i * 3, 4); System.out.println(result);
		 */

		/*
		 * List<Integer> ints = List.of(1, 6, 22, 21, 35, 36); Optional<Integer> result
		 * = ints.stream().filter(i ->i % 7 == 0).findFirst();
		 * result.ifPresentOrElse(System.out::print, () ->
		 * System.out.print("No results found"));
		 */

		/*
		 * IntStream stream = IntStream.range(1, 4); IntPredicate even = i -> i % 2 ==
		 * 0; IntPredicate odd = i -> i % 2 == 1; int totalEven =
		 * stream.filter(even).sum(); int totalOdd = stream.filter(odd).sum();
		 * System.out.println(totalEven + " " + totalOdd);
		 */

		/*
		 * Stream<Integer> stream = Stream.of(1, 2); Optional<Integer> optional = stream
		 * .anyMatch(i -> i % 2 == 0) .filter(i -> i % 2 == 1) .findAny();
		 * System.out.println(optional.get());
		 */

		/*
		 * Map<String, String> map = new LinkedHashMap<>(); BinaryOperator<String>
		 * operator = (s1, s2) -> null; map.put("John", "Teacher"); map.merge("John",
		 * "Doctor", operator); map.merge("Jane", "Doctor", operator);
		 * System.out.println(map);
		 */

		/*
		 * Stream<Integer> stream = Stream.of(3, 1); Optional optional =
		 * stream.findAny().filter(i -> i % 2 == 1); System.out.println(optional.get());
		 */

		/*
		 * int factor = 2; System.out.println(calculate(3, x -> factor * x));
		 */

		/*
		 * Path p1 = Path.of("f1.txt"); Path p2 = Path.of("f2.txt");
		 * Files.writeString(p1, "Hello"); Files.writeString(p2, "Hello");
		 * Files.move(p1, p2); boolean p1Exist = Files.exists(p1); boolean p2Exist =
		 * Files.exists(p2); System.out.println(p1Exist + " " + p2Exist);
		 */

		/*
		 * Stream.of(0).findAny() .or(() -> Optional.of(1))
		 * .ifPresentOrElse(System.out::println, i -> System.out.println(i));
		 */

		/*
		 * Path root = Path.of("root"); Path b = Path.of("root/a/b"); Path c =
		 * Path.of("root/c"); Files.createDirectories(b); Files.createDirectory(c);
		 * Files.walk(root).forEach(System.out::println);
		 */

		/*
		 * int sum = Stream.of(1, 2) .filter(i -> i> 0) // Line 1 .map(i -> 0 - i) //
		 * Line 2 .mapToInt(i -> i) // Line 3 .sum(); System.out.println(sum);
		 */

		/*
		 * List<Integer> l1 = List.of(1); List<Integer> l2 = List.of(1, 2);
		 * List<Integer> l3 = List.of(2, 3); List<Integer> l4 = List.of(3, 4, 5);
		 * Collection<Long> result = Stream.of(l1, l2, l3, l4)
		 * .collect(Collectors.groupingBy(List::size, Collectors.counting())) .values();
		 * System.out.println(result);
		 */

		/*
		 * Stream<String> stream = Stream.of("A", "B"); //String[] output =
		 * stream.toArray(String[]::new); String[] output = stream.toArray(count -> new
		 * String[count]); System.out.println(Arrays.toString(output));
		 */

		/*
		 * Stream<Integer> stream = Stream.of(77, 7, 57, 24); //int min =
		 * stream.reduce(7,(a,b)->a<b?a:b); int min =
		 * stream.min(Comparator.comparing(a->a)).orElse(0); //int min =
		 * stream.min(Comparator.comparingInt(a->a)).get(); System.out.println(min);
		 */

		/*
		 * Calculable calculable = l -> l * 2; // Line 1
		 * System.out.println(calculable.change(1)); // Line 2
		 */

		/*
		 * Stream<Integer> stream = Stream.of(0, 1); stream.forEach(i ->
		 * System.out.print(i)); stream.filter(i -> i > 0).forEach(System.out::print);
		 */

		/*
		 * Student s1 = new Student("Anna", Faculty.BUSINESS); Student s2 = new
		 * Student("Brian", Faculty.BUSINESS); Student s3 = new Student("Chris",
		 * Faculty.ENGINEERING); Student s4 = new Student("Dolores",
		 * Faculty.ENGINEERING); Stream.of(s1, s2, s3, s4)
		 * .collect(Collectors.partitioningBy( c -> c.getFaculty() == Faculty.BUSINESS
		 * )).forEach((k, v) -> System.out.println(v)); }
		 */

		/*
		 * Stream<Integer> s = Stream.<Integer>builder().add(-1).add(-2).build(); //
		 * Line //System.out.println(s.filter(i -> i < 0).count());
		 * s.peek(System.out::print).filter(i -> i < 0).count(); // Line 2
		 */

		/*
		 * Stream.of("one", "two", "three", "four") .filter(e -> e.length() > 3) .peek(e
		 * -> System.out.println("Filtered value: " + e)) .map(String::toUpperCase)
		 * .peek(e -> System.out.println("Mapped value: " + e))
		 * .collect(Collectors.toList());
		 */

		/*
		 * List<Integer> list = List.of(1, 3, 4, 5); Optional<Boolean> result =
		 * list.stream().noneMatch(i -> i % 2 == 1); System.out.println(result.get());
		 */

		/*
		 * List<String> list = List.of("a", "b", "c"); list.stream().forEach(s -> s =
		 * s.toUpperCase()); // Line 1 list.stream().forEach(System.out::print); // Line
		 * 2
		 */

		/*
		 * Path path = Path.of("a/b/c"); Path root = path.getRoot(); Path parent =
		 * path.getParent(); Path file = path.getFileName(); System.out.println(root +
		 * " " + parent + " " + file);
		 */

		/*
		 * List<Integer> list = List.of(2, 3); int i = list.parallelStream().reduce(1,
		 * Integer::sum, (i1, i2) -> i1 * i2); System.out.println(i);
		 */

		/*
		 * Person person = new Person("John"); Consumer<Person> consumer = (var p) ->
		 * System.out.print(p); consumer.accept(person);
		 */

		/*
		 * Stream<Integer> stream = Stream.of(1, 2, 3, 4); //var sum =
		 * stream.reduce(0,(x,y)->x+y); var sum = stream.mapToInt(x->x).sum();
		 * System.out.println(sum);
		 */

		/*
		 * Path path1 = Path.of("dir1/dir2"); Path path2 = Path.of("dir1/dir2");
		 * System.out.println(path1.resolve(path2));
		 */

		/*
		 * Set<Integer> set = new HashSet<>(List.of(4, 1, 5, 2));
		 * set.stream().forEach(System.out::print);
		 */

		/*
		 * List<Integer> l1 = List.of(1, 2, 3); List<Integer> l2 = List.of(2, 4, 6);
		 * List<Integer> l3 = List.of(3, 6, 9); Stream<List<Integer>> stream =
		 * Stream.of(l1, l2, l3); stream.flatMap(Collection::stream).distinct()
		 * .peek(System.out::print).noneMatch(l->l<0);
		 */

		/*
		 * Path p = Path.of("test.txt"); Files.writeString(p, "Hello", APPEND);
		 * System.out.println(Files.readString(p));
		 */

		/*
		 * Data data = Stream.<Data>empty().findAny().or(() -> Optional.of(new Data(1)))
		 * // Line 1 .orElseGet(() -> new Data(2)); // Line 2
		 * System.out.println(data.number);
		 */

		/*
		 * Movie m1 = new Movie("The Godfather", 9.5); Movie m2 = new
		 * Movie("The Transporter", 8.5); Stream.of(m1, m2) .peek(m ->
		 * System.out.print(m.title)) .filter(m -> m.rating >= 9.0) .forEach(m ->
		 * System.out.println(m.title));
		 */

		/*
		 * Path p1 = Path.of("f3.txt"); Path p2 = Path.of("f4.txt"); try {
		 * Files.move(p1, p2); } catch (IOException e) { } Files.delete(p1);
		 * System.out.println(Files.notExists(p1));
		 */

		// Stream.of(Optional.ofNullable(null)).findFirst().ifPresent(System.out::println);

		/*
		 * Path path = Path.of("../root/xyz/abc.txt");
		 * System.out.println(path.getName(4));
		 */

		/*
		 * Person p1 = new Person("John"); Person p2 = new Person("Jane"); Person p3 =
		 * Stream.of(p1, p2).findAny().orElseGet(()->getPerson());
		 * System.out.println(p1.equals(p3) + " " + p2.equals(p3));
		 */

		/*
		 * Stream<Person> stream = Stream.of(new Person("John")); stream.map(p -> p.name
		 * = "Jane").forEach(System.out::println);
		 */

		// Stream<String> stream = Stream.<String>builder().add("a").build();

		/*
		 * Function<Integer, Double> f1 = i -> (double) (i + 2); // Line 1
		 * Function<Double, Integer> f2 = d -> (int) (d * 3); // Line 2 Function<Number,
		 * Number> f3 = f2.andThen(f1); // Line 3 System.out.println(f3.apply(1)); //
		 * Line 4
		 */

		/*
		 * List<String> list = List.of("a", "b", "cd", "ef", "ghij"); Map<Integer,
		 * String> data = list.stream() .collect(Collectors.groupingBy(String::length,
		 * Collectors.joining())); System.out.println(data.values());
		 */

		/*
		 * List<Integer> integers = List.of(0, 1, 2);
		 * integers.stream().peek(System.out::print).limit(2).forEach(i -> {});
		 */

		/*
		 * StringBuffer us = new StringBuffer("US"); StringBuffer uk = new
		 * StringBuffer("UK"); Stream<StringBuffer> stream = Stream.of(us, uk); String
		 * output = stream.collect(Collectors.joining("-", "=", ""));
		 * System.out.println(output);
		 */

		/*
		 * List<Integer> result = List.of(1, 2).parallelStream().collect(ArrayList::new,
		 * (x, y) -> x.add(y), (x, y) -> x.addAll(y)); System.out.println(result);
		 */

	}

}
