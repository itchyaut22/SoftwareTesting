/**
 * 
 */
package exercise01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @author martin
 *
 */
public class RingBufferTest {
	
	private static final int SIZE = 10;
	
	@Test
	public void testRingBufferInitialization() {
		RingBuffer<String> buffer = new RingBuffer<String>(SIZE);
		assertEquals(0, buffer.size());
		assertEquals(true, buffer.isEmpty());
	}
	
	@Test(expected=RingBufferException.class)
	public void testRingBufferUnderflow() throws RingBufferException {
		RingBuffer<String> buffer = new RingBuffer<String>(SIZE);
		buffer.dequeue(); // should throw RingBufferException
	}
	
	@Test
	public void testFillRingBuffer() {
		RingBuffer<String> buffer = new RingBuffer<String>(SIZE);
		for (int i = 1; i < SIZE * 2; ++i) {
			String s = "Item" + i;
			try {
				buffer.enqueue(s);
				assertEquals((i) % SIZE, buffer.size());
			} catch (RingBufferException e) {
				// should not occur
				fail();
			}
		}
	}

}
