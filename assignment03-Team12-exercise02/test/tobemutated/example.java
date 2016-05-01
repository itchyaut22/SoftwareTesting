package tobemutated;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

/** A model of a set with two elements: s1 and s2. */
public class example implements FsmModel
{
  protected boolean s1, s2;

  public Object getState()
  { return (s1 ? "T" : "F") + (s2 ? "T" : "F"); }

  public void reset(boolean testing)
  { s1 = false; s2 = false; }

  @Action public void addS1() {s1 = true;}
  @Action public void addS2() {s2 = true;}
  @Action public void removeS1() {s1 = false;}
  @Action public void removeS2() {s2 = false;} // or {s2 = 1/0>0;} to see an error
  //@Action public void clear() {s1 = false; s2 = false;}

  /** An example of generating tests from this model. */
  public static void main(String[] args)
  {
    Tester tester = new GreedyTester(new example());
    tester.addListener(new VerboseListener());
    tester.generate(100);
  }
}
