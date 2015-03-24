package no.ums.interview;

import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Tools to generate fibbonacci numbers.
 *
 * @author Ståle Undheim <su@ums.no>
 */
public interface Fibbonacci {

    /**
     * Creates a stream of Fibonacci numbers.
     *
     * This should be an infinite stream starting at 1, 1, 2, 3, 5 and so on.
     *
     * Accessing numbers beyond {@link Long#MAX_VALUE} will result in random overflow variables being returned.
     *
     * @return a stream of fibonacci numbers
     */
    static LongStream stream()
    {
       // return LongStream.generate(() -> 1L);
    	return LongStream.generate(new LongSupplier() {
    	    private long n1 = 1;
    	    private long n2 = 1;

			@Override
			public long getAsLong() {
				long fibonacci = n1;
    	        long n3 = n2 + n1;
    	        n1 = n2;
    	        n2 = n3;
    	        return fibonacci;
			}
    	});
    }

    static LongStream evenFibbonacciNumbers() 
    {
        return stream().filter(n -> n % 2 == 0);
    }

    
}
