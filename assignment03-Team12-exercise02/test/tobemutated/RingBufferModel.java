package tobemutated;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

public class RingBufferModel implements FsmModel {
	
    /**
     * Default element to add to the buffer that can be used in the tests.
     * The tests were designed assuming that this element is not {@code null}.
     */
    private static final String ELEMENT = "item";
    
    private RingBuffer<String> ringbuffer;
    
    /**
     * defines the maxSize of the actuell ringbuffer
     */
    private int maxSize;
    
    /**
     * States of the Ringbuffer
     */
    public enum State { Empty, Filled, Full };

	@Override
	public Object getState() {
		if(maxSize==ringbuffer.size()){
			return State.Full+"("+ringbuffer.size()+")";
		}
		if(ringbuffer.isEmpty()){
			return State.Empty+"("+ringbuffer.size()+")";
		}
		return State.Filled+"("+ringbuffer.size()+")";
	}
	
	@Action 
	public void enqueue() throws RingBufferException{
		ringbuffer.enqueue(ELEMENT);
	}
	
	/**
	 * Ensures that only valid transitions are returned
	 * @return
	 */
	public boolean enqueueGuard(){
		return !(maxSize==ringbuffer.size());
	}
	
	@Action
	public void dequeue() throws RingBufferException{
		ringbuffer.dequeue();
	}
	
	/**
	 * Ensures that only valid transitions are returned
	 * @return
	 */
	public boolean dequeueGuard(){
		return !ringbuffer.isEmpty();
	}

	@Override
	public void reset(boolean testing) {
		maxSize=(int)(Math.random()*10+1);
		System.out.println("Maximum Size of new RingBuffer: "+maxSize);
		ringbuffer = new RingBuffer<>(maxSize);
	}
	
	  public static void main(String[] args){
	    Tester tester = new GreedyTester(new RingBufferModel());
	    tester.addListener(new VerboseListener());
	    tester.generate(1000);
	  }

}
