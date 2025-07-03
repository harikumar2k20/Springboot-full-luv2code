package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);

		List<Integer> numbers = Arrays.asList(1,2,2,2,3,4,6,6,7);
		System.out.println(numbers);
		List<Integer> unique = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("numbers: "+numbers);
		System.out.println("unique numbers: "+unique);

		//Count most second frequent word in list
		List<String> fruits = Arrays.asList("apple","apple","mango","banana","orange","orange","banana","apple","banana","banana");
		System.out.println(fruits);
		Map<String, Long> map = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		Optional<Map.Entry<String, Long>> first = map.entrySet()
				.stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.skip(1)
				.findFirst();
		System.out.println("second frequent occurred string: " + first);
	}

}
