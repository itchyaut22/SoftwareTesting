package tobemutated;

import java.io.IOException;
import java.util.Set;

import junit.framework.TestCase;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.StopOnFailureListener;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;
import nz.ac.waikato.modeljunit.examples.StringSet;

public class StringSetTest  extends TestCase {
	
	 public StringSetTest(String arg0)
	  {
	    super(arg0);
	  }

	  public void testSet() throws IOException
	  {
	    Set<String> sut = new StringSet();
	    Tester tester = new GreedyTester(new SimpleSetWithAdaptor(sut));
	    tester.addCoverageMetric(new TransitionCoverage());
	    tester.addListener(new VerboseListener());
	    tester.addListener(new StopOnFailureListener());
	    tester.generate(60);
	    tester.printCoverage(); // print the model coverage information
	  }

}
