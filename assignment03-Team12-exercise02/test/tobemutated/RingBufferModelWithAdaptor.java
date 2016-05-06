package tobemutated;

import org.junit.Assert;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

public class RingBufferModelWithAdaptor implements FsmModel {
	/**
	 * Default element to add to the buffer that can be used in the tests. The
	 * tests were designed assuming that this element is not {@code null}.
	 */
	private static final String ELEMENT = "item";
	
    /**
     * ringbuffer object under test
     */
	private RingBuffer<String> ringbuffer;

	/**
	 * used to keep track of how many elements are in the buffer and to
	 * determine the current state of the buffer
	 */
	private int counter;
	/**
	 * defines the maxSize of the actuell ringbuffer
	 */
	private int maxSize;

	/**
	 * States of the Ringbuffer
	 */
	public enum State {
		Empty, Filled, Full
	};

	@Override
	public Object getState() {
		if (maxSize == ringbuffer.size()) {
			return State.Full + "(" + ringbuffer.size() + ")";
		}
		if (ringbuffer.isEmpty()) {
			return State.Empty + "(" + ringbuffer.size() + ")";
		}
		return State.Filled + "(" + ringbuffer.size() + ")";
	}
	
	/**
	 * calls the enque methode of the ringbuffer and checks for right behaviour
	 * @throws RingBufferException
	 */
	@Action
	public void enqueue() throws RingBufferException {
		Assert.assertEquals(ringbuffer.size(), counter);
		String expectedException = null;
		RingBufferException ringBufferException = null;
		if (maxSize == ringbuffer.size()) {
			expectedException = "Ring buffer overflow";
		}
		try {
			ringbuffer.enqueue(ELEMENT);
			counter++;
			Assert.assertEquals(ringbuffer.size(), counter);
			Assert.assertFalse(ringbuffer.isEmpty());
			Assert.assertTrue(ringbuffer.size()>0);
		} catch (RingBufferException e) {
			ringBufferException = e;
			Assert.assertEquals(e.getMessage(), expectedException);
			Assert.assertEquals(ringbuffer.size(), maxSize);
			Assert.assertEquals(counter, maxSize);
		}
		if(expectedException!=null){
			Assert.assertNotNull(ringBufferException);
		}
	}
	
	/**
	 * calls the enque methode of the ringbuffer and checks for right behaviour
	 * @throws RingBufferException
	 */
	@Action
	public void dequeue() throws RingBufferException {
		Assert.assertEquals(ringbuffer.size(), counter);
		String expectedException = null;
		RingBufferException ringBufferException = null;
		if (ringbuffer.isEmpty()) {
			expectedException = "Ring buffer underflow";
		}
		try {
			Assert.assertEquals(ringbuffer.dequeue(), ELEMENT);
			counter--;
			Assert.assertEquals(ringbuffer.size(), counter);
			Assert.assertTrue(ringbuffer.size()<maxSize);
		} catch (RingBufferException e) {
			ringBufferException = e;
			Assert.assertEquals(e.getMessage(), expectedException);
			Assert.assertTrue(ringbuffer.isEmpty());
			Assert.assertEquals(ringbuffer.size(), 0);
			Assert.assertEquals(counter, 0);
		}
		if(expectedException!=null){
			Assert.assertNotNull(ringBufferException);
		}
	}

	@Override
	public void reset(boolean testing) {
		maxSize = (int) (Math.random() * 10 + 1);
		System.out.println("Maximum Size of new RingBuffer: " + maxSize);
		ringbuffer = new RingBuffer<>(maxSize);
		counter = 0;
	}

	public static void main(String[] args) {
		Tester tester = new GreedyTester(new RingBufferModelWithAdaptor());
		tester.addListener(new VerboseListener());
		tester.generate(100);
	}
}
