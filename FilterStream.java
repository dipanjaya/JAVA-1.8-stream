package stream.filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStream {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(35);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		marks.add(10);
		marks.add(10);

		System.out.println(marks);

//		FILTER
// 		List<Integer> updatedMarks = marks.stream().filter(i->i>=12).collect(Collectors.toList());
// 		System.out.println(updatedMarks);

//		MAP
// 		List<Integer> l= marks.stream().map(i->i+5).collect(Collectors.toList());
// 		System.out.println(l);

//		COUNT
//		int noOfFailedStudents = (int) marks.stream().filter(i->i<17).count();
// 		System.out.println(noOfFailedStudents);

//		SORTING USING COMPARATOR
//		List<Integer> ascendingOrder = marks.stream().sorted().collect(Collectors.toList());
//		System.out.println(ascendingOrder);

//		List<Integer> descendingOrder = marks.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
//				.collect(Collectors.toList());
//		System.out.println(descendingOrder);

//		COMPARE TO -------------- (-)before call of compareTo method makes it descending order === this method belongs from Comparator interface
//		List<Integer> descendingOrder = marks.stream().sorted((i1, i2) -> i1.compareTo(i2))
//				.collect(Collectors.toList());
//		System.out.println(descendingOrder);

//		SORTING STRING

		ArrayList<String> s = new ArrayList<>();
		s.add("a");
		s.add("aaaa");
		s.add("aa");
		s.add("aaaaa");
		s.add("aaa");
		s.add("xxx");

		Comparator<String> c = (s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 < l2)
				return -1;
			else if (l1 > l2)
				return +1;
			else
				return s1.compareTo(s2);
		};

//		System.out.println(s);
//		ArrayList<String> as = (ArrayList<String>) s.stream().sorted(c).collect(Collectors.toList());
//		System.out.println(as);

//		MIN AND MAX IN VALUE & STRING 

//		Integer min = marks.stream().min((s1,s2)->s1.compareTo(s2)).get();
//		System.out.println(min);

//		Integer max = marks.stream().max((s1,s2)->s1.compareTo(s2)).get();
//		System.out.println(max);

//		PRINTING TO THE CONSOLE USING STREAM
//		marks.stream().forEach(System.out::println);
//		Consumer<Integer> cons = i -> {
//			System.out.println("Square of each number is :: " + (i * i));
//		};

//		marks.stream().forEach(cons);
//		marks.stream().forEach(i -> {
//			System.out.println("Square of each number is :: " + (i - 2));
//		});

		Integer[] arr = marks.stream().toArray(Integer[]::new);
//		Stream.of(arr).forEach(System.out::println);
		
		Stream<Integer> s1 = Stream.of(arr);
		s1.forEach(System.out::println);
		
		
	}

}
