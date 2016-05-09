package exercise01_01s;

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


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


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

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


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

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


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

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


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

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


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

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


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

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


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

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


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

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


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

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var4.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


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

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


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

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


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

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


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

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


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

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


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

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


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

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


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

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var10 = var1.toString();
    java.lang.String var11 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: exercise01.RingBufferException: "));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


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
    java.lang.Throwable[] var14 = var1.getSuppressed();
    java.lang.Throwable[] var15 = var1.getSuppressed();
    
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

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


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

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


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

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


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

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


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

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


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

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


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

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


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

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


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

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


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

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


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

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


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

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: hi!");

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


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

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


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

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


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

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


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

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


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

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


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

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


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

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


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

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("hi!");
    java.lang.String var7 = var6.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var12 = var11.getSuppressed();
    java.lang.String var13 = var11.toString();
    var9.addSuppressed((java.lang.Throwable)var11);
    var6.addSuppressed((java.lang.Throwable)var11);
    var4.addSuppressed((java.lang.Throwable)var6);
    java.lang.Throwable[] var17 = var4.getSuppressed();
    java.lang.String var18 = var4.toString();
    var1.addSuppressed((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var7.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


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

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


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

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


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

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


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

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


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

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


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

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


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

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


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

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


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

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


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

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


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

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


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

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var12.equals("exercise01.RingBufferException: hi!"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


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

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


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

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


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

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


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

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


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

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    
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

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


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

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


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

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


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

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
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

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Spliterator var6 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


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

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


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

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


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

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


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

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("hi!");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var1.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var5.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var6.equals("exercise01.RingBufferException: hi!"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


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
    java.lang.Throwable[] var21 = var14.getSuppressed();
    
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
    assertNotNull(var21);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


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

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


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

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


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

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


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

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


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

  }

}
