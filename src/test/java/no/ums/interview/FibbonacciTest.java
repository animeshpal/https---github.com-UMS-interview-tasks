package no.ums.interview;

import org.junit.Test;

import java.util.stream.LongStream;

import static java.util.stream.Collectors.joining;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Ståle Undheim <su@ums.no>
 */
public class FibbonacciTest {

    @Test
    public void testFirstNumbers() throws Exception {
        final LongStream first10 = Fibbonacci.stream().limit(10);
        final String first10sha1 = Sha1.sha1(first10.mapToObj(String::valueOf));
        assertThat(first10sha1, equalTo("0e9ad414bb65d9b8f8dae4657db4cf0994485f56"));
    }

    @Test
    public void testEvenSum() throws Exception {
        assertThat(Fibbonacci.evenFibbonacciNumbers().limit(20).sum(), equalTo(2026369768940L));
    }
}
