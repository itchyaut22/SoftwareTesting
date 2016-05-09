package exercise01_05s;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)(-1));
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)(byte)10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var5);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var6);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var6 = var5.new RingBufferIterator();
    int var7 = var5.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var5);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    java.lang.String var11 = var9.toString();
    var7.addSuppressed((java.lang.Throwable)var9);
    var4.addSuppressed((java.lang.Throwable)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)10.0d);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    java.util.Spliterator var8 = var6.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("hi!");
    java.lang.String var8 = var7.toString();
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    java.lang.String var14 = var12.toString();
    var10.addSuppressed((java.lang.Throwable)var12);
    var7.addSuppressed((java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var12);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var8.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    java.lang.String var9 = var8.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var14 = var13.getSuppressed();
    java.lang.String var15 = var13.toString();
    var11.addSuppressed((java.lang.Throwable)var13);
    var8.addSuppressed((java.lang.Throwable)var13);
    var6.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable[] var19 = var6.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var19);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var9.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)"exercise01.RingBufferException: ");
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    java.util.Iterator var8 = var7.iterator();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    java.util.Spliterator var8 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("hi!");
    java.lang.String var13 = var12.toString();
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var18 = var17.getSuppressed();
    java.lang.String var19 = var17.toString();
    var15.addSuppressed((java.lang.Throwable)var17);
    var12.addSuppressed((java.lang.Throwable)var17);
    var8.addSuppressed((java.lang.Throwable)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var13.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: hi!");

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var5 = var4.getSuppressed();
    java.lang.String var6 = var4.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    java.lang.String var9 = var8.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var14 = var13.getSuppressed();
    java.lang.String var15 = var13.toString();
    var11.addSuppressed((java.lang.Throwable)var13);
    var8.addSuppressed((java.lang.Throwable)var13);
    var4.addSuppressed((java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var4);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var9.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    boolean var6 = var3.hasNext();
    boolean var7 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    boolean var9 = var8.hasNext();
    boolean var10 = var8.hasNext();
    boolean var11 = var8.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)0.0d);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var11 = var6.toString();
    java.lang.String var12 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    java.util.Spliterator var8 = var1.spliterator();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Iterator var12 = var11.iterator();
    int var13 = var11.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    java.util.Spliterator var11 = var9.spliterator();
    boolean var12 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var9.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var6);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var10.addSuppressed((java.lang.Throwable)var19);
    var6.addSuppressed((java.lang.Throwable)var19);
    java.lang.String var26 = var6.toString();
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("exercise01.RingBufferException: exercise01.RingBufferException: ");
    var6.addSuppressed((java.lang.Throwable)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var6);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var10.getSuppressed();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Throwable[] var32 = var10.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    java.lang.String var14 = var12.toString();
    var10.addSuppressed((java.lang.Throwable)var12);
    var8.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("hi!");
    java.lang.String var21 = var20.toString();
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var26 = var25.getSuppressed();
    java.lang.String var27 = var25.toString();
    var23.addSuppressed((java.lang.Throwable)var25);
    var20.addSuppressed((java.lang.Throwable)var25);
    var18.addSuppressed((java.lang.Throwable)var20);
    var10.addSuppressed((java.lang.Throwable)var18);
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("hi!");
    java.lang.String var34 = var33.toString();
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var39 = var38.getSuppressed();
    java.lang.String var40 = var38.toString();
    var36.addSuppressed((java.lang.Throwable)var38);
    var33.addSuppressed((java.lang.Throwable)var38);
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var46 = new exercise01.RingBufferException("hi!");
    java.lang.String var47 = var46.toString();
    exercise01.RingBufferException var49 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var51 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var52 = var51.getSuppressed();
    java.lang.String var53 = var51.toString();
    var49.addSuppressed((java.lang.Throwable)var51);
    var46.addSuppressed((java.lang.Throwable)var51);
    var44.addSuppressed((java.lang.Throwable)var46);
    var38.addSuppressed((java.lang.Throwable)var44);
    var18.addSuppressed((java.lang.Throwable)var38);
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    var38.addSuppressed((java.lang.Throwable)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var38);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var21.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: "+ "'", var27.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var34.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: "+ "'", var40.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var47.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "exercise01.RingBufferException: "+ "'", var53.equals("exercise01.RingBufferException: "));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var26 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("hi!");
    java.lang.String var10 = var9.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var15 = var14.getSuppressed();
    java.lang.String var16 = var14.toString();
    var12.addSuppressed((java.lang.Throwable)var14);
    var9.addSuppressed((java.lang.Throwable)var14);
    var5.addSuppressed((java.lang.Throwable)var14);
    var1.addSuppressed((java.lang.Throwable)var14);
    java.lang.String var21 = var1.toString();
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("exercise01.RingBufferException: exercise01.RingBufferException: ");
    var1.addSuppressed((java.lang.Throwable)var23);
    java.lang.Throwable[] var25 = var23.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var10.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    boolean var6 = var3.hasNext();
    boolean var7 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    var1.enqueue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var6.addSuppressed((java.lang.Throwable)var8);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var8.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var8);
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var36 = var35.getSuppressed();
    java.lang.String var37 = var35.toString();
    var33.addSuppressed((java.lang.Throwable)var35);
    java.lang.String var39 = var35.toString();
    exercise01.RingBufferException var41 = new exercise01.RingBufferException("hi!");
    java.lang.String var42 = var41.toString();
    var35.addSuppressed((java.lang.Throwable)var41);
    var8.addSuppressed((java.lang.Throwable)var35);
    java.lang.String var45 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "exercise01.RingBufferException: "+ "'", var39.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var42.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: "+ "'", var45.equals("exercise01.RingBufferException: "));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    boolean var6 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var8 = var7.new RingBufferIterator();
    boolean var9 = var8.hasNext();
    boolean var10 = var8.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var14 = var3.getSuppressed();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var26 = var12.getSuppressed();
    java.lang.Throwable[] var27 = var12.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    int var3 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var26 = var12.getSuppressed();
    java.lang.String var27 = var12.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("hi!");
    java.lang.String var30 = var29.toString();
    java.lang.Throwable[] var31 = var29.getSuppressed();
    var12.addSuppressed((java.lang.Throwable)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: "+ "'", var27.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var30.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Spliterator var6 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    java.util.Spliterator var12 = var10.spliterator();
    boolean var13 = var10.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      exercise01.RingBuffer var1 = new exercise01.RingBuffer((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("hi!");
    java.lang.String var40 = var39.toString();
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var45 = var44.getSuppressed();
    java.lang.String var46 = var44.toString();
    var42.addSuppressed((java.lang.Throwable)var44);
    var39.addSuppressed((java.lang.Throwable)var44);
    var37.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("hi!");
    java.lang.String var54 = var53.toString();
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var58 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var59 = var58.getSuppressed();
    java.lang.String var60 = var58.toString();
    var56.addSuppressed((java.lang.Throwable)var58);
    var53.addSuppressed((java.lang.Throwable)var58);
    exercise01.RingBufferException var64 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var66 = new exercise01.RingBufferException("hi!");
    java.lang.String var67 = var66.toString();
    exercise01.RingBufferException var69 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var71 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var72 = var71.getSuppressed();
    java.lang.String var73 = var71.toString();
    var69.addSuppressed((java.lang.Throwable)var71);
    var66.addSuppressed((java.lang.Throwable)var71);
    var64.addSuppressed((java.lang.Throwable)var66);
    var58.addSuppressed((java.lang.Throwable)var64);
    var31.addSuppressed((java.lang.Throwable)var64);
    java.lang.String var79 = var31.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var40.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: "+ "'", var46.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var54.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "exercise01.RingBufferException: "+ "'", var60.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var67.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "exercise01.RingBufferException: "+ "'", var73.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "exercise01.RingBufferException: "+ "'", var79.equals("exercise01.RingBufferException: "));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("hi!");
    java.lang.String var11 = var10.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var16 = var15.getSuppressed();
    java.lang.String var17 = var15.toString();
    var13.addSuppressed((java.lang.Throwable)var15);
    var10.addSuppressed((java.lang.Throwable)var15);
    var8.addSuppressed((java.lang.Throwable)var10);
    java.lang.Throwable[] var21 = var8.getSuppressed();
    java.lang.String var22 = var8.toString();
    var5.addSuppressed((java.lang.Throwable)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var5);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var11.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "exercise01.RingBufferException: "+ "'", var17.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.Throwable[] var11 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    var6.addSuppressed((java.lang.Throwable)var12);
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("hi!");
    java.lang.String var18 = var17.toString();
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var23 = var22.getSuppressed();
    java.lang.String var24 = var22.toString();
    var20.addSuppressed((java.lang.Throwable)var22);
    var17.addSuppressed((java.lang.Throwable)var22);
    var15.addSuppressed((java.lang.Throwable)var17);
    java.lang.Throwable[] var28 = var15.getSuppressed();
    java.lang.Throwable[] var29 = var15.getSuppressed();
    var12.addSuppressed((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var18.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("hi!");
    java.lang.String var40 = var39.toString();
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var45 = var44.getSuppressed();
    java.lang.String var46 = var44.toString();
    var42.addSuppressed((java.lang.Throwable)var44);
    var39.addSuppressed((java.lang.Throwable)var44);
    var37.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    var31.addSuppressed((java.lang.Throwable)var53);
    java.lang.Throwable[] var55 = var31.getSuppressed();
    exercise01.RingBufferException var57 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var58 = var57.getSuppressed();
    java.lang.String var59 = var57.toString();
    exercise01.RingBufferException var61 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var62 = var61.getSuppressed();
    java.lang.String var63 = var61.toString();
    exercise01.RingBufferException var65 = new exercise01.RingBufferException("hi!");
    java.lang.String var66 = var65.toString();
    exercise01.RingBufferException var68 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var70 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var71 = var70.getSuppressed();
    java.lang.String var72 = var70.toString();
    var68.addSuppressed((java.lang.Throwable)var70);
    var65.addSuppressed((java.lang.Throwable)var70);
    var61.addSuppressed((java.lang.Throwable)var70);
    var57.addSuppressed((java.lang.Throwable)var70);
    java.lang.String var77 = var57.toString();
    exercise01.RingBufferException var79 = new exercise01.RingBufferException("exercise01.RingBufferException: exercise01.RingBufferException: ");
    var57.addSuppressed((java.lang.Throwable)var79);
    var31.addSuppressed((java.lang.Throwable)var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var40.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: "+ "'", var46.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "exercise01.RingBufferException: "+ "'", var59.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "exercise01.RingBufferException: "+ "'", var63.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var66.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "exercise01.RingBufferException: "+ "'", var72.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "exercise01.RingBufferException: "+ "'", var77.equals("exercise01.RingBufferException: "));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("hi!");
    java.lang.String var28 = var27.toString();
    var12.addSuppressed((java.lang.Throwable)var27);
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("hi!");
    java.lang.String var32 = var31.toString();
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var37 = var36.getSuppressed();
    java.lang.String var38 = var36.toString();
    var34.addSuppressed((java.lang.Throwable)var36);
    var31.addSuppressed((java.lang.Throwable)var36);
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    var36.addSuppressed((java.lang.Throwable)var42);
    java.lang.String var44 = var36.toString();
    var12.addSuppressed((java.lang.Throwable)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var28.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var32.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: "+ "'", var38.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "exercise01.RingBufferException: "+ "'", var44.equals("exercise01.RingBufferException: "));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    java.util.Iterator var6 = var4.iterator();
    boolean var7 = var4.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var8 = var4.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Iterator var7 = var6.iterator();
    int var8 = var6.size();
    java.util.Iterator var9 = var6.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    boolean var12 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var12);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var14 = var3.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    java.lang.Throwable[] var22 = var16.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    java.util.Spliterator var7 = var5.spliterator();
    java.util.Iterator var8 = var5.iterator();
    int var9 = var5.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    java.lang.String var11 = var9.toString();
    var7.addSuppressed((java.lang.Throwable)var9);
    var4.addSuppressed((java.lang.Throwable)var9);
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("hi!");
    java.lang.String var18 = var17.toString();
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var23 = var22.getSuppressed();
    java.lang.String var24 = var22.toString();
    var20.addSuppressed((java.lang.Throwable)var22);
    var17.addSuppressed((java.lang.Throwable)var22);
    var15.addSuppressed((java.lang.Throwable)var17);
    var9.addSuppressed((java.lang.Throwable)var15);
    java.lang.Throwable[] var29 = var15.getSuppressed();
    java.lang.String var30 = var15.toString();
    var1.enqueue((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var18.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    java.util.Iterator var2 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Iterator var7 = var6.iterator();
    int var8 = var6.size();
    int var9 = var6.size();
    boolean var10 = var6.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var11 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var11.equals("exercise01.RingBufferException: hi!"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    java.util.Spliterator var11 = var9.spliterator();
    boolean var12 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var9.new RingBufferIterator();
    java.util.Spliterator var14 = var9.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var14);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.String var18 = var16.toString();
    var14.addSuppressed((java.lang.Throwable)var16);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var22 = var12.toString();
    java.lang.String var23 = var12.toString();
    java.lang.String var24 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.String var18 = var16.toString();
    var14.addSuppressed((java.lang.Throwable)var16);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var22 = var6.getSuppressed();
    java.lang.Throwable[] var23 = var6.getSuppressed();
    java.lang.String var24 = var6.toString();
    java.lang.Throwable[] var25 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    int var6 = var1.size();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var14 = var10.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("hi!");
    java.lang.String var17 = var16.toString();
    var10.addSuppressed((java.lang.Throwable)var16);
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var21 = var20.getSuppressed();
    java.lang.String var22 = var20.toString();
    java.lang.String var23 = var20.toString();
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var30 = var29.getSuppressed();
    java.lang.String var31 = var29.toString();
    var27.addSuppressed((java.lang.Throwable)var29);
    var25.addSuppressed((java.lang.Throwable)var27);
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("hi!");
    java.lang.String var38 = var37.toString();
    exercise01.RingBufferException var40 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var43 = var42.getSuppressed();
    java.lang.String var44 = var42.toString();
    var40.addSuppressed((java.lang.Throwable)var42);
    var37.addSuppressed((java.lang.Throwable)var42);
    var35.addSuppressed((java.lang.Throwable)var37);
    var27.addSuppressed((java.lang.Throwable)var35);
    java.lang.Throwable[] var49 = var27.getSuppressed();
    var20.addSuppressed((java.lang.Throwable)var27);
    exercise01.RingBufferException var52 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var54 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var55 = var54.getSuppressed();
    java.lang.String var56 = var54.toString();
    var52.addSuppressed((java.lang.Throwable)var54);
    java.lang.String var58 = var54.toString();
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("hi!");
    java.lang.String var61 = var60.toString();
    var54.addSuppressed((java.lang.Throwable)var60);
    var27.addSuppressed((java.lang.Throwable)var54);
    var10.addSuppressed((java.lang.Throwable)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var17.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: "+ "'", var31.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var38.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "exercise01.RingBufferException: "+ "'", var44.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "exercise01.RingBufferException: "+ "'", var56.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "exercise01.RingBufferException: "+ "'", var58.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var61.equals("exercise01.RingBufferException: hi!"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    boolean var6 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var7 = var3.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("hi!");
    java.lang.String var10 = var9.toString();
    var3.addSuppressed((java.lang.Throwable)var9);
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var14 = var13.getSuppressed();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var23 = var22.getSuppressed();
    java.lang.String var24 = var22.toString();
    var20.addSuppressed((java.lang.Throwable)var22);
    var18.addSuppressed((java.lang.Throwable)var20);
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("hi!");
    java.lang.String var31 = var30.toString();
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var36 = var35.getSuppressed();
    java.lang.String var37 = var35.toString();
    var33.addSuppressed((java.lang.Throwable)var35);
    var30.addSuppressed((java.lang.Throwable)var35);
    var28.addSuppressed((java.lang.Throwable)var30);
    var20.addSuppressed((java.lang.Throwable)var28);
    java.lang.Throwable[] var42 = var20.getSuppressed();
    var13.addSuppressed((java.lang.Throwable)var20);
    exercise01.RingBufferException var45 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var48 = var47.getSuppressed();
    java.lang.String var49 = var47.toString();
    var45.addSuppressed((java.lang.Throwable)var47);
    java.lang.String var51 = var47.toString();
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("hi!");
    java.lang.String var54 = var53.toString();
    var47.addSuppressed((java.lang.Throwable)var53);
    var20.addSuppressed((java.lang.Throwable)var47);
    var3.addSuppressed((java.lang.Throwable)var20);
    java.lang.Throwable[] var58 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var10.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var31.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "exercise01.RingBufferException: "+ "'", var49.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "exercise01.RingBufferException: "+ "'", var51.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var54.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    java.lang.String var11 = var9.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var9.addSuppressed((java.lang.Throwable)var18);
    var5.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var25 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("hi!");
    java.lang.String var29 = var28.toString();
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("hi!");
    java.lang.String var34 = var33.toString();
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var39 = var38.getSuppressed();
    java.lang.String var40 = var38.toString();
    var36.addSuppressed((java.lang.Throwable)var38);
    var33.addSuppressed((java.lang.Throwable)var38);
    var31.addSuppressed((java.lang.Throwable)var33);
    java.lang.Throwable[] var44 = var31.getSuppressed();
    java.lang.String var45 = var31.toString();
    var28.addSuppressed((java.lang.Throwable)var31);
    var5.addSuppressed((java.lang.Throwable)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var29.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var34.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: "+ "'", var40.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: "+ "'", var45.equals("exercise01.RingBufferException: "));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("hi!");
    java.lang.String var16 = var15.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var21 = var20.getSuppressed();
    java.lang.String var22 = var20.toString();
    var18.addSuppressed((java.lang.Throwable)var20);
    var15.addSuppressed((java.lang.Throwable)var20);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var31 = var30.getSuppressed();
    java.lang.String var32 = var30.toString();
    var28.addSuppressed((java.lang.Throwable)var30);
    var26.addSuppressed((java.lang.Throwable)var28);
    var20.addSuppressed((java.lang.Throwable)var26);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("hi!");
    java.lang.String var38 = var37.toString();
    exercise01.RingBufferException var40 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var43 = var42.getSuppressed();
    java.lang.String var44 = var42.toString();
    var40.addSuppressed((java.lang.Throwable)var42);
    var37.addSuppressed((java.lang.Throwable)var42);
    var26.addSuppressed((java.lang.Throwable)var42);
    var3.addSuppressed((java.lang.Throwable)var26);
    java.lang.Throwable[] var49 = var26.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var16.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var38.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "exercise01.RingBufferException: "+ "'", var44.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var12 = var11.getSuppressed();
    java.lang.String var13 = var11.toString();
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var15 = var11.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("hi!");
    java.lang.String var18 = var17.toString();
    var11.addSuppressed((java.lang.Throwable)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var11);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var18.equals("exercise01.RingBufferException: hi!"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var9 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.String var18 = var16.toString();
    var14.addSuppressed((java.lang.Throwable)var16);
    var12.addSuppressed((java.lang.Throwable)var14);
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("hi!");
    java.lang.String var23 = var22.toString();
    var12.addSuppressed((java.lang.Throwable)var22);
    var5.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var26 = var5.getSuppressed();
    java.lang.Throwable[] var27 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var23.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("hi!");
    java.lang.String var10 = var9.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var15 = var14.getSuppressed();
    java.lang.String var16 = var14.toString();
    var12.addSuppressed((java.lang.Throwable)var14);
    var9.addSuppressed((java.lang.Throwable)var14);
    var5.addSuppressed((java.lang.Throwable)var14);
    var1.addSuppressed((java.lang.Throwable)var14);
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var23 = var22.getSuppressed();
    java.lang.String var24 = var22.toString();
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var27 = var26.getSuppressed();
    java.lang.String var28 = var26.toString();
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("hi!");
    java.lang.String var31 = var30.toString();
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var36 = var35.getSuppressed();
    java.lang.String var37 = var35.toString();
    var33.addSuppressed((java.lang.Throwable)var35);
    var30.addSuppressed((java.lang.Throwable)var35);
    var26.addSuppressed((java.lang.Throwable)var35);
    var22.addSuppressed((java.lang.Throwable)var35);
    java.lang.Throwable[] var42 = var35.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var10.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var31.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    boolean var8 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var10.getSuppressed();
    var1.enqueue((java.lang.Object)var10);
    int var32 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var33 = var1.new RingBufferIterator();
    int var34 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var4.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    var4.addSuppressed((java.lang.Throwable)var14);
    var1.enqueue((java.lang.Object)var14);
    java.util.Iterator var18 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var4.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    var4.addSuppressed((java.lang.Throwable)var14);
    var1.enqueue((java.lang.Object)var14);
    java.util.Spliterator var18 = var1.spliterator();
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)'4');
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var10.getSuppressed();
    var1.enqueue((java.lang.Object)var10);
    int var32 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var33 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var33.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var4.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    var4.addSuppressed((java.lang.Throwable)var14);
    var1.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer.RingBufferIterator var18 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var7 = var3.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("hi!");
    java.lang.String var10 = var9.toString();
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var12 = var9.getSuppressed();
    java.lang.Throwable[] var13 = var9.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var10.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("hi!");
    java.lang.String var40 = var39.toString();
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var45 = var44.getSuppressed();
    java.lang.String var46 = var44.toString();
    var42.addSuppressed((java.lang.Throwable)var44);
    var39.addSuppressed((java.lang.Throwable)var44);
    var37.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("hi!");
    java.lang.String var54 = var53.toString();
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var58 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var59 = var58.getSuppressed();
    java.lang.String var60 = var58.toString();
    var56.addSuppressed((java.lang.Throwable)var58);
    var53.addSuppressed((java.lang.Throwable)var58);
    exercise01.RingBufferException var64 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var66 = new exercise01.RingBufferException("hi!");
    java.lang.String var67 = var66.toString();
    exercise01.RingBufferException var69 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var71 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var72 = var71.getSuppressed();
    java.lang.String var73 = var71.toString();
    var69.addSuppressed((java.lang.Throwable)var71);
    var66.addSuppressed((java.lang.Throwable)var71);
    var64.addSuppressed((java.lang.Throwable)var66);
    var58.addSuppressed((java.lang.Throwable)var64);
    var31.addSuppressed((java.lang.Throwable)var64);
    exercise01.RingBufferException var80 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var82 = new exercise01.RingBufferException("hi!");
    java.lang.String var83 = var82.toString();
    exercise01.RingBufferException var85 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var87 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var88 = var87.getSuppressed();
    java.lang.String var89 = var87.toString();
    var85.addSuppressed((java.lang.Throwable)var87);
    var82.addSuppressed((java.lang.Throwable)var87);
    var80.addSuppressed((java.lang.Throwable)var82);
    java.lang.Throwable[] var93 = var80.getSuppressed();
    java.lang.Throwable[] var94 = var80.getSuppressed();
    var31.addSuppressed((java.lang.Throwable)var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var40.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: "+ "'", var46.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var54.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "exercise01.RingBufferException: "+ "'", var60.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var67.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "exercise01.RingBufferException: "+ "'", var73.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var83.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "exercise01.RingBufferException: "+ "'", var89.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var5.new RingBufferIterator();
    java.util.Spliterator var8 = var5.spliterator();
    java.util.Spliterator var9 = var5.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var16 = var15.getSuppressed();
    java.lang.String var17 = var15.toString();
    var13.addSuppressed((java.lang.Throwable)var15);
    var11.addSuppressed((java.lang.Throwable)var13);
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("hi!");
    java.lang.String var24 = var23.toString();
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var29 = var28.getSuppressed();
    java.lang.String var30 = var28.toString();
    var26.addSuppressed((java.lang.Throwable)var28);
    var23.addSuppressed((java.lang.Throwable)var28);
    var21.addSuppressed((java.lang.Throwable)var23);
    var13.addSuppressed((java.lang.Throwable)var21);
    java.lang.Throwable[] var35 = var13.getSuppressed();
    var6.addSuppressed((java.lang.Throwable)var13);
    var1.addSuppressed((java.lang.Throwable)var13);
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var41 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var43 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var44 = var43.getSuppressed();
    java.lang.String var45 = var43.toString();
    var41.addSuppressed((java.lang.Throwable)var43);
    var39.addSuppressed((java.lang.Throwable)var41);
    java.lang.String var48 = var39.toString();
    java.lang.String var49 = var39.toString();
    var13.addSuppressed((java.lang.Throwable)var39);
    exercise01.RingBufferException var52 = new exercise01.RingBufferException("hi!");
    java.lang.String var53 = var52.toString();
    exercise01.RingBufferException var55 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var57 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var58 = var57.getSuppressed();
    java.lang.String var59 = var57.toString();
    var55.addSuppressed((java.lang.Throwable)var57);
    var52.addSuppressed((java.lang.Throwable)var57);
    exercise01.RingBufferException var63 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var65 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var67 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var68 = var67.getSuppressed();
    java.lang.String var69 = var67.toString();
    var65.addSuppressed((java.lang.Throwable)var67);
    var63.addSuppressed((java.lang.Throwable)var65);
    var57.addSuppressed((java.lang.Throwable)var63);
    java.lang.Throwable[] var73 = var57.getSuppressed();
    java.lang.Throwable[] var74 = var57.getSuppressed();
    java.lang.String var75 = var57.toString();
    var13.addSuppressed((java.lang.Throwable)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "exercise01.RingBufferException: "+ "'", var17.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var24.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: "+ "'", var45.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var48.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var49.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var53.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "exercise01.RingBufferException: "+ "'", var59.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "exercise01.RingBufferException: "+ "'", var69.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "exercise01.RingBufferException: "+ "'", var75.equals("exercise01.RingBufferException: "));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    java.util.Spliterator var11 = var9.spliterator();
    int var12 = var9.size();
    java.util.Spliterator var13 = var9.spliterator();
    int var14 = var9.size();
    java.util.Iterator var15 = var9.iterator();
    int var16 = var9.size();
    java.util.Spliterator var17 = var9.spliterator();
    var1.enqueue((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var9.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)1.0d);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    int var8 = var6.size();
    int var9 = var6.size();
    java.util.Iterator var10 = var6.iterator();
    var1.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)'#');
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(1);
    boolean var8 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var14 = var6.toString();
    java.lang.String var15 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("hi!");
    java.lang.String var16 = var15.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var21 = var20.getSuppressed();
    java.lang.String var22 = var20.toString();
    var18.addSuppressed((java.lang.Throwable)var20);
    var15.addSuppressed((java.lang.Throwable)var20);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var31 = var30.getSuppressed();
    java.lang.String var32 = var30.toString();
    var28.addSuppressed((java.lang.Throwable)var30);
    var26.addSuppressed((java.lang.Throwable)var28);
    var20.addSuppressed((java.lang.Throwable)var26);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("hi!");
    java.lang.String var38 = var37.toString();
    exercise01.RingBufferException var40 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var43 = var42.getSuppressed();
    java.lang.String var44 = var42.toString();
    var40.addSuppressed((java.lang.Throwable)var42);
    var37.addSuppressed((java.lang.Throwable)var42);
    var26.addSuppressed((java.lang.Throwable)var42);
    var3.addSuppressed((java.lang.Throwable)var26);
    java.lang.String var49 = var26.toString();
    java.lang.String var50 = var26.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var16.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var38.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "exercise01.RingBufferException: "+ "'", var44.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var49.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var50.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("hi!");
    java.lang.String var40 = var39.toString();
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var45 = var44.getSuppressed();
    java.lang.String var46 = var44.toString();
    var42.addSuppressed((java.lang.Throwable)var44);
    var39.addSuppressed((java.lang.Throwable)var44);
    var37.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("hi!");
    java.lang.String var54 = var53.toString();
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var58 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var59 = var58.getSuppressed();
    java.lang.String var60 = var58.toString();
    var56.addSuppressed((java.lang.Throwable)var58);
    var53.addSuppressed((java.lang.Throwable)var58);
    exercise01.RingBufferException var64 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var66 = new exercise01.RingBufferException("hi!");
    java.lang.String var67 = var66.toString();
    exercise01.RingBufferException var69 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var71 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var72 = var71.getSuppressed();
    java.lang.String var73 = var71.toString();
    var69.addSuppressed((java.lang.Throwable)var71);
    var66.addSuppressed((java.lang.Throwable)var71);
    var64.addSuppressed((java.lang.Throwable)var66);
    var58.addSuppressed((java.lang.Throwable)var64);
    var31.addSuppressed((java.lang.Throwable)var64);
    java.lang.String var79 = var64.toString();
    java.lang.String var80 = var64.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var40.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: "+ "'", var46.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var54.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "exercise01.RingBufferException: "+ "'", var60.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var67.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "exercise01.RingBufferException: "+ "'", var73.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "exercise01.RingBufferException: "+ "'", var79.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "exercise01.RingBufferException: "+ "'", var80.equals("exercise01.RingBufferException: "));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    java.lang.String var9 = var8.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var14 = var13.getSuppressed();
    java.lang.String var15 = var13.toString();
    var11.addSuppressed((java.lang.Throwable)var13);
    var8.addSuppressed((java.lang.Throwable)var13);
    var6.addSuppressed((java.lang.Throwable)var8);
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("hi!");
    java.lang.String var21 = var20.toString();
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var26 = var25.getSuppressed();
    java.lang.String var27 = var25.toString();
    var23.addSuppressed((java.lang.Throwable)var25);
    var20.addSuppressed((java.lang.Throwable)var25);
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var36 = var35.getSuppressed();
    java.lang.String var37 = var35.toString();
    var33.addSuppressed((java.lang.Throwable)var35);
    var31.addSuppressed((java.lang.Throwable)var33);
    var25.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("hi!");
    java.lang.String var43 = var42.toString();
    exercise01.RingBufferException var45 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var48 = var47.getSuppressed();
    java.lang.String var49 = var47.toString();
    var45.addSuppressed((java.lang.Throwable)var47);
    var42.addSuppressed((java.lang.Throwable)var47);
    var31.addSuppressed((java.lang.Throwable)var47);
    var8.addSuppressed((java.lang.Throwable)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var9.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var21.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: "+ "'", var27.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var43.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "exercise01.RingBufferException: "+ "'", var49.equals("exercise01.RingBufferException: "));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var15 = var10.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var22 = var21.getSuppressed();
    java.lang.String var23 = var21.toString();
    var19.addSuppressed((java.lang.Throwable)var21);
    var17.addSuppressed((java.lang.Throwable)var19);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("hi!");
    java.lang.String var30 = var29.toString();
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var35 = var34.getSuppressed();
    java.lang.String var36 = var34.toString();
    var32.addSuppressed((java.lang.Throwable)var34);
    var29.addSuppressed((java.lang.Throwable)var34);
    var27.addSuppressed((java.lang.Throwable)var29);
    var19.addSuppressed((java.lang.Throwable)var27);
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("hi!");
    java.lang.String var43 = var42.toString();
    exercise01.RingBufferException var45 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var48 = var47.getSuppressed();
    java.lang.String var49 = var47.toString();
    var45.addSuppressed((java.lang.Throwable)var47);
    var42.addSuppressed((java.lang.Throwable)var47);
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var55 = new exercise01.RingBufferException("hi!");
    java.lang.String var56 = var55.toString();
    exercise01.RingBufferException var58 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var61 = var60.getSuppressed();
    java.lang.String var62 = var60.toString();
    var58.addSuppressed((java.lang.Throwable)var60);
    var55.addSuppressed((java.lang.Throwable)var60);
    var53.addSuppressed((java.lang.Throwable)var55);
    var47.addSuppressed((java.lang.Throwable)var53);
    var27.addSuppressed((java.lang.Throwable)var47);
    java.lang.Throwable[] var68 = var47.getSuppressed();
    var10.addSuppressed((java.lang.Throwable)var47);
    java.lang.Throwable[] var70 = var47.getSuppressed();
    var1.enqueue((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var30.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "exercise01.RingBufferException: "+ "'", var36.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var43.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "exercise01.RingBufferException: "+ "'", var49.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var56.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "exercise01.RingBufferException: "+ "'", var62.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    var1.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    java.lang.Throwable[] var23 = var19.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var19);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var31 = var30.getSuppressed();
    java.lang.String var32 = var30.toString();
    var28.addSuppressed((java.lang.Throwable)var30);
    var26.addSuppressed((java.lang.Throwable)var28);
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("hi!");
    java.lang.String var39 = var38.toString();
    exercise01.RingBufferException var41 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var43 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var44 = var43.getSuppressed();
    java.lang.String var45 = var43.toString();
    var41.addSuppressed((java.lang.Throwable)var43);
    var38.addSuppressed((java.lang.Throwable)var43);
    var36.addSuppressed((java.lang.Throwable)var38);
    var28.addSuppressed((java.lang.Throwable)var36);
    exercise01.RingBufferException var51 = new exercise01.RingBufferException("hi!");
    java.lang.String var52 = var51.toString();
    exercise01.RingBufferException var54 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var57 = var56.getSuppressed();
    java.lang.String var58 = var56.toString();
    var54.addSuppressed((java.lang.Throwable)var56);
    var51.addSuppressed((java.lang.Throwable)var56);
    exercise01.RingBufferException var62 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var64 = new exercise01.RingBufferException("hi!");
    java.lang.String var65 = var64.toString();
    exercise01.RingBufferException var67 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var69 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var70 = var69.getSuppressed();
    java.lang.String var71 = var69.toString();
    var67.addSuppressed((java.lang.Throwable)var69);
    var64.addSuppressed((java.lang.Throwable)var69);
    var62.addSuppressed((java.lang.Throwable)var64);
    var56.addSuppressed((java.lang.Throwable)var62);
    var36.addSuppressed((java.lang.Throwable)var56);
    java.lang.String var77 = var56.toString();
    exercise01.RingBufferException var79 = new exercise01.RingBufferException("hi!");
    java.lang.String var80 = var79.toString();
    exercise01.RingBufferException var82 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var84 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var85 = var84.getSuppressed();
    java.lang.String var86 = var84.toString();
    var82.addSuppressed((java.lang.Throwable)var84);
    var79.addSuppressed((java.lang.Throwable)var84);
    java.lang.String var89 = var84.toString();
    var56.addSuppressed((java.lang.Throwable)var84);
    var19.addSuppressed((java.lang.Throwable)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var39.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: "+ "'", var45.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var52.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "exercise01.RingBufferException: "+ "'", var58.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var65.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "exercise01.RingBufferException: "+ "'", var71.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "exercise01.RingBufferException: "+ "'", var77.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var80.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "exercise01.RingBufferException: "+ "'", var86.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "exercise01.RingBufferException: "+ "'", var89.equals("exercise01.RingBufferException: "));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var10 = var6.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("hi!");
    java.lang.String var13 = var12.toString();
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var15 = var12.getSuppressed();
    var1.enqueue((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var13.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var12 = var11.getSuppressed();
    java.lang.String var13 = var11.toString();
    var9.addSuppressed((java.lang.Throwable)var11);
    var7.addSuppressed((java.lang.Throwable)var9);
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("hi!");
    java.lang.String var20 = var19.toString();
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var25 = var24.getSuppressed();
    java.lang.String var26 = var24.toString();
    var22.addSuppressed((java.lang.Throwable)var24);
    var19.addSuppressed((java.lang.Throwable)var24);
    var17.addSuppressed((java.lang.Throwable)var19);
    var9.addSuppressed((java.lang.Throwable)var17);
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("hi!");
    java.lang.String var33 = var32.toString();
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var38 = var37.getSuppressed();
    java.lang.String var39 = var37.toString();
    var35.addSuppressed((java.lang.Throwable)var37);
    var32.addSuppressed((java.lang.Throwable)var37);
    exercise01.RingBufferException var43 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var45 = new exercise01.RingBufferException("hi!");
    java.lang.String var46 = var45.toString();
    exercise01.RingBufferException var48 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var50 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var51 = var50.getSuppressed();
    java.lang.String var52 = var50.toString();
    var48.addSuppressed((java.lang.Throwable)var50);
    var45.addSuppressed((java.lang.Throwable)var50);
    var43.addSuppressed((java.lang.Throwable)var45);
    var37.addSuppressed((java.lang.Throwable)var43);
    var17.addSuppressed((java.lang.Throwable)var37);
    exercise01.RingBufferException var59 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    var37.addSuppressed((java.lang.Throwable)var59);
    java.lang.Throwable[] var61 = var37.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var61);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var20.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var33.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "exercise01.RingBufferException: "+ "'", var39.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var46.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "exercise01.RingBufferException: "+ "'", var52.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    java.util.Spliterator var7 = var5.spliterator();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    java.util.Iterator var10 = var5.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var5.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var5);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var4.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    var4.addSuppressed((java.lang.Throwable)var14);
    var1.enqueue((java.lang.Object)var14);
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("hi!");
    java.lang.String var20 = var19.toString();
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var25 = var24.getSuppressed();
    java.lang.String var26 = var24.toString();
    var22.addSuppressed((java.lang.Throwable)var24);
    var19.addSuppressed((java.lang.Throwable)var24);
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    var24.addSuppressed((java.lang.Throwable)var30);
    java.lang.String var32 = var24.toString();
    var14.addSuppressed((java.lang.Throwable)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var20.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var14 = var3.toString();
    java.lang.Throwable[] var15 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(10);
    var9.enqueue((java.lang.Object)0);
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    var24.addSuppressed((java.lang.Throwable)var26);
    var18.addSuppressed((java.lang.Throwable)var24);
    java.lang.Throwable[] var38 = var18.getSuppressed();
    var9.enqueue((java.lang.Object)var18);
    var6.addSuppressed((java.lang.Throwable)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var18);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    java.util.Spliterator var11 = var9.spliterator();
    int var12 = var9.size();
    java.util.Spliterator var13 = var9.spliterator();
    int var14 = var9.size();
    java.util.Iterator var15 = var9.iterator();
    int var16 = var9.size();
    java.util.Spliterator var17 = var9.spliterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    java.lang.String var11 = var9.toString();
    var7.addSuppressed((java.lang.Throwable)var9);
    var4.addSuppressed((java.lang.Throwable)var9);
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var15.addSuppressed((java.lang.Throwable)var17);
    var9.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var25 = var15.toString();
    java.lang.Throwable[] var26 = var15.getSuppressed();
    var1.enqueue((java.lang.Object)var15);
    java.lang.Throwable[] var28 = var15.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var28 = var27.getSuppressed();
    java.lang.String var29 = var27.toString();
    java.lang.String var30 = var27.toString();
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var37 = var36.getSuppressed();
    java.lang.String var38 = var36.toString();
    var34.addSuppressed((java.lang.Throwable)var36);
    var32.addSuppressed((java.lang.Throwable)var34);
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("hi!");
    java.lang.String var45 = var44.toString();
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var49 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var50 = var49.getSuppressed();
    java.lang.String var51 = var49.toString();
    var47.addSuppressed((java.lang.Throwable)var49);
    var44.addSuppressed((java.lang.Throwable)var49);
    var42.addSuppressed((java.lang.Throwable)var44);
    var34.addSuppressed((java.lang.Throwable)var42);
    java.lang.Throwable[] var56 = var34.getSuppressed();
    var27.addSuppressed((java.lang.Throwable)var34);
    var6.addSuppressed((java.lang.Throwable)var34);
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var62 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var64 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var65 = var64.getSuppressed();
    java.lang.String var66 = var64.toString();
    var62.addSuppressed((java.lang.Throwable)var64);
    var60.addSuppressed((java.lang.Throwable)var62);
    exercise01.RingBufferException var70 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var72 = new exercise01.RingBufferException("hi!");
    java.lang.String var73 = var72.toString();
    exercise01.RingBufferException var75 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var77 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var78 = var77.getSuppressed();
    java.lang.String var79 = var77.toString();
    var75.addSuppressed((java.lang.Throwable)var77);
    var72.addSuppressed((java.lang.Throwable)var77);
    var70.addSuppressed((java.lang.Throwable)var72);
    var62.addSuppressed((java.lang.Throwable)var70);
    java.lang.Throwable[] var84 = var62.getSuppressed();
    var34.addSuppressed((java.lang.Throwable)var62);
    java.lang.String var86 = var62.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: "+ "'", var38.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var45.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "exercise01.RingBufferException: "+ "'", var51.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "exercise01.RingBufferException: "+ "'", var66.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var73.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "exercise01.RingBufferException: "+ "'", var79.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "exercise01.RingBufferException: "+ "'", var86.equals("exercise01.RingBufferException: "));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var28 = var27.getSuppressed();
    java.lang.String var29 = var27.toString();
    java.lang.String var30 = var27.toString();
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var37 = var36.getSuppressed();
    java.lang.String var38 = var36.toString();
    var34.addSuppressed((java.lang.Throwable)var36);
    var32.addSuppressed((java.lang.Throwable)var34);
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("hi!");
    java.lang.String var45 = var44.toString();
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var49 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var50 = var49.getSuppressed();
    java.lang.String var51 = var49.toString();
    var47.addSuppressed((java.lang.Throwable)var49);
    var44.addSuppressed((java.lang.Throwable)var49);
    var42.addSuppressed((java.lang.Throwable)var44);
    var34.addSuppressed((java.lang.Throwable)var42);
    java.lang.Throwable[] var56 = var34.getSuppressed();
    var27.addSuppressed((java.lang.Throwable)var34);
    var6.addSuppressed((java.lang.Throwable)var34);
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var62 = new exercise01.RingBufferException("hi!");
    java.lang.String var63 = var62.toString();
    exercise01.RingBufferException var65 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var67 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var68 = var67.getSuppressed();
    java.lang.String var69 = var67.toString();
    var65.addSuppressed((java.lang.Throwable)var67);
    var62.addSuppressed((java.lang.Throwable)var67);
    var60.addSuppressed((java.lang.Throwable)var62);
    java.lang.Throwable[] var73 = var60.getSuppressed();
    java.lang.String var74 = var60.toString();
    var6.addSuppressed((java.lang.Throwable)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: "+ "'", var38.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var45.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "exercise01.RingBufferException: "+ "'", var51.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var63.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "exercise01.RingBufferException: "+ "'", var69.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "exercise01.RingBufferException: "+ "'", var74.equals("exercise01.RingBufferException: "));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var10.getSuppressed();
    var1.enqueue((java.lang.Object)var10);
    int var32 = var1.size();
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(0);
    java.util.Spliterator var35 = var34.spliterator();
    java.util.Spliterator var36 = var34.spliterator();
    int var37 = var34.size();
    java.util.Spliterator var38 = var34.spliterator();
    var1.enqueue((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    java.util.Spliterator var4 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var4.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    var4.addSuppressed((java.lang.Throwable)var14);
    var1.enqueue((java.lang.Object)var14);
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("hi!");
    java.lang.String var20 = var19.toString();
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var25 = var24.getSuppressed();
    java.lang.String var26 = var24.toString();
    var22.addSuppressed((java.lang.Throwable)var24);
    var19.addSuppressed((java.lang.Throwable)var24);
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("hi!");
    java.lang.String var33 = var32.toString();
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var38 = var37.getSuppressed();
    java.lang.String var39 = var37.toString();
    var35.addSuppressed((java.lang.Throwable)var37);
    var32.addSuppressed((java.lang.Throwable)var37);
    var30.addSuppressed((java.lang.Throwable)var32);
    var24.addSuppressed((java.lang.Throwable)var30);
    exercise01.RingBufferException var45 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var46 = var45.getSuppressed();
    java.lang.String var47 = var45.toString();
    java.lang.String var48 = var45.toString();
    exercise01.RingBufferException var50 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var52 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var54 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var55 = var54.getSuppressed();
    java.lang.String var56 = var54.toString();
    var52.addSuppressed((java.lang.Throwable)var54);
    var50.addSuppressed((java.lang.Throwable)var52);
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var62 = new exercise01.RingBufferException("hi!");
    java.lang.String var63 = var62.toString();
    exercise01.RingBufferException var65 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var67 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var68 = var67.getSuppressed();
    java.lang.String var69 = var67.toString();
    var65.addSuppressed((java.lang.Throwable)var67);
    var62.addSuppressed((java.lang.Throwable)var67);
    var60.addSuppressed((java.lang.Throwable)var62);
    var52.addSuppressed((java.lang.Throwable)var60);
    java.lang.Throwable[] var74 = var52.getSuppressed();
    var45.addSuppressed((java.lang.Throwable)var52);
    var24.addSuppressed((java.lang.Throwable)var52);
    exercise01.RingBufferException var78 = new exercise01.RingBufferException("hi!");
    java.lang.String var79 = var78.toString();
    exercise01.RingBufferException var81 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var83 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var84 = var83.getSuppressed();
    java.lang.String var85 = var83.toString();
    var81.addSuppressed((java.lang.Throwable)var83);
    var78.addSuppressed((java.lang.Throwable)var83);
    exercise01.RingBufferException var89 = new exercise01.RingBufferException("");
    var83.addSuppressed((java.lang.Throwable)var89);
    var52.addSuppressed((java.lang.Throwable)var89);
    java.lang.Throwable[] var92 = var89.getSuppressed();
    var14.addSuppressed((java.lang.Throwable)var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var20.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var33.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "exercise01.RingBufferException: "+ "'", var39.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "exercise01.RingBufferException: "+ "'", var47.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "exercise01.RingBufferException: "+ "'", var48.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "exercise01.RingBufferException: "+ "'", var56.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var63.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "exercise01.RingBufferException: "+ "'", var69.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var79.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "exercise01.RingBufferException: "+ "'", var85.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("hi!");
    java.lang.String var12 = var11.toString();
    var1.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var14 = var11.getSuppressed();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.String var18 = var16.toString();
    java.lang.String var19 = var16.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var26 = var25.getSuppressed();
    java.lang.String var27 = var25.toString();
    var23.addSuppressed((java.lang.Throwable)var25);
    var21.addSuppressed((java.lang.Throwable)var23);
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("hi!");
    java.lang.String var34 = var33.toString();
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var39 = var38.getSuppressed();
    java.lang.String var40 = var38.toString();
    var36.addSuppressed((java.lang.Throwable)var38);
    var33.addSuppressed((java.lang.Throwable)var38);
    var31.addSuppressed((java.lang.Throwable)var33);
    var23.addSuppressed((java.lang.Throwable)var31);
    java.lang.Throwable[] var45 = var23.getSuppressed();
    var16.addSuppressed((java.lang.Throwable)var23);
    exercise01.RingBufferException var48 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var50 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var51 = var50.getSuppressed();
    java.lang.String var52 = var50.toString();
    var48.addSuppressed((java.lang.Throwable)var50);
    java.lang.String var54 = var50.toString();
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("hi!");
    java.lang.String var57 = var56.toString();
    var50.addSuppressed((java.lang.Throwable)var56);
    var23.addSuppressed((java.lang.Throwable)var50);
    var11.addSuppressed((java.lang.Throwable)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var12.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: "+ "'", var27.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var34.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: "+ "'", var40.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "exercise01.RingBufferException: "+ "'", var52.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "exercise01.RingBufferException: "+ "'", var54.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var57.equals("exercise01.RingBufferException: hi!"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    java.util.Spliterator var11 = var9.spliterator();
    java.util.Spliterator var12 = var9.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var9.new RingBufferIterator();
    int var14 = var9.size();
    java.util.Iterator var15 = var9.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var15);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var10.getSuppressed();
    var1.enqueue((java.lang.Object)var10);
    int var32 = var1.size();
    java.lang.Object var33 = var1.dequeue();
    exercise01.RingBuffer var35 = new exercise01.RingBuffer(0);
    java.util.Iterator var36 = var35.iterator();
    java.util.Iterator var37 = var35.iterator();
    var1.enqueue((java.lang.Object)var35);
    int var39 = var35.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 0+ "'", var33.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    java.util.Spliterator var7 = var5.spliterator();
    java.util.Spliterator var8 = var5.spliterator();
    java.util.Spliterator var9 = var5.spliterator();
    var1.enqueue((java.lang.Object)var9);
    int var11 = var1.size();
    java.util.Spliterator var12 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var9 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.Throwable[] var11 = var5.getSuppressed();
    java.lang.Throwable[] var12 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    java.lang.Object var4 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var6.addSuppressed((java.lang.Throwable)var8);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var8.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable[] var32 = var8.getSuppressed();
    java.lang.String var33 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var14 = var3.getSuppressed();
    java.lang.Throwable[] var15 = var3.getSuppressed();
    java.lang.String var16 = var3.toString();
    java.lang.Throwable[] var17 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var16.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var28 = var27.getSuppressed();
    java.lang.String var29 = var27.toString();
    java.lang.String var30 = var27.toString();
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var37 = var36.getSuppressed();
    java.lang.String var38 = var36.toString();
    var34.addSuppressed((java.lang.Throwable)var36);
    var32.addSuppressed((java.lang.Throwable)var34);
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("hi!");
    java.lang.String var45 = var44.toString();
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var49 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var50 = var49.getSuppressed();
    java.lang.String var51 = var49.toString();
    var47.addSuppressed((java.lang.Throwable)var49);
    var44.addSuppressed((java.lang.Throwable)var49);
    var42.addSuppressed((java.lang.Throwable)var44);
    var34.addSuppressed((java.lang.Throwable)var42);
    java.lang.Throwable[] var56 = var34.getSuppressed();
    var27.addSuppressed((java.lang.Throwable)var34);
    var6.addSuppressed((java.lang.Throwable)var34);
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("hi!");
    java.lang.String var61 = var60.toString();
    exercise01.RingBufferException var63 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var65 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var66 = var65.getSuppressed();
    java.lang.String var67 = var65.toString();
    var63.addSuppressed((java.lang.Throwable)var65);
    var60.addSuppressed((java.lang.Throwable)var65);
    exercise01.RingBufferException var71 = new exercise01.RingBufferException("");
    var65.addSuppressed((java.lang.Throwable)var71);
    var34.addSuppressed((java.lang.Throwable)var71);
    java.lang.Throwable[] var74 = var71.getSuppressed();
    java.lang.String var75 = var71.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: "+ "'", var38.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var45.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "exercise01.RingBufferException: "+ "'", var51.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var61.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "exercise01.RingBufferException: "+ "'", var67.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "exercise01.RingBufferException: "+ "'", var75.equals("exercise01.RingBufferException: "));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    java.lang.String var14 = var12.toString();
    var10.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var16 = var12.getSuppressed();
    java.lang.Throwable[] var17 = var12.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("hi!");
    java.lang.String var13 = var12.toString();
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var18 = var17.getSuppressed();
    java.lang.String var19 = var17.toString();
    var15.addSuppressed((java.lang.Throwable)var17);
    var12.addSuppressed((java.lang.Throwable)var17);
    var8.addSuppressed((java.lang.Throwable)var17);
    java.lang.Throwable[] var23 = var17.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var23);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var13.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    java.util.Spliterator var11 = var9.spliterator();
    int var12 = var9.size();
    java.util.Spliterator var13 = var9.spliterator();
    int var14 = var9.size();
    java.util.Iterator var15 = var9.iterator();
    int var16 = var9.size();
    java.util.Spliterator var17 = var9.spliterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Spliterator var19 = var1.spliterator();
    boolean var20 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("hi!");
    java.lang.String var15 = var14.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var14.addSuppressed((java.lang.Throwable)var19);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("hi!");
    java.lang.String var28 = var27.toString();
    var12.addSuppressed((java.lang.Throwable)var27);
    java.lang.Throwable[] var30 = var12.getSuppressed();
    java.lang.Throwable[] var31 = var12.getSuppressed();
    java.lang.Throwable[] var32 = var12.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var28.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var11 = var6.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var18 = var17.getSuppressed();
    java.lang.String var19 = var17.toString();
    var15.addSuppressed((java.lang.Throwable)var17);
    var13.addSuppressed((java.lang.Throwable)var15);
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("hi!");
    java.lang.String var26 = var25.toString();
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var31 = var30.getSuppressed();
    java.lang.String var32 = var30.toString();
    var28.addSuppressed((java.lang.Throwable)var30);
    var25.addSuppressed((java.lang.Throwable)var30);
    var23.addSuppressed((java.lang.Throwable)var25);
    var15.addSuppressed((java.lang.Throwable)var23);
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("hi!");
    java.lang.String var39 = var38.toString();
    exercise01.RingBufferException var41 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var43 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var44 = var43.getSuppressed();
    java.lang.String var45 = var43.toString();
    var41.addSuppressed((java.lang.Throwable)var43);
    var38.addSuppressed((java.lang.Throwable)var43);
    exercise01.RingBufferException var49 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var51 = new exercise01.RingBufferException("hi!");
    java.lang.String var52 = var51.toString();
    exercise01.RingBufferException var54 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var57 = var56.getSuppressed();
    java.lang.String var58 = var56.toString();
    var54.addSuppressed((java.lang.Throwable)var56);
    var51.addSuppressed((java.lang.Throwable)var56);
    var49.addSuppressed((java.lang.Throwable)var51);
    var43.addSuppressed((java.lang.Throwable)var49);
    var23.addSuppressed((java.lang.Throwable)var43);
    java.lang.Throwable[] var64 = var43.getSuppressed();
    var6.addSuppressed((java.lang.Throwable)var43);
    java.lang.Throwable[] var66 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var26.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var39.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "exercise01.RingBufferException: "+ "'", var45.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var52.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "exercise01.RingBufferException: "+ "'", var58.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var25 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("hi!");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var14 = var13.getSuppressed();
    java.lang.String var15 = var13.toString();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var18 = var17.getSuppressed();
    java.lang.String var19 = var17.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("hi!");
    java.lang.String var22 = var21.toString();
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var27 = var26.getSuppressed();
    java.lang.String var28 = var26.toString();
    var24.addSuppressed((java.lang.Throwable)var26);
    var21.addSuppressed((java.lang.Throwable)var26);
    var17.addSuppressed((java.lang.Throwable)var26);
    var13.addSuppressed((java.lang.Throwable)var26);
    java.lang.String var33 = var13.toString();
    var9.addSuppressed((java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var10.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var11.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var22.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.String var18 = var16.toString();
    var14.addSuppressed((java.lang.Throwable)var16);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var22 = var12.toString();
    java.lang.Throwable[] var23 = var12.getSuppressed();
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var28 = var27.getSuppressed();
    java.lang.String var29 = var27.toString();
    var25.addSuppressed((java.lang.Throwable)var27);
    var12.addSuppressed((java.lang.Throwable)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("hi!");
    java.lang.String var40 = var39.toString();
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var45 = var44.getSuppressed();
    java.lang.String var46 = var44.toString();
    var42.addSuppressed((java.lang.Throwable)var44);
    var39.addSuppressed((java.lang.Throwable)var44);
    var37.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    var31.addSuppressed((java.lang.Throwable)var53);
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var57 = var56.getSuppressed();
    java.lang.String var58 = var56.toString();
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var61 = var60.getSuppressed();
    java.lang.String var62 = var60.toString();
    exercise01.RingBufferException var64 = new exercise01.RingBufferException("hi!");
    java.lang.String var65 = var64.toString();
    exercise01.RingBufferException var67 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var69 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var70 = var69.getSuppressed();
    java.lang.String var71 = var69.toString();
    var67.addSuppressed((java.lang.Throwable)var69);
    var64.addSuppressed((java.lang.Throwable)var69);
    var60.addSuppressed((java.lang.Throwable)var69);
    var56.addSuppressed((java.lang.Throwable)var69);
    var31.addSuppressed((java.lang.Throwable)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var40.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: "+ "'", var46.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "exercise01.RingBufferException: "+ "'", var58.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "exercise01.RingBufferException: "+ "'", var62.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var65.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "exercise01.RingBufferException: "+ "'", var71.equals("exercise01.RingBufferException: "));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("hi!");
    java.lang.String var7 = var6.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var12 = var11.getSuppressed();
    java.lang.String var13 = var11.toString();
    var9.addSuppressed((java.lang.Throwable)var11);
    var6.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var22 = var21.getSuppressed();
    java.lang.String var23 = var21.toString();
    var19.addSuppressed((java.lang.Throwable)var21);
    var17.addSuppressed((java.lang.Throwable)var19);
    var11.addSuppressed((java.lang.Throwable)var17);
    java.lang.Throwable[] var27 = var11.getSuppressed();
    java.lang.Throwable[] var28 = var11.getSuppressed();
    java.lang.String var29 = var11.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var29);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var7.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("hi!");
    java.lang.String var6 = var5.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var10);
    var1.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var16 = var10.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var28 = var23.toString();
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("hi!");
    java.lang.String var31 = var30.toString();
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var36 = var35.getSuppressed();
    java.lang.String var37 = var35.toString();
    var33.addSuppressed((java.lang.Throwable)var35);
    var30.addSuppressed((java.lang.Throwable)var35);
    exercise01.RingBufferException var41 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var43 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var45 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var46 = var45.getSuppressed();
    java.lang.String var47 = var45.toString();
    var43.addSuppressed((java.lang.Throwable)var45);
    var41.addSuppressed((java.lang.Throwable)var43);
    var35.addSuppressed((java.lang.Throwable)var41);
    exercise01.RingBufferException var52 = new exercise01.RingBufferException("hi!");
    java.lang.String var53 = var52.toString();
    exercise01.RingBufferException var55 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var57 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var58 = var57.getSuppressed();
    java.lang.String var59 = var57.toString();
    var55.addSuppressed((java.lang.Throwable)var57);
    var52.addSuppressed((java.lang.Throwable)var57);
    var41.addSuppressed((java.lang.Throwable)var57);
    var23.addSuppressed((java.lang.Throwable)var57);
    var10.addSuppressed((java.lang.Throwable)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var31.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "exercise01.RingBufferException: "+ "'", var47.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var53.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "exercise01.RingBufferException: "+ "'", var59.equals("exercise01.RingBufferException: "));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.toString();
    var8.addSuppressed((java.lang.Throwable)var10);
    var6.addSuppressed((java.lang.Throwable)var8);
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    java.lang.String var19 = var18.toString();
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    java.lang.String var25 = var23.toString();
    var21.addSuppressed((java.lang.Throwable)var23);
    var18.addSuppressed((java.lang.Throwable)var23);
    var16.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var30 = var8.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var8);
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("hi!");
    java.lang.String var34 = var33.toString();
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var39 = var38.getSuppressed();
    java.lang.String var40 = var38.toString();
    var36.addSuppressed((java.lang.Throwable)var38);
    var33.addSuppressed((java.lang.Throwable)var38);
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var46 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var48 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var49 = var48.getSuppressed();
    java.lang.String var50 = var48.toString();
    var46.addSuppressed((java.lang.Throwable)var48);
    var44.addSuppressed((java.lang.Throwable)var46);
    var38.addSuppressed((java.lang.Throwable)var44);
    var8.addSuppressed((java.lang.Throwable)var44);
    java.lang.String var55 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var34.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: "+ "'", var40.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "exercise01.RingBufferException: "+ "'", var50.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "exercise01.RingBufferException: "+ "'", var55.equals("exercise01.RingBufferException: "));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(10);
    var4.enqueue((java.lang.Object)0);
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    java.lang.String var9 = var8.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var14 = var13.getSuppressed();
    java.lang.String var15 = var13.toString();
    var11.addSuppressed((java.lang.Throwable)var13);
    var8.addSuppressed((java.lang.Throwable)var13);
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("hi!");
    java.lang.String var22 = var21.toString();
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var27 = var26.getSuppressed();
    java.lang.String var28 = var26.toString();
    var24.addSuppressed((java.lang.Throwable)var26);
    var21.addSuppressed((java.lang.Throwable)var26);
    var19.addSuppressed((java.lang.Throwable)var21);
    var13.addSuppressed((java.lang.Throwable)var19);
    java.lang.Throwable[] var33 = var13.getSuppressed();
    var4.enqueue((java.lang.Object)var13);
    var1.addSuppressed((java.lang.Throwable)var13);
    java.lang.Throwable[] var36 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var9.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var22.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("hi!");
    java.lang.String var40 = var39.toString();
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var45 = var44.getSuppressed();
    java.lang.String var46 = var44.toString();
    var42.addSuppressed((java.lang.Throwable)var44);
    var39.addSuppressed((java.lang.Throwable)var44);
    var37.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var31);
    java.lang.String var52 = var31.toString();
    exercise01.RingBufferException var54 = new exercise01.RingBufferException("hi!");
    java.lang.String var55 = var54.toString();
    exercise01.RingBufferException var57 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var59 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var60 = var59.getSuppressed();
    java.lang.String var61 = var59.toString();
    var57.addSuppressed((java.lang.Throwable)var59);
    var54.addSuppressed((java.lang.Throwable)var59);
    java.lang.String var64 = var59.toString();
    var31.addSuppressed((java.lang.Throwable)var59);
    java.lang.Throwable[] var66 = var31.getSuppressed();
    java.lang.Throwable[] var67 = var31.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var40.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: "+ "'", var46.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "exercise01.RingBufferException: "+ "'", var52.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var55.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "exercise01.RingBufferException: "+ "'", var61.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "exercise01.RingBufferException: "+ "'", var64.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var10 = var1.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    java.lang.String var11 = var9.toString();
    var7.addSuppressed((java.lang.Throwable)var9);
    var4.addSuppressed((java.lang.Throwable)var9);
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    java.lang.String var21 = var19.toString();
    var17.addSuppressed((java.lang.Throwable)var19);
    var15.addSuppressed((java.lang.Throwable)var17);
    var9.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var25 = var15.toString();
    java.lang.Throwable[] var26 = var15.getSuppressed();
    var1.enqueue((java.lang.Object)var15);
    java.lang.String var28 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("hi!");
    java.lang.String var4 = var3.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var9 = var8.getSuppressed();
    java.lang.String var10 = var8.toString();
    var6.addSuppressed((java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var14 = var3.getSuppressed();
    java.lang.Throwable[] var15 = var3.getSuppressed();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var22 = var21.getSuppressed();
    java.lang.String var23 = var21.toString();
    var19.addSuppressed((java.lang.Throwable)var21);
    var17.addSuppressed((java.lang.Throwable)var19);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("hi!");
    java.lang.String var28 = var27.toString();
    var17.addSuppressed((java.lang.Throwable)var27);
    java.lang.Throwable[] var30 = var27.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var28.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.String var18 = var16.toString();
    var14.addSuppressed((java.lang.Throwable)var16);
    var12.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var22 = var12.toString();
    java.lang.String var23 = var12.toString();
    java.lang.Throwable[] var24 = var12.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var11);
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("hi!");
    java.lang.String var27 = var26.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.lang.String var33 = var31.toString();
    var29.addSuppressed((java.lang.Throwable)var31);
    var26.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("hi!");
    java.lang.String var40 = var39.toString();
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var44 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var45 = var44.getSuppressed();
    java.lang.String var46 = var44.toString();
    var42.addSuppressed((java.lang.Throwable)var44);
    var39.addSuppressed((java.lang.Throwable)var44);
    var37.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var37);
    var11.addSuppressed((java.lang.Throwable)var31);
    java.lang.Throwable[] var52 = var31.getSuppressed();
    exercise01.RingBufferException var54 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var56 = new exercise01.RingBufferException("hi!");
    java.lang.String var57 = var56.toString();
    exercise01.RingBufferException var59 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var61 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var62 = var61.getSuppressed();
    java.lang.String var63 = var61.toString();
    var59.addSuppressed((java.lang.Throwable)var61);
    var56.addSuppressed((java.lang.Throwable)var61);
    var54.addSuppressed((java.lang.Throwable)var56);
    java.lang.Throwable[] var67 = var54.getSuppressed();
    var31.addSuppressed((java.lang.Throwable)var54);
    exercise01.RingBufferException var70 = new exercise01.RingBufferException("hi!");
    java.lang.String var71 = var70.toString();
    exercise01.RingBufferException var73 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var75 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var76 = var75.getSuppressed();
    java.lang.String var77 = var75.toString();
    var73.addSuppressed((java.lang.Throwable)var75);
    var70.addSuppressed((java.lang.Throwable)var75);
    exercise01.RingBufferException var81 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var83 = new exercise01.RingBufferException("hi!");
    java.lang.String var84 = var83.toString();
    exercise01.RingBufferException var86 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var88 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var89 = var88.getSuppressed();
    java.lang.String var90 = var88.toString();
    var86.addSuppressed((java.lang.Throwable)var88);
    var83.addSuppressed((java.lang.Throwable)var88);
    var81.addSuppressed((java.lang.Throwable)var83);
    var75.addSuppressed((java.lang.Throwable)var81);
    var54.addSuppressed((java.lang.Throwable)var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var27.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var40.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "exercise01.RingBufferException: "+ "'", var46.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var57.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "exercise01.RingBufferException: "+ "'", var63.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var71.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "exercise01.RingBufferException: "+ "'", var77.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var84.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "exercise01.RingBufferException: "+ "'", var90.equals("exercise01.RingBufferException: "));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    java.lang.String var11 = var9.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    var9.addSuppressed((java.lang.Throwable)var18);
    var5.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var25 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("hi!");
    java.lang.String var31 = var30.toString();
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var36 = var35.getSuppressed();
    java.lang.String var37 = var35.toString();
    var33.addSuppressed((java.lang.Throwable)var35);
    var30.addSuppressed((java.lang.Throwable)var35);
    var28.addSuppressed((java.lang.Throwable)var30);
    java.lang.Throwable[] var41 = var30.getSuppressed();
    java.lang.Throwable[] var42 = var30.getSuppressed();
    java.lang.String var43 = var30.toString();
    var1.addSuppressed((java.lang.Throwable)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var3.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var31.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var43.equals("exercise01.RingBufferException: hi!"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)0);
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var9 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.String var18 = var16.toString();
    var14.addSuppressed((java.lang.Throwable)var16);
    var12.addSuppressed((java.lang.Throwable)var14);
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("hi!");
    java.lang.String var23 = var22.toString();
    var12.addSuppressed((java.lang.Throwable)var22);
    var5.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var26 = var5.getSuppressed();
    java.lang.String var27 = var5.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("hi!");
    java.lang.String var30 = var29.toString();
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var35 = var34.getSuppressed();
    java.lang.String var36 = var34.toString();
    var32.addSuppressed((java.lang.Throwable)var34);
    var29.addSuppressed((java.lang.Throwable)var34);
    exercise01.RingBufferException var40 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var42 = new exercise01.RingBufferException("hi!");
    java.lang.String var43 = var42.toString();
    exercise01.RingBufferException var45 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var48 = var47.getSuppressed();
    java.lang.String var49 = var47.toString();
    var45.addSuppressed((java.lang.Throwable)var47);
    var42.addSuppressed((java.lang.Throwable)var47);
    var40.addSuppressed((java.lang.Throwable)var42);
    var34.addSuppressed((java.lang.Throwable)var40);
    exercise01.RingBufferException var55 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var56 = var55.getSuppressed();
    java.lang.String var57 = var55.toString();
    java.lang.String var58 = var55.toString();
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var62 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var64 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var65 = var64.getSuppressed();
    java.lang.String var66 = var64.toString();
    var62.addSuppressed((java.lang.Throwable)var64);
    var60.addSuppressed((java.lang.Throwable)var62);
    exercise01.RingBufferException var70 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var72 = new exercise01.RingBufferException("hi!");
    java.lang.String var73 = var72.toString();
    exercise01.RingBufferException var75 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var77 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var78 = var77.getSuppressed();
    java.lang.String var79 = var77.toString();
    var75.addSuppressed((java.lang.Throwable)var77);
    var72.addSuppressed((java.lang.Throwable)var77);
    var70.addSuppressed((java.lang.Throwable)var72);
    var62.addSuppressed((java.lang.Throwable)var70);
    java.lang.Throwable[] var84 = var62.getSuppressed();
    var55.addSuppressed((java.lang.Throwable)var62);
    var34.addSuppressed((java.lang.Throwable)var62);
    java.lang.Throwable[] var87 = var34.getSuppressed();
    var5.addSuppressed((java.lang.Throwable)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var23.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: "+ "'", var27.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var30.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "exercise01.RingBufferException: "+ "'", var36.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var43.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "exercise01.RingBufferException: "+ "'", var49.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "exercise01.RingBufferException: "+ "'", var57.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "exercise01.RingBufferException: "+ "'", var58.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "exercise01.RingBufferException: "+ "'", var66.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var73.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "exercise01.RingBufferException: "+ "'", var79.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

}
