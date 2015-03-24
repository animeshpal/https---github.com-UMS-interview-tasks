package no.ums.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FizzBuzz generator.
 *
 * @author Ståle Undheim <su@ums.no>
 */
public interface FizzBuzz {

    /**
     * Given an intStream, return a stream of strings following the FizzBuzz rules.
     *
     * Any number divisible by 3 should be replaced by Fizz.
     * Any number divisible by 5 should be replaced by Buzz.
     * Any number divisible by 15 should be replaced by FizzBuzz.
     * All other numbers as is.
     *
     * @param intStream source stream
     * @return FizzBuzzStream
     */
	static Stream<String> toFizzBuzzStream(IntStream intStream) {
		int[] numbers = intStream.toArray();
		List<String> output = new ArrayList<String>();
		for (int count = 0; count < numbers.length; count++) {
			if (numbers[count] % 5 == 0 && numbers[count] % 3 == 0) {
				output.add("FizzBuzz");
			} else if (numbers[count] % 3 == 0) {
				output.add("Fizz");
			} else if (numbers[count] % 5 == 0) {
				output.add("Buzz");
			} else {
				output.add(new Integer(numbers[count]).toString());
			}

		}
		return output.stream();
	}

}
