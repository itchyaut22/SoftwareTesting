package tobemutated;

import java.util.Collections;
import java.util.Set;

import org.junit.Assert;
import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;
import nz.ac.waikato.modeljunit.examples.StringSet;
import nz.ac.waikato.modeljunit.examples.StringSetBuggy;

public class SimpleSetWithAdaptor implements FsmModel
{
  protected Set<String> sut_;
  protected boolean s1, s2;

  // our test data for the SUT
  protected String str1 = "some string";
  protected String str2 = "";  // empty string

  /** Tests a StringSet implementation. */
  public SimpleSetWithAdaptor()
  {
    sut_ = new StringSet();
  }

  public SimpleSetWithAdaptor(Set<String> sut)
  {
    sut_ = sut;
  }

  public Object getState()
  {
    return (s1 ? "T" : "F") + (s2 ? "T" : "F");
  }

  public void reset(boolean testing)
  {
    s1 = false;
    s2 = false;
    sut_.clear();
  }

  @Action public void addS1()
  {
    s1 = true;
    sut_.add(str1);
    checkSUT();
  }

  @Action public void addS2()
  {
    // this one shows how we can test the result of sut_.add(...)
    Assert.assertEquals(!s2, sut_.add(str2));
    //sut_.add(str2);
    s2 = true;
    checkSUT();
  }

  @Action public void removeS1()
  {
    s1 = false;
    sut_.remove(str1);
    checkSUT();
  }

  @Action public void removeS2()
  {
    // this one shows how we can test the result of sut_.remove(...)
    Assert.assertEquals(s2, sut_.remove(str2));
    //sut_.remove(str2);
    s2 = false;
    checkSUT();
  }

  /** Check that the SUT is in the expected state. */
  protected void checkSUT()
  {
    int size = (s1 ? 1 : 0) + (s2 ? 1 : 0);
    Assert.assertEquals(size, sut_.size());
    Assert.assertEquals(s1, sut_.contains(str1));
    Assert.assertEquals(s2, sut_.contains(str2));
    Assert.assertEquals(!s1 && !s2, sut_.isEmpty());
    System.out.println("Test: "+(!s1 && !s2==sut_.isEmpty()));
    Assert.assertEquals(!s1 && s2, sut_.equals(Collections.singleton(str2)));
  }

  /** An example of generating tests from this model. */
  public static void main(String[] args)
  {
    Set<String> sut = new StringSetBuggy(); // StringSetBuggy();
    Tester tester = new GreedyTester(new SimpleSetWithAdaptor(sut));
    //tester.buildGraph(); // to get better statistics
    tester.addListener(new VerboseListener());
    
    // uncoment this line if you want to stop when the first error is found.
    // tester.addListener(new StopOnFailureListener());
    
    tester.addCoverageMetric(new TransitionCoverage());
    tester.generate(50);
    tester.printCoverage();
  }
}
