package tobemutated;

import java.io.IOException;

import junit.framework.TestCase;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.StopOnFailureListener;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;

public class RingBufferModelTest extends TestCase {

	public RingBufferModelTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	 public void testSet() throws IOException
	  {
	    Tester tester = new GreedyTester(new RingBufferModelWithAdaptor());
	    tester.addCoverageMetric(new TransitionCoverage());
	    tester.addListener(new VerboseListener());
	    tester.addListener(new StopOnFailureListener());
	    tester.generate(1000);
	    tester.printCoverage(); // print the model coverage information
	  }

}
