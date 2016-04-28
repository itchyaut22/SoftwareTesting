package exercise01_60s;

import junit.framework.*;

public class RandoopTest13 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test1");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    boolean var12 = var10.hasNext();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Iterator var16 = var15.iterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var15.new RingBufferIterator();
    int var18 = var15.size();
    exercise01.RingBuffer.RingBufferIterator var19 = var15.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var19);
    boolean var21 = var19.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var19.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test2");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    int var4 = var3.size();
    java.util.Spliterator var5 = var3.spliterator();
    int var6 = var3.size();
    boolean var7 = var3.isEmpty();
    java.util.Iterator var8 = var3.iterator();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var10 = var1.iterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(100);
    java.util.Iterator var14 = var13.iterator();
    java.util.Spliterator var15 = var13.spliterator();
    int var16 = var13.size();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    int var19 = var18.size();
    int var20 = var18.size();
    int var21 = var18.size();
    exercise01.RingBuffer.RingBufferIterator var22 = var18.new RingBufferIterator();
    boolean var23 = var22.hasNext();
    var13.enqueue((java.lang.Object)var22);
    boolean var25 = var13.isEmpty();
    boolean var26 = var13.isEmpty();
    java.util.Iterator var27 = var13.iterator();
    var1.enqueue((java.lang.Object)var27);
    int var29 = var1.size();
    java.lang.Object var30 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test3");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    int var7 = var3.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var3.new RingBufferIterator();
    java.util.Iterator var9 = var3.iterator();
    var1.enqueue((java.lang.Object)var9);
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    java.util.Iterator var15 = var12.iterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var12.new RingBufferIterator();
    java.util.Spliterator var17 = var12.spliterator();
    var1.enqueue((java.lang.Object)var17);
    boolean var19 = var1.isEmpty();
    java.util.Spliterator var20 = var1.spliterator();
    java.util.Iterator var21 = var1.iterator();
    java.lang.Object var22 = var1.dequeue();
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(0);
    java.util.Iterator var25 = var24.iterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var24.new RingBufferIterator();
    int var27 = var24.size();
    java.util.Iterator var28 = var24.iterator();
    java.util.Iterator var29 = var24.iterator();
    java.util.Spliterator var30 = var24.spliterator();
    boolean var31 = var24.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var32 = var24.new RingBufferIterator();
    java.util.Spliterator var33 = var24.spliterator();
    var1.enqueue((java.lang.Object)var24);
    java.lang.Object var35 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test4");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test5");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    boolean var10 = var7.isEmpty();
    boolean var11 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var7.new RingBufferIterator();
    int var13 = var7.size();
    java.util.Spliterator var14 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    boolean var16 = var1.isEmpty();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Iterator var19 = var18.iterator();
    int var20 = var18.size();
    int var21 = var18.size();
    java.util.Spliterator var22 = var18.spliterator();
    java.util.Iterator var23 = var18.iterator();
    int var24 = var18.size();
    java.util.Iterator var25 = var18.iterator();
    java.util.Spliterator var26 = var18.spliterator();
    var1.enqueue((java.lang.Object)var26);
    java.util.Iterator var28 = var1.iterator();
    java.lang.Object var29 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var30 = var1.new RingBufferIterator();
    java.util.Spliterator var31 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test6");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    java.util.Iterator var8 = var7.iterator();
    int var9 = var7.size();
    int var10 = var7.size();
    int var11 = var7.size();
    java.util.Spliterator var12 = var7.spliterator();
    int var13 = var7.size();
    var1.enqueue((java.lang.Object)var13);
    int var15 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test7");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    int var7 = var5.size();
    java.util.Spliterator var8 = var5.spliterator();
    java.util.Iterator var9 = var5.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var1.enqueue((java.lang.Object)var17);
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var24 = var23.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var23.new RingBufferIterator();
    int var26 = var23.size();
    java.util.Iterator var27 = var23.iterator();
    java.util.Spliterator var28 = var23.spliterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var23.new RingBufferIterator();
    java.util.Iterator var30 = var23.iterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var23.new RingBufferIterator();
    var17.enqueue((java.lang.Object)var31);
    java.util.Iterator var33 = var17.iterator();
    java.util.Iterator var34 = var17.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test8");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var1.isEmpty();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    int var16 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test9");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test10");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test11");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var15.enqueue((java.lang.Object)var17);
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    int var24 = var10.size();
    java.util.Iterator var25 = var10.iterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var10.new RingBufferIterator();
    boolean var27 = var26.hasNext();
    java.lang.Object var28 = var26.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test12");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    java.util.Spliterator var11 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    boolean var14 = var12.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test13");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(10);
    int var17 = var16.size();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    java.util.Spliterator var20 = var16.spliterator();
    boolean var21 = var16.isEmpty();
    java.util.Iterator var22 = var16.iterator();
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(0);
    java.util.Iterator var25 = var24.iterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var24.new RingBufferIterator();
    int var27 = var24.size();
    java.util.Iterator var28 = var24.iterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var24.new RingBufferIterator();
    var16.enqueue((java.lang.Object)var24);
    java.util.Iterator var31 = var24.iterator();
    var1.enqueue((java.lang.Object)var31);
    boolean var33 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var34 = var1.new RingBufferIterator();
    boolean var35 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test14");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var5.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    var1.enqueue((java.lang.Object)var10);
    int var13 = var1.size();
    java.util.Spliterator var14 = var1.spliterator();
    java.util.Spliterator var15 = var1.spliterator();
    java.lang.Object var16 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test15");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    int var14 = var12.size();
    exercise01.RingBuffer.RingBufferIterator var15 = var12.new RingBufferIterator();
    int var16 = var12.size();
    java.util.Spliterator var17 = var12.spliterator();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBuffer.RingBufferIterator var19 = var12.new RingBufferIterator();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(0);
    java.util.Spliterator var24 = var23.spliterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var23.new RingBufferIterator();
    java.util.Spliterator var26 = var23.spliterator();
    var21.enqueue((java.lang.Object)var23);
    exercise01.RingBuffer var29 = new exercise01.RingBuffer(100);
    java.util.Spliterator var30 = var29.spliterator();
    var21.enqueue((java.lang.Object)var30);
    java.util.Spliterator var32 = var21.spliterator();
    var12.enqueue((java.lang.Object)var21);
    boolean var34 = var21.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var35 = var21.new RingBufferIterator();
    boolean var36 = var35.hasNext();
    java.lang.Object var37 = var35.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var35.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test16");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    int var11 = var10.size();
    java.util.Iterator var12 = var10.iterator();
    boolean var13 = var10.isEmpty();
    boolean var14 = var10.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    int var16 = var10.size();
    java.util.Spliterator var17 = var10.spliterator();
    int var18 = var10.size();
    int var19 = var10.size();
    java.util.Spliterator var20 = var10.spliterator();
    java.util.Spliterator var21 = var10.spliterator();
    var1.enqueue((java.lang.Object)var21);
    int var23 = var1.size();
    int var24 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test17");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test18");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.util.Iterator var9 = var1.iterator();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    java.util.Spliterator var15 = var13.spliterator();
    boolean var16 = var13.isEmpty();
    java.util.Spliterator var17 = var13.spliterator();
    java.util.Iterator var18 = var13.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var18);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test19");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var9 = var8.new RingBufferIterator();
    java.util.Iterator var10 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    java.util.Spliterator var12 = var8.spliterator();
    int var13 = var8.size();
    exercise01.RingBuffer.RingBufferIterator var14 = var8.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test20");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    boolean var9 = var3.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var3.new RingBufferIterator();
    int var11 = var3.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var3.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test21");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    boolean var9 = var8.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test22");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    java.util.Iterator var12 = var1.iterator();
    java.util.Spliterator var13 = var1.spliterator();
    int var14 = var1.size();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    java.util.Spliterator var17 = var16.spliterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var16.new RingBufferIterator();
    java.util.Spliterator var19 = var16.spliterator();
    int var20 = var16.size();
    int var21 = var16.size();
    boolean var22 = var16.isEmpty();
    java.util.Spliterator var23 = var16.spliterator();
    int var24 = var16.size();
    boolean var25 = var16.isEmpty();
    int var26 = var16.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var26);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test23");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    boolean var9 = var8.hasNext();
    var1.enqueue((java.lang.Object)var8);
    boolean var11 = var8.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test24");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    java.util.Iterator var22 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var13.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var25 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var26 = var1.new RingBufferIterator();
    java.util.Iterator var27 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test25");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    int var6 = var4.size();
    int var7 = var4.size();
    int var8 = var4.size();
    java.util.Spliterator var9 = var4.spliterator();
    var1.enqueue((java.lang.Object)var4);
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var1.isEmpty();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test26");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var10.new RingBufferIterator();
    java.util.Spliterator var13 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    var1.enqueue((java.lang.Object)var14);
    java.util.Spliterator var17 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var1.new RingBufferIterator();
    boolean var19 = var18.hasNext();
    java.lang.Object var20 = var18.next();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test27");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Iterator var9 = var8.iterator();
    int var10 = var8.size();
    int var11 = var8.size();
    int var12 = var8.size();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    boolean var14 = var13.hasNext();
    boolean var15 = var13.hasNext();
    boolean var16 = var13.hasNext();
    var1.enqueue((java.lang.Object)var13);
    boolean var18 = var13.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test28");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test29");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var22 = var9.size();
    int var23 = var9.size();
    int var24 = var9.size();
    java.lang.Object var25 = var9.dequeue();
    boolean var26 = var9.isEmpty();
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var30 = new exercise01.RingBuffer(0);
    java.util.Spliterator var31 = var30.spliterator();
    exercise01.RingBuffer.RingBufferIterator var32 = var30.new RingBufferIterator();
    java.util.Spliterator var33 = var30.spliterator();
    int var34 = var30.size();
    exercise01.RingBuffer.RingBufferIterator var35 = var30.new RingBufferIterator();
    java.util.Iterator var36 = var30.iterator();
    var28.enqueue((java.lang.Object)var36);
    exercise01.RingBuffer var39 = new exercise01.RingBuffer(10);
    int var40 = var39.size();
    boolean var41 = var39.isEmpty();
    java.util.Iterator var42 = var39.iterator();
    exercise01.RingBuffer.RingBufferIterator var43 = var39.new RingBufferIterator();
    java.util.Spliterator var44 = var39.spliterator();
    var28.enqueue((java.lang.Object)var44);
    boolean var46 = var28.isEmpty();
    java.util.Spliterator var47 = var28.spliterator();
    java.util.Iterator var48 = var28.iterator();
    var9.enqueue((java.lang.Object)var28);
    java.util.Iterator var50 = var28.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test30");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Spliterator var16 = var15.spliterator();
    java.util.Spliterator var17 = var15.spliterator();
    java.util.Spliterator var18 = var15.spliterator();
    java.util.Iterator var19 = var15.iterator();
    java.util.Spliterator var20 = var15.spliterator();
    java.util.Spliterator var21 = var15.spliterator();
    var1.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(10);
    int var25 = var24.size();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    java.util.Spliterator var28 = var24.spliterator();
    var24.enqueue((java.lang.Object)(short)1);
    int var31 = var24.size();
    exercise01.RingBuffer var33 = new exercise01.RingBuffer(100);
    java.util.Iterator var34 = var33.iterator();
    java.util.Spliterator var35 = var33.spliterator();
    java.util.Spliterator var36 = var33.spliterator();
    exercise01.RingBuffer var38 = new exercise01.RingBuffer(0);
    int var39 = var38.size();
    java.util.Iterator var40 = var38.iterator();
    var33.enqueue((java.lang.Object)var38);
    boolean var42 = var33.isEmpty();
    int var43 = var33.size();
    boolean var44 = var33.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var45 = var33.new RingBufferIterator();
    java.lang.Object var46 = var45.next();
    var24.enqueue(var46);
    exercise01.RingBuffer var49 = new exercise01.RingBuffer(0);
    java.util.Spliterator var50 = var49.spliterator();
    java.util.Spliterator var51 = var49.spliterator();
    java.util.Spliterator var52 = var49.spliterator();
    java.util.Iterator var53 = var49.iterator();
    boolean var54 = var49.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var55 = var49.new RingBufferIterator();
    var24.enqueue((java.lang.Object)var49);
    var1.enqueue((java.lang.Object)var24);
    exercise01.RingBuffer var59 = new exercise01.RingBuffer(0);
    java.util.Spliterator var60 = var59.spliterator();
    java.util.Spliterator var61 = var59.spliterator();
    java.util.Spliterator var62 = var59.spliterator();
    java.util.Spliterator var63 = var59.spliterator();
    exercise01.RingBuffer.RingBufferIterator var64 = var59.new RingBufferIterator();
    java.util.Spliterator var65 = var59.spliterator();
    boolean var66 = var59.isEmpty();
    var1.enqueue((java.lang.Object)var59);
    java.util.Spliterator var68 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test31");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    boolean var8 = var6.hasNext();
    boolean var9 = var6.hasNext();
    boolean var10 = var6.hasNext();
    boolean var11 = var6.hasNext();
    boolean var12 = var6.hasNext();
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
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test32");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    int var9 = var8.size();
    java.util.Iterator var10 = var8.iterator();
    boolean var11 = var8.isEmpty();
    boolean var12 = var8.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var8);
    java.util.Spliterator var15 = var8.spliterator();
    java.util.Iterator var16 = var8.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test33");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    int var12 = var1.size();
    boolean var13 = var1.isEmpty();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test34");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    boolean var9 = var3.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var3.new RingBufferIterator();
    int var11 = var3.size();
    int var12 = var3.size();
    int var13 = var3.size();
    java.util.Spliterator var14 = var3.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test35");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    int var6 = var4.size();
    int var7 = var4.size();
    int var8 = var4.size();
    java.util.Spliterator var9 = var4.spliterator();
    var1.enqueue((java.lang.Object)var4);
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    java.lang.Object var13 = var1.dequeue();
    int var14 = var1.size();
    java.util.Spliterator var15 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test36");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test37");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    int var16 = var10.size();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(0);
    java.util.Spliterator var21 = var20.spliterator();
    exercise01.RingBuffer.RingBufferIterator var22 = var20.new RingBufferIterator();
    java.util.Spliterator var23 = var20.spliterator();
    var18.enqueue((java.lang.Object)var20);
    exercise01.RingBuffer var26 = new exercise01.RingBuffer(100);
    java.util.Spliterator var27 = var26.spliterator();
    var18.enqueue((java.lang.Object)var27);
    java.util.Iterator var29 = var18.iterator();
    var10.enqueue((java.lang.Object)var18);
    int var31 = var18.size();
    int var32 = var18.size();
    int var33 = var18.size();
    java.util.Spliterator var34 = var18.spliterator();
    java.util.Spliterator var35 = var18.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var18);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test38");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test39");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Iterator var10 = var9.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var9.new RingBufferIterator();
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var9.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Spliterator var16 = var1.spliterator();
    int var17 = var1.size();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(0);
    java.util.Spliterator var20 = var19.spliterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var19.new RingBufferIterator();
    java.util.Spliterator var22 = var19.spliterator();
    int var23 = var19.size();
    exercise01.RingBuffer.RingBufferIterator var24 = var19.new RingBufferIterator();
    java.util.Iterator var25 = var19.iterator();
    boolean var26 = var19.isEmpty();
    int var27 = var19.size();
    boolean var28 = var19.isEmpty();
    boolean var29 = var19.isEmpty();
    int var30 = var19.size();
    java.util.Iterator var31 = var19.iterator();
    var1.enqueue((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test40");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test41");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test42");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var11 = var10.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    int var13 = var1.size();
    int var14 = var1.size();
    int var15 = var1.size();
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(0);
    java.util.Spliterator var20 = var19.spliterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var19.new RingBufferIterator();
    java.util.Spliterator var22 = var19.spliterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var19.new RingBufferIterator();
    var17.enqueue((java.lang.Object)var19);
    exercise01.RingBuffer.RingBufferIterator var25 = var19.new RingBufferIterator();
    boolean var26 = var19.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var27 = var19.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var27);
    boolean var29 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test43");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Iterator var11 = var10.iterator();
    int var12 = var10.size();
    int var13 = var10.size();
    java.util.Spliterator var14 = var10.spliterator();
    java.util.Spliterator var15 = var10.spliterator();
    int var16 = var10.size();
    java.util.Spliterator var17 = var10.spliterator();
    var1.enqueue((java.lang.Object)var10);
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(100);
    java.util.Iterator var21 = var20.iterator();
    java.util.Spliterator var22 = var20.spliterator();
    int var23 = var20.size();
    exercise01.RingBuffer var25 = new exercise01.RingBuffer(0);
    int var26 = var25.size();
    int var27 = var25.size();
    int var28 = var25.size();
    exercise01.RingBuffer.RingBufferIterator var29 = var25.new RingBufferIterator();
    boolean var30 = var29.hasNext();
    var20.enqueue((java.lang.Object)var29);
    var1.enqueue((java.lang.Object)var20);
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(0);
    java.util.Spliterator var35 = var34.spliterator();
    exercise01.RingBuffer.RingBufferIterator var36 = var34.new RingBufferIterator();
    java.util.Spliterator var37 = var34.spliterator();
    java.util.Spliterator var38 = var34.spliterator();
    exercise01.RingBuffer.RingBufferIterator var39 = var34.new RingBufferIterator();
    java.util.Iterator var40 = var34.iterator();
    int var41 = var34.size();
    int var42 = var34.size();
    var1.enqueue((java.lang.Object)var42);
    java.util.Spliterator var44 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var45 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test44");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(10);
    int var8 = var7.size();
    boolean var9 = var7.isEmpty();
    java.util.Iterator var10 = var7.iterator();
    boolean var11 = var7.isEmpty();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(1);
    boolean var14 = var13.isEmpty();
    var7.enqueue((java.lang.Object)var13);
    var1.enqueue((java.lang.Object)var13);
    boolean var17 = var13.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var18 = var13.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test45");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Spliterator var9 = var7.spliterator();
    int var10 = var7.size();
    java.util.Spliterator var11 = var7.spliterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    int var14 = var7.size();
    exercise01.RingBuffer.RingBufferIterator var15 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var7.new RingBufferIterator();
    java.util.Iterator var17 = var7.iterator();
    java.util.Spliterator var18 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    exercise01.RingBuffer.RingBufferIterator var20 = var1.new RingBufferIterator();
    exercise01.RingBuffer var22 = new exercise01.RingBuffer(10);
    int var23 = var22.size();
    boolean var24 = var22.isEmpty();
    java.util.Iterator var25 = var22.iterator();
    boolean var26 = var22.isEmpty();
    boolean var27 = var22.isEmpty();
    java.util.Iterator var28 = var22.iterator();
    boolean var29 = var22.isEmpty();
    exercise01.RingBuffer var31 = new exercise01.RingBuffer(0);
    java.util.Iterator var32 = var31.iterator();
    int var33 = var31.size();
    int var34 = var31.size();
    java.util.Spliterator var35 = var31.spliterator();
    java.util.Spliterator var36 = var31.spliterator();
    int var37 = var31.size();
    java.util.Spliterator var38 = var31.spliterator();
    var22.enqueue((java.lang.Object)var31);
    int var40 = var22.size();
    exercise01.RingBuffer.RingBufferIterator var41 = var22.new RingBufferIterator();
    java.lang.Object var42 = var22.dequeue();
    boolean var43 = var22.isEmpty();
    var1.enqueue((java.lang.Object)var22);
    exercise01.RingBuffer var46 = new exercise01.RingBuffer(100);
    java.util.Iterator var47 = var46.iterator();
    java.util.Spliterator var48 = var46.spliterator();
    java.util.Spliterator var49 = var46.spliterator();
    exercise01.RingBuffer var51 = new exercise01.RingBuffer(0);
    int var52 = var51.size();
    java.util.Iterator var53 = var51.iterator();
    var46.enqueue((java.lang.Object)var51);
    boolean var55 = var46.isEmpty();
    int var56 = var46.size();
    exercise01.RingBuffer var58 = new exercise01.RingBuffer(100);
    java.util.Spliterator var59 = var58.spliterator();
    boolean var60 = var58.isEmpty();
    int var61 = var58.size();
    java.util.Iterator var62 = var58.iterator();
    int var63 = var58.size();
    java.util.Iterator var64 = var58.iterator();
    java.util.Spliterator var65 = var58.spliterator();
    var46.enqueue((java.lang.Object)var58);
    var22.enqueue((java.lang.Object)var46);
    int var68 = var46.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test46");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    boolean var14 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test47");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Spliterator var10 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test48");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    java.util.Spliterator var12 = var8.spliterator();
    java.util.Iterator var13 = var8.iterator();
    boolean var14 = var8.isEmpty();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    int var17 = var16.size();
    java.util.Iterator var18 = var16.iterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var16.new RingBufferIterator();
    boolean var20 = var16.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var21 = var16.new RingBufferIterator();
    boolean var22 = var21.hasNext();
    var8.enqueue((java.lang.Object)var22);
    int var24 = var8.size();
    java.util.Spliterator var25 = var8.spliterator();
    var1.enqueue((java.lang.Object)var25);
    java.util.Iterator var27 = var1.iterator();
    java.lang.Object var28 = var1.dequeue();
    int var29 = var1.size();
    int var30 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var31 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var32 = var31.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test49");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var10 = var1.isEmpty();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Iterator var12 = var1.iterator();
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    java.util.Spliterator var15 = var1.spliterator();
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(10);
    int var18 = var17.size();
    java.util.Spliterator var19 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var17.new RingBufferIterator();
    int var21 = var17.size();
    java.util.Spliterator var22 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var17.new RingBufferIterator();
    boolean var24 = var17.isEmpty();
    exercise01.RingBuffer var26 = new exercise01.RingBuffer(0);
    java.util.Spliterator var27 = var26.spliterator();
    java.util.Spliterator var28 = var26.spliterator();
    java.util.Spliterator var29 = var26.spliterator();
    java.util.Spliterator var30 = var26.spliterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var26.new RingBufferIterator();
    boolean var32 = var31.hasNext();
    boolean var33 = var31.hasNext();
    var17.enqueue((java.lang.Object)var31);
    java.lang.Object var35 = var17.dequeue();
    exercise01.RingBuffer.RingBufferIterator var36 = var17.new RingBufferIterator();
    exercise01.RingBuffer var38 = new exercise01.RingBuffer(2);
    exercise01.RingBuffer.RingBufferIterator var39 = var38.new RingBufferIterator();
    java.util.Iterator var40 = var38.iterator();
    java.util.Iterator var41 = var38.iterator();
    var17.enqueue((java.lang.Object)var41);
    exercise01.RingBuffer.RingBufferIterator var43 = var17.new RingBufferIterator();
    java.util.Iterator var44 = var17.iterator();
    var1.enqueue((java.lang.Object)var17);
    exercise01.RingBuffer var47 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var48 = var47.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var49 = var47.new RingBufferIterator();
    java.util.Spliterator var50 = var47.spliterator();
    var1.enqueue((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test50");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var22 = var9.size();
    int var23 = var9.size();
    int var24 = var9.size();
    java.util.Spliterator var25 = var9.spliterator();
    java.util.Spliterator var26 = var9.spliterator();
    java.util.Spliterator var27 = var9.spliterator();
    java.util.Iterator var28 = var9.iterator();
    java.lang.Object var29 = var9.dequeue();
    exercise01.RingBuffer var31 = new exercise01.RingBuffer(10);
    int var32 = var31.size();
    boolean var33 = var31.isEmpty();
    java.util.Iterator var34 = var31.iterator();
    java.util.Spliterator var35 = var31.spliterator();
    boolean var36 = var31.isEmpty();
    int var37 = var31.size();
    exercise01.RingBuffer.RingBufferIterator var38 = var31.new RingBufferIterator();
    var9.enqueue((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test51");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    int var14 = var12.size();
    exercise01.RingBuffer.RingBufferIterator var15 = var12.new RingBufferIterator();
    int var16 = var12.size();
    java.util.Spliterator var17 = var12.spliterator();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(1);
    java.util.Spliterator var21 = var20.spliterator();
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(0);
    int var24 = var23.size();
    var20.enqueue((java.lang.Object)var24);
    java.lang.Object var26 = var20.dequeue();
    java.util.Spliterator var27 = var20.spliterator();
    boolean var28 = var20.isEmpty();
    java.util.Iterator var29 = var20.iterator();
    java.util.Spliterator var30 = var20.spliterator();
    boolean var31 = var20.isEmpty();
    java.util.Spliterator var32 = var20.spliterator();
    java.util.Iterator var33 = var20.iterator();
    exercise01.RingBuffer var35 = new exercise01.RingBuffer(10);
    int var36 = var35.size();
    boolean var37 = var35.isEmpty();
    java.util.Iterator var38 = var35.iterator();
    java.util.Spliterator var39 = var35.spliterator();
    boolean var40 = var35.isEmpty();
    java.util.Iterator var41 = var35.iterator();
    exercise01.RingBuffer var43 = new exercise01.RingBuffer(0);
    java.util.Iterator var44 = var43.iterator();
    exercise01.RingBuffer.RingBufferIterator var45 = var43.new RingBufferIterator();
    int var46 = var43.size();
    java.util.Iterator var47 = var43.iterator();
    exercise01.RingBuffer.RingBufferIterator var48 = var43.new RingBufferIterator();
    var35.enqueue((java.lang.Object)var43);
    java.util.Iterator var50 = var43.iterator();
    var20.enqueue((java.lang.Object)var50);
    var1.enqueue((java.lang.Object)var20);
    boolean var53 = var20.isEmpty();
    int var54 = var20.size();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 0+ "'", var26.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test52");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    boolean var10 = var7.isEmpty();
    boolean var11 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var7.new RingBufferIterator();
    int var13 = var7.size();
    java.util.Spliterator var14 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Spliterator var16 = var7.spliterator();
    java.util.Iterator var17 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var7.new RingBufferIterator();
    int var20 = var7.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test53");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test54");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test55");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    java.util.Spliterator var10 = var9.spliterator();
    boolean var11 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(byte)1);
    boolean var14 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var9.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var9.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var18 = var1.isEmpty();
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(1);
    java.util.Spliterator var21 = var20.spliterator();
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(0);
    int var24 = var23.size();
    var20.enqueue((java.lang.Object)var24);
    java.lang.Object var26 = var20.dequeue();
    java.util.Spliterator var27 = var20.spliterator();
    exercise01.RingBuffer.RingBufferIterator var28 = var20.new RingBufferIterator();
    java.util.Iterator var29 = var20.iterator();
    boolean var30 = var20.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var31 = var20.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var31);
    exercise01.RingBuffer.RingBufferIterator var33 = var1.new RingBufferIterator();
    java.lang.Object var34 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 0+ "'", var26.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test56");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test57");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Spliterator var17 = var10.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var17);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test58");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(10);
    int var8 = var7.size();
    boolean var9 = var7.isEmpty();
    java.util.Iterator var10 = var7.iterator();
    java.util.Spliterator var11 = var7.spliterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(1);
    boolean var14 = var13.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    var7.enqueue((java.lang.Object)var13);
    var1.enqueue((java.lang.Object)var7);
    java.util.Spliterator var19 = var7.spliterator();
    java.lang.Object var20 = var7.dequeue();
    java.util.Spliterator var21 = var7.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test59");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var5.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    var1.enqueue((java.lang.Object)var10);
    int var13 = var1.size();
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    boolean var16 = var1.isEmpty();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(10);
    int var19 = var18.size();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    exercise01.RingBuffer.RingBufferIterator var22 = var18.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var18.new RingBufferIterator();
    int var24 = var18.size();
    exercise01.RingBuffer var26 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(0);
    java.util.Spliterator var29 = var28.spliterator();
    exercise01.RingBuffer.RingBufferIterator var30 = var28.new RingBufferIterator();
    java.util.Spliterator var31 = var28.spliterator();
    var26.enqueue((java.lang.Object)var28);
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(100);
    java.util.Spliterator var35 = var34.spliterator();
    var26.enqueue((java.lang.Object)var35);
    java.util.Iterator var37 = var26.iterator();
    var18.enqueue((java.lang.Object)var26);
    java.util.Iterator var39 = var26.iterator();
    boolean var40 = var26.isEmpty();
    java.lang.Object var41 = var26.dequeue();
    exercise01.RingBuffer.RingBufferIterator var42 = var26.new RingBufferIterator();
    java.lang.Object var43 = var42.next();
    boolean var44 = var42.hasNext();
    boolean var45 = var42.hasNext();
    boolean var46 = var42.hasNext();
    var1.enqueue((java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test60");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    int var7 = var3.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var3.new RingBufferIterator();
    java.util.Iterator var9 = var3.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test61");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test62");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    int var16 = var10.size();
    exercise01.RingBuffer.RingBufferIterator var17 = var10.new RingBufferIterator();
    int var18 = var10.size();
    var1.enqueue((java.lang.Object)var10);
    boolean var20 = var1.isEmpty();
    exercise01.RingBuffer var22 = new exercise01.RingBuffer(0);
    java.util.Spliterator var23 = var22.spliterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var22.new RingBufferIterator();
    java.util.Spliterator var25 = var22.spliterator();
    int var26 = var22.size();
    exercise01.RingBuffer.RingBufferIterator var27 = var22.new RingBufferIterator();
    boolean var28 = var22.isEmpty();
    java.util.Spliterator var29 = var22.spliterator();
    boolean var30 = var22.isEmpty();
    var1.enqueue((java.lang.Object)var30);
    exercise01.RingBuffer.RingBufferIterator var32 = var1.new RingBufferIterator();
    boolean var33 = var32.hasNext();
    boolean var34 = var32.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var32.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test63");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test64");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    java.lang.Object var14 = var6.dequeue();
    exercise01.RingBuffer.RingBufferIterator var15 = var6.new RingBufferIterator();
    java.util.Iterator var16 = var6.iterator();
    java.util.Iterator var17 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test65");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    java.util.Iterator var14 = var1.iterator();
    boolean var15 = var1.isEmpty();
    int var16 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test66");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test67");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Spliterator var8 = var5.spliterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var11 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var10.new RingBufferIterator();
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.util.Spliterator var15 = var10.spliterator();
    boolean var16 = var10.isEmpty();
    var5.enqueue((java.lang.Object)var10);
    boolean var18 = var10.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var19 = var10.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var19);
    java.util.Iterator var21 = var1.iterator();
    boolean var22 = var1.isEmpty();
    int var23 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test68");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test69");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var14 = var6.spliterator();
    int var15 = var6.size();
    java.util.Iterator var16 = var6.iterator();
    int var17 = var6.size();
    boolean var18 = var6.isEmpty();
    boolean var19 = var6.isEmpty();
    java.lang.Object var20 = var6.dequeue();
    exercise01.RingBuffer.RingBufferIterator var21 = var6.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test70");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    java.util.Iterator var22 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var13.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var25 = var1.isEmpty();
    java.util.Iterator var26 = var1.iterator();
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(0);
    int var29 = var28.size();
    int var30 = var28.size();
    int var31 = var28.size();
    java.util.Iterator var32 = var28.iterator();
    java.util.Spliterator var33 = var28.spliterator();
    java.util.Spliterator var34 = var28.spliterator();
    var1.enqueue((java.lang.Object)var28);
    exercise01.RingBuffer.RingBufferIterator var36 = var28.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var37 = var36.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test71");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var22 = var9.size();
    int var23 = var9.size();
    int var24 = var9.size();
    java.util.Spliterator var25 = var9.spliterator();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var28 = var27.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var27.new RingBufferIterator();
    java.util.Spliterator var30 = var27.spliterator();
    var9.enqueue((java.lang.Object)var27);
    java.util.Iterator var32 = var9.iterator();
    int var33 = var9.size();
    exercise01.RingBuffer var35 = new exercise01.RingBuffer(100);
    java.util.Iterator var36 = var35.iterator();
    java.util.Spliterator var37 = var35.spliterator();
    exercise01.RingBuffer var39 = new exercise01.RingBuffer(0);
    java.util.Spliterator var40 = var39.spliterator();
    int var41 = var39.size();
    java.util.Spliterator var42 = var39.spliterator();
    java.util.Iterator var43 = var39.iterator();
    var35.enqueue((java.lang.Object)var39);
    java.lang.Object var45 = var35.dequeue();
    boolean var46 = var35.isEmpty();
    java.util.Spliterator var47 = var35.spliterator();
    java.util.Iterator var48 = var35.iterator();
    java.util.Iterator var49 = var35.iterator();
    var9.enqueue((java.lang.Object)var35);
    java.util.Spliterator var51 = var35.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test72");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test73");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test74");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    int var12 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test75");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test76");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(10);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    boolean var14 = var9.isEmpty();
    java.util.Iterator var15 = var9.iterator();
    boolean var16 = var9.isEmpty();
    boolean var17 = var9.isEmpty();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(0);
    java.util.Iterator var20 = var19.iterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var19.new RingBufferIterator();
    int var22 = var19.size();
    int var23 = var19.size();
    exercise01.RingBuffer.RingBufferIterator var24 = var19.new RingBufferIterator();
    int var25 = var19.size();
    var9.enqueue((java.lang.Object)var19);
    java.lang.Object var27 = var9.dequeue();
    var1.enqueue(var27);
    exercise01.RingBuffer.RingBufferIterator var29 = var1.new RingBufferIterator();
    boolean var30 = var29.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test77");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test78");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var22 = var9.size();
    int var23 = var9.size();
    int var24 = var9.size();
    java.util.Spliterator var25 = var9.spliterator();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var28 = var27.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var27.new RingBufferIterator();
    java.util.Spliterator var30 = var27.spliterator();
    var9.enqueue((java.lang.Object)var27);
    exercise01.RingBuffer.RingBufferIterator var32 = var9.new RingBufferIterator();
    java.lang.Object var33 = var32.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test79");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    java.util.Spliterator var14 = var1.spliterator();
    
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test80");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(1);
    boolean var8 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    java.util.Spliterator var10 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test81");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    int var7 = var5.size();
    java.util.Spliterator var8 = var5.spliterator();
    java.util.Iterator var9 = var5.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    java.util.Spliterator var13 = var1.spliterator();
    boolean var14 = var1.isEmpty();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(10);
    int var17 = var16.size();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var16.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var16.new RingBufferIterator();
    int var22 = var16.size();
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var26 = new exercise01.RingBuffer(0);
    java.util.Spliterator var27 = var26.spliterator();
    exercise01.RingBuffer.RingBufferIterator var28 = var26.new RingBufferIterator();
    java.util.Spliterator var29 = var26.spliterator();
    var24.enqueue((java.lang.Object)var26);
    exercise01.RingBuffer var32 = new exercise01.RingBuffer(100);
    java.util.Spliterator var33 = var32.spliterator();
    var24.enqueue((java.lang.Object)var33);
    java.util.Iterator var35 = var24.iterator();
    var16.enqueue((java.lang.Object)var24);
    boolean var37 = var24.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var38 = var24.new RingBufferIterator();
    java.util.Iterator var39 = var24.iterator();
    int var40 = var24.size();
    exercise01.RingBuffer.RingBufferIterator var41 = var24.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var41);
    boolean var43 = var41.hasNext();
    java.lang.Object var44 = var41.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test82");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    boolean var9 = var8.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test83");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test84");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test85");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(10);
    int var12 = var11.size();
    java.util.Spliterator var13 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var11.new RingBufferIterator();
    int var15 = var11.size();
    var11.enqueue((java.lang.Object)10);
    int var18 = var11.size();
    java.util.Spliterator var19 = var11.spliterator();
    java.lang.Object var20 = var11.dequeue();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(0);
    java.util.Spliterator var24 = var23.spliterator();
    java.util.Spliterator var25 = var23.spliterator();
    java.util.Spliterator var26 = var23.spliterator();
    java.util.Spliterator var27 = var23.spliterator();
    int var28 = var23.size();
    java.util.Iterator var29 = var23.iterator();
    var11.enqueue((java.lang.Object)var23);
    exercise01.RingBuffer.RingBufferIterator var31 = var23.new RingBufferIterator();
    int var32 = var23.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10+ "'", var20.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test86");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    java.util.Spliterator var11 = var10.spliterator();
    boolean var12 = var10.isEmpty();
    int var13 = var10.size();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Spliterator var16 = var15.spliterator();
    int var17 = var15.size();
    var10.enqueue((java.lang.Object)var17);
    boolean var19 = var10.isEmpty();
    java.lang.Object var20 = var10.dequeue();
    java.util.Iterator var21 = var10.iterator();
    var1.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(10);
    int var25 = var24.size();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    exercise01.RingBuffer.RingBufferIterator var28 = var24.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var24.new RingBufferIterator();
    int var30 = var24.size();
    exercise01.RingBuffer var32 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(0);
    java.util.Spliterator var35 = var34.spliterator();
    exercise01.RingBuffer.RingBufferIterator var36 = var34.new RingBufferIterator();
    java.util.Spliterator var37 = var34.spliterator();
    var32.enqueue((java.lang.Object)var34);
    exercise01.RingBuffer var40 = new exercise01.RingBuffer(100);
    java.util.Spliterator var41 = var40.spliterator();
    var32.enqueue((java.lang.Object)var41);
    java.util.Iterator var43 = var32.iterator();
    var24.enqueue((java.lang.Object)var32);
    boolean var45 = var32.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var46 = var32.new RingBufferIterator();
    java.util.Iterator var47 = var32.iterator();
    int var48 = var32.size();
    exercise01.RingBuffer.RingBufferIterator var49 = var32.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 0+ "'", var20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test87");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test88");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test89");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test90");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test91");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var9.hasNext();
    boolean var11 = var9.hasNext();
    boolean var12 = var9.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test92");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Spliterator var12 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var13.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test93");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    int var7 = var5.size();
    java.util.Spliterator var8 = var5.spliterator();
    java.util.Iterator var9 = var5.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var11 = var1.dequeue();
    java.util.Spliterator var12 = var1.spliterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(10);
    int var15 = var14.size();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var14.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var14.new RingBufferIterator();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    int var22 = var21.size();
    java.util.Iterator var23 = var21.iterator();
    boolean var24 = var21.isEmpty();
    boolean var25 = var21.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var26 = var21.new RingBufferIterator();
    var14.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer.RingBufferIterator var28 = var21.new RingBufferIterator();
    java.util.Iterator var29 = var21.iterator();
    boolean var30 = var21.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var31 = var21.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var21);
    java.util.Spliterator var33 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test94");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    java.util.Iterator var6 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var4.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    boolean var9 = var7.hasNext();
    var1.enqueue((java.lang.Object)var7);
    boolean var11 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var1.isEmpty();
    java.util.Spliterator var14 = var1.spliterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(100);
    java.util.Spliterator var17 = var16.spliterator();
    boolean var18 = var16.isEmpty();
    int var19 = var16.size();
    exercise01.RingBuffer.RingBufferIterator var20 = var16.new RingBufferIterator();
    int var21 = var16.size();
    var1.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(10);
    int var25 = var24.size();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    java.util.Spliterator var28 = var24.spliterator();
    exercise01.RingBuffer var30 = new exercise01.RingBuffer(0);
    int var31 = var30.size();
    int var32 = var30.size();
    int var33 = var30.size();
    java.util.Iterator var34 = var30.iterator();
    var24.enqueue((java.lang.Object)var30);
    java.util.Spliterator var36 = var24.spliterator();
    exercise01.RingBuffer.RingBufferIterator var37 = var24.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var38 = var24.new RingBufferIterator();
    int var39 = var24.size();
    java.util.Spliterator var40 = var24.spliterator();
    exercise01.RingBuffer.RingBufferIterator var41 = var24.new RingBufferIterator();
    exercise01.RingBuffer var43 = new exercise01.RingBuffer(0);
    java.util.Spliterator var44 = var43.spliterator();
    int var45 = var43.size();
    java.util.Spliterator var46 = var43.spliterator();
    exercise01.RingBuffer.RingBufferIterator var47 = var43.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var48 = var43.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var49 = var43.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var50 = var43.new RingBufferIterator();
    java.util.Spliterator var51 = var43.spliterator();
    exercise01.RingBuffer.RingBufferIterator var52 = var43.new RingBufferIterator();
    java.util.Iterator var53 = var43.iterator();
    var24.enqueue((java.lang.Object)var43);
    java.util.Spliterator var55 = var43.spliterator();
    var1.enqueue((java.lang.Object)var43);
    java.util.Iterator var57 = var1.iterator();
    exercise01.RingBuffer var59 = new exercise01.RingBuffer(0);
    java.util.Iterator var60 = var59.iterator();
    exercise01.RingBuffer.RingBufferIterator var61 = var59.new RingBufferIterator();
    java.util.Iterator var62 = var59.iterator();
    java.util.Iterator var63 = var59.iterator();
    var1.enqueue((java.lang.Object)var59);
    java.lang.Object var65 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test95");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.util.Spliterator var10 = var1.spliterator();
    java.lang.Object var11 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test96");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    int var14 = var10.size();
    var10.enqueue((java.lang.Object)10);
    java.util.Iterator var17 = var10.iterator();
    int var18 = var10.size();
    exercise01.RingBuffer.RingBufferIterator var19 = var10.new RingBufferIterator();
    boolean var20 = var19.hasNext();
    java.lang.Object var21 = var19.next();
    var1.enqueue(var21);
    boolean var23 = var1.isEmpty();
    java.util.Spliterator var24 = var1.spliterator();
    java.util.Spliterator var25 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 10+ "'", var21.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test97");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    var1.enqueue((java.lang.Object)"hi!");
    java.lang.Object var11 = var1.dequeue();
    int var12 = var1.size();
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    int var15 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var16 = var1.new RingBufferIterator();
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test98");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    int var6 = var5.size();
    java.util.Iterator var7 = var5.iterator();
    boolean var8 = var5.isEmpty();
    boolean var9 = var5.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var5.new RingBufferIterator();
    int var11 = var5.size();
    java.util.Spliterator var12 = var5.spliterator();
    int var13 = var5.size();
    int var14 = var5.size();
    int var15 = var5.size();
    exercise01.RingBuffer.RingBufferIterator var16 = var5.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var16);
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(10);
    int var20 = var19.size();
    boolean var21 = var19.isEmpty();
    java.util.Iterator var22 = var19.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var19.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var19.new RingBufferIterator();
    var19.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var27 = var19.dequeue();
    java.util.Iterator var28 = var19.iterator();
    boolean var29 = var19.isEmpty();
    java.util.Spliterator var30 = var19.spliterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var19.new RingBufferIterator();
    java.util.Spliterator var32 = var19.spliterator();
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + (-1.0f)+ "'", var27.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test99");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var6.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.remove();
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
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test100");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    int var10 = var9.size();
    java.util.Iterator var11 = var9.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    boolean var13 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var14 = var9.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    var1.enqueue((java.lang.Object)var15);
    int var17 = var1.size();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(0);
    java.util.Iterator var20 = var19.iterator();
    int var21 = var19.size();
    int var22 = var19.size();
    java.util.Spliterator var23 = var19.spliterator();
    java.util.Iterator var24 = var19.iterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var19.new RingBufferIterator();
    java.util.Spliterator var26 = var19.spliterator();
    java.util.Iterator var27 = var19.iterator();
    var1.enqueue((java.lang.Object)var27);
    exercise01.RingBuffer var30 = new exercise01.RingBuffer(100);
    java.util.Iterator var31 = var30.iterator();
    java.util.Spliterator var32 = var30.spliterator();
    int var33 = var30.size();
    exercise01.RingBuffer var35 = new exercise01.RingBuffer(0);
    java.util.Spliterator var36 = var35.spliterator();
    exercise01.RingBuffer.RingBufferIterator var37 = var35.new RingBufferIterator();
    java.util.Spliterator var38 = var35.spliterator();
    int var39 = var35.size();
    int var40 = var35.size();
    boolean var41 = var35.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var42 = var35.new RingBufferIterator();
    var30.enqueue((java.lang.Object)var42);
    var1.enqueue((java.lang.Object)var42);
    int var45 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var46 = var1.new RingBufferIterator();
    int var47 = var1.size();
    exercise01.RingBuffer var49 = new exercise01.RingBuffer(10);
    int var50 = var49.size();
    java.util.Spliterator var51 = var49.spliterator();
    exercise01.RingBuffer.RingBufferIterator var52 = var49.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var53 = var49.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var54 = var49.new RingBufferIterator();
    boolean var55 = var49.isEmpty();
    boolean var56 = var49.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var57 = var49.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test101");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    int var12 = var1.size();
    java.lang.Object var13 = var1.dequeue();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test102");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var12 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test103");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(10);
    int var16 = var15.size();
    boolean var17 = var15.isEmpty();
    java.util.Iterator var18 = var15.iterator();
    java.util.Spliterator var19 = var15.spliterator();
    boolean var20 = var15.isEmpty();
    int var21 = var15.size();
    var6.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer.RingBufferIterator var23 = var6.new RingBufferIterator();
    int var24 = var6.size();
    java.util.Spliterator var25 = var6.spliterator();
    int var26 = var6.size();
    java.util.Spliterator var27 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var28 = var6.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test104");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var15.enqueue((java.lang.Object)var17);
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var24 = var10.dequeue();
    exercise01.RingBuffer.RingBufferIterator var25 = var10.new RingBufferIterator();
    java.util.Iterator var26 = var10.iterator();
    java.util.Iterator var27 = var10.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test105");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var11 = var10.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    java.util.Spliterator var17 = var16.spliterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var16.new RingBufferIterator();
    java.util.Spliterator var19 = var16.spliterator();
    int var20 = var16.size();
    int var21 = var16.size();
    boolean var22 = var16.isEmpty();
    boolean var23 = var16.isEmpty();
    boolean var24 = var16.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var25 = var16.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var25);
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(0);
    java.util.Spliterator var29 = var28.spliterator();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var1.enqueue((java.lang.Object)var31);
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(0);
    java.util.Spliterator var35 = var34.spliterator();
    java.util.Iterator var36 = var34.iterator();
    exercise01.RingBuffer.RingBufferIterator var37 = var34.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var39 = var37.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test106");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    int var13 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test107");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(10);
    int var4 = var3.size();
    java.util.Spliterator var5 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var3.new RingBufferIterator();
    int var7 = var3.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Iterator var10 = var9.iterator();
    int var11 = var9.size();
    int var12 = var9.size();
    java.util.Spliterator var13 = var9.spliterator();
    java.util.Spliterator var14 = var9.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var9.new RingBufferIterator();
    java.util.Spliterator var16 = var9.spliterator();
    var3.enqueue((java.lang.Object)var16);
    java.util.Iterator var18 = var3.iterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var3.new RingBufferIterator();
    java.util.Spliterator var20 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(10);
    int var24 = var23.size();
    java.util.Spliterator var25 = var23.spliterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var23.new RingBufferIterator();
    int var27 = var23.size();
    var23.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var23.dequeue();
    java.util.Spliterator var31 = var23.spliterator();
    java.util.Iterator var32 = var23.iterator();
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(10);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    java.util.Iterator var37 = var34.iterator();
    java.util.Spliterator var38 = var34.spliterator();
    var23.enqueue((java.lang.Object)var38);
    var3.enqueue((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test108");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test109");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Spliterator var9 = var7.spliterator();
    int var10 = var7.size();
    java.util.Spliterator var11 = var7.spliterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    int var14 = var7.size();
    exercise01.RingBuffer.RingBufferIterator var15 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var7.new RingBufferIterator();
    java.util.Iterator var17 = var7.iterator();
    java.util.Spliterator var18 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    int var20 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test110");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    java.util.Spliterator var12 = var1.spliterator();
    java.util.Spliterator var13 = var1.spliterator();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Spliterator var19 = var18.spliterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var18.new RingBufferIterator();
    java.util.Spliterator var21 = var18.spliterator();
    exercise01.RingBuffer.RingBufferIterator var22 = var18.new RingBufferIterator();
    var16.enqueue((java.lang.Object)var18);
    exercise01.RingBuffer var25 = new exercise01.RingBuffer(0);
    java.util.Iterator var26 = var25.iterator();
    int var27 = var25.size();
    int var28 = var25.size();
    java.util.Spliterator var29 = var25.spliterator();
    java.util.Iterator var30 = var25.iterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var25.new RingBufferIterator();
    java.util.Spliterator var32 = var25.spliterator();
    exercise01.RingBuffer.RingBufferIterator var33 = var25.new RingBufferIterator();
    java.util.Iterator var34 = var25.iterator();
    boolean var35 = var25.isEmpty();
    java.util.Iterator var36 = var25.iterator();
    var16.enqueue((java.lang.Object)var36);
    java.util.Spliterator var38 = var16.spliterator();
    exercise01.RingBuffer.RingBufferIterator var39 = var16.new RingBufferIterator();
    exercise01.RingBuffer var41 = new exercise01.RingBuffer(10);
    int var42 = var41.size();
    java.util.Spliterator var43 = var41.spliterator();
    exercise01.RingBuffer.RingBufferIterator var44 = var41.new RingBufferIterator();
    int var45 = var41.size();
    boolean var46 = var41.isEmpty();
    java.util.Iterator var47 = var41.iterator();
    int var48 = var41.size();
    java.util.Iterator var49 = var41.iterator();
    java.util.Spliterator var50 = var41.spliterator();
    var16.enqueue((java.lang.Object)var50);
    exercise01.RingBuffer var53 = new exercise01.RingBuffer(10);
    int var54 = var53.size();
    boolean var55 = var53.isEmpty();
    java.util.Iterator var56 = var53.iterator();
    exercise01.RingBuffer.RingBufferIterator var57 = var53.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var58 = var53.new RingBufferIterator();
    exercise01.RingBuffer var60 = new exercise01.RingBuffer(0);
    int var61 = var60.size();
    java.util.Iterator var62 = var60.iterator();
    boolean var63 = var60.isEmpty();
    boolean var64 = var60.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var65 = var60.new RingBufferIterator();
    var53.enqueue((java.lang.Object)var60);
    boolean var67 = var53.isEmpty();
    java.lang.Object var68 = var53.dequeue();
    exercise01.RingBuffer var70 = new exercise01.RingBuffer(10);
    int var71 = var70.size();
    java.util.Spliterator var72 = var70.spliterator();
    exercise01.RingBuffer.RingBufferIterator var73 = var70.new RingBufferIterator();
    boolean var74 = var70.isEmpty();
    exercise01.RingBuffer var76 = new exercise01.RingBuffer(0);
    int var77 = var76.size();
    java.util.Iterator var78 = var76.iterator();
    boolean var79 = var76.isEmpty();
    boolean var80 = var76.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var81 = var76.new RingBufferIterator();
    int var82 = var76.size();
    java.util.Spliterator var83 = var76.spliterator();
    var70.enqueue((java.lang.Object)var76);
    java.util.Spliterator var85 = var76.spliterator();
    int var86 = var76.size();
    exercise01.RingBuffer.RingBufferIterator var87 = var76.new RingBufferIterator();
    var53.enqueue((java.lang.Object)var76);
    var16.enqueue((java.lang.Object)var76);
    var1.enqueue((java.lang.Object)var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test111");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    java.util.Spliterator var13 = var1.spliterator();
    boolean var14 = var1.isEmpty();
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test112");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Iterator var12 = var11.iterator();
    int var13 = var11.size();
    int var14 = var11.size();
    java.util.Spliterator var15 = var11.spliterator();
    java.util.Iterator var16 = var11.iterator();
    int var17 = var11.size();
    java.util.Iterator var18 = var11.iterator();
    java.util.Spliterator var19 = var11.spliterator();
    int var20 = var11.size();
    int var21 = var11.size();
    var1.enqueue((java.lang.Object)var11);
    int var23 = var11.size();
    exercise01.RingBuffer.RingBufferIterator var24 = var11.new RingBufferIterator();
    boolean var25 = var24.hasNext();
    boolean var26 = var24.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test113");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    java.util.Iterator var6 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var4.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    boolean var9 = var7.hasNext();
    var1.enqueue((java.lang.Object)var7);
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    java.lang.Object var14 = var13.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test114");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test115");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var4.new RingBufferIterator();
    int var7 = var4.size();
    var1.enqueue((java.lang.Object)var4);
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test116");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    int var7 = var3.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var3.new RingBufferIterator();
    java.util.Iterator var9 = var3.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    java.lang.Object var13 = var1.dequeue();
    java.util.Iterator var14 = var1.iterator();
    boolean var15 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var16 = var1.new RingBufferIterator();
    boolean var17 = var16.hasNext();
    boolean var18 = var16.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test117");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Spliterator var13 = var10.spliterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    java.util.Iterator var16 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test118");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test119");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test120");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(0);
    java.util.Spliterator var13 = var12.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var12.new RingBufferIterator();
    java.util.Spliterator var15 = var12.spliterator();
    int var16 = var12.size();
    int var17 = var12.size();
    exercise01.RingBuffer.RingBufferIterator var18 = var12.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var1.iterator();
    int var21 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test121");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    boolean var23 = var9.isEmpty();
    java.util.Spliterator var24 = var9.spliterator();
    boolean var25 = var9.isEmpty();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(10);
    int var28 = var27.size();
    boolean var29 = var27.isEmpty();
    java.util.Iterator var30 = var27.iterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var27.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var32 = var27.new RingBufferIterator();
    int var33 = var27.size();
    exercise01.RingBuffer var35 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var37 = new exercise01.RingBuffer(0);
    java.util.Spliterator var38 = var37.spliterator();
    exercise01.RingBuffer.RingBufferIterator var39 = var37.new RingBufferIterator();
    java.util.Spliterator var40 = var37.spliterator();
    var35.enqueue((java.lang.Object)var37);
    exercise01.RingBuffer var43 = new exercise01.RingBuffer(100);
    java.util.Spliterator var44 = var43.spliterator();
    var35.enqueue((java.lang.Object)var44);
    java.util.Iterator var46 = var35.iterator();
    var27.enqueue((java.lang.Object)var35);
    java.util.Iterator var48 = var35.iterator();
    java.lang.Object var49 = var35.dequeue();
    exercise01.RingBuffer.RingBufferIterator var50 = var35.new RingBufferIterator();
    java.lang.Object var51 = var35.dequeue();
    var9.enqueue((java.lang.Object)var35);
    exercise01.RingBuffer.RingBufferIterator var53 = var35.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var53.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test122");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var9.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test123");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test124");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    java.util.Spliterator var9 = var6.spliterator();
    int var10 = var6.size();
    int var11 = var6.size();
    boolean var12 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var6.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var13);
    int var15 = var1.size();
    boolean var16 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    boolean var18 = var17.hasNext();
    boolean var19 = var17.hasNext();
    boolean var20 = var17.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test125");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Spliterator var10 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Spliterator var16 = var15.spliterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var15.new RingBufferIterator();
    java.util.Spliterator var18 = var15.spliterator();
    var13.enqueue((java.lang.Object)var15);
    java.lang.Object var20 = var13.dequeue();
    exercise01.RingBuffer.RingBufferIterator var21 = var13.new RingBufferIterator();
    int var22 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    boolean var24 = var1.isEmpty();
    java.util.Spliterator var25 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test126");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    boolean var7 = var4.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test127");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(10);
    int var12 = var11.size();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var11.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var11.new RingBufferIterator();
    int var17 = var11.size();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    java.util.Spliterator var22 = var21.spliterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var21.new RingBufferIterator();
    java.util.Spliterator var24 = var21.spliterator();
    var19.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(100);
    java.util.Spliterator var28 = var27.spliterator();
    var19.enqueue((java.lang.Object)var28);
    java.util.Iterator var30 = var19.iterator();
    var11.enqueue((java.lang.Object)var19);
    int var32 = var19.size();
    int var33 = var19.size();
    int var34 = var19.size();
    java.util.Spliterator var35 = var19.spliterator();
    exercise01.RingBuffer var37 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var38 = var37.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var39 = var37.new RingBufferIterator();
    java.util.Spliterator var40 = var37.spliterator();
    var19.enqueue((java.lang.Object)var37);
    java.lang.Object var42 = var19.dequeue();
    java.util.Iterator var43 = var19.iterator();
    java.lang.Object var44 = var19.dequeue();
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test128");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    java.util.Spliterator var15 = var13.spliterator();
    java.util.Spliterator var16 = var13.spliterator();
    java.util.Iterator var17 = var13.iterator();
    boolean var18 = var13.isEmpty();
    int var19 = var13.size();
    boolean var20 = var13.isEmpty();
    java.util.Iterator var21 = var13.iterator();
    java.util.Iterator var22 = var13.iterator();
    var1.enqueue((java.lang.Object)var22);
    java.lang.Object var24 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (-1.0f)+ "'", var11.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test129");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    java.util.Iterator var10 = var9.iterator();
    java.util.Spliterator var11 = var9.spliterator();
    java.util.Spliterator var12 = var9.spliterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(0);
    int var15 = var14.size();
    java.util.Iterator var16 = var14.iterator();
    var9.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer.RingBufferIterator var18 = var14.new RingBufferIterator();
    java.util.Spliterator var19 = var14.spliterator();
    var1.enqueue((java.lang.Object)var19);
    java.util.Spliterator var21 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var22 = var1.new RingBufferIterator();
    boolean var23 = var1.isEmpty();
    java.util.Iterator var24 = var1.iterator();
    boolean var25 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test130");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test131");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test132");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    int var10 = var9.size();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(0);
    java.util.Spliterator var13 = var12.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var12.new RingBufferIterator();
    java.util.Iterator var15 = var12.iterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var12.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var12.new RingBufferIterator();
    var9.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)var9);
    boolean var20 = var9.isEmpty();
    int var21 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test133");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Spliterator var9 = var1.spliterator();
    java.lang.Object var10 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0+ "'", var10.equals(0));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test134");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    java.util.Spliterator var12 = var8.spliterator();
    java.util.Iterator var13 = var8.iterator();
    boolean var14 = var8.isEmpty();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    int var17 = var16.size();
    java.util.Iterator var18 = var16.iterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var16.new RingBufferIterator();
    boolean var20 = var16.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var21 = var16.new RingBufferIterator();
    boolean var22 = var21.hasNext();
    var8.enqueue((java.lang.Object)var22);
    int var24 = var8.size();
    java.util.Spliterator var25 = var8.spliterator();
    var1.enqueue((java.lang.Object)var25);
    java.util.Spliterator var27 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var28 = var1.new RingBufferIterator();
    java.lang.Object var29 = var28.next();
    boolean var30 = var28.hasNext();
    boolean var31 = var28.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var28.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test135");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var10 = var1.spliterator();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    java.util.Spliterator var14 = var12.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var12.new RingBufferIterator();
    int var16 = var12.size();
    java.util.Spliterator var17 = var12.spliterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var12.new RingBufferIterator();
    boolean var19 = var12.isEmpty();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    java.util.Spliterator var22 = var21.spliterator();
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    java.util.Spliterator var25 = var21.spliterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var21.new RingBufferIterator();
    boolean var27 = var26.hasNext();
    boolean var28 = var26.hasNext();
    var12.enqueue((java.lang.Object)var26);
    java.lang.Object var30 = var12.dequeue();
    var1.enqueue(var30);
    java.lang.Object var32 = var1.dequeue();
    boolean var33 = var1.isEmpty();
    int var34 = var1.size();
    exercise01.RingBuffer var36 = new exercise01.RingBuffer(10);
    int var37 = var36.size();
    java.util.Spliterator var38 = var36.spliterator();
    exercise01.RingBuffer.RingBufferIterator var39 = var36.new RingBufferIterator();
    boolean var40 = var36.isEmpty();
    exercise01.RingBuffer var42 = new exercise01.RingBuffer(0);
    int var43 = var42.size();
    java.util.Iterator var44 = var42.iterator();
    boolean var45 = var42.isEmpty();
    boolean var46 = var42.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var47 = var42.new RingBufferIterator();
    int var48 = var42.size();
    java.util.Spliterator var49 = var42.spliterator();
    var36.enqueue((java.lang.Object)var42);
    exercise01.RingBuffer.RingBufferIterator var51 = var36.new RingBufferIterator();
    boolean var52 = var36.isEmpty();
    var1.enqueue((java.lang.Object)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test136");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    boolean var12 = var11.isEmpty();
    int var13 = var11.size();
    var1.enqueue((java.lang.Object)var13);
    boolean var15 = var1.isEmpty();
    java.util.Spliterator var16 = var1.spliterator();
    java.lang.Object var17 = var1.dequeue();
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
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 0+ "'", var17.equals(0));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test137");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    java.util.Spliterator var12 = var10.spliterator();
    java.util.Spliterator var13 = var10.spliterator();
    java.util.Spliterator var14 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    boolean var16 = var15.hasNext();
    boolean var17 = var15.hasNext();
    var1.enqueue((java.lang.Object)var15);
    boolean var19 = var1.isEmpty();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(10);
    int var22 = var21.size();
    java.util.Spliterator var23 = var21.spliterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var21.new RingBufferIterator();
    exercise01.RingBuffer var26 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(0);
    java.util.Spliterator var29 = var28.spliterator();
    exercise01.RingBuffer.RingBufferIterator var30 = var28.new RingBufferIterator();
    java.util.Spliterator var31 = var28.spliterator();
    var26.enqueue((java.lang.Object)var28);
    var21.enqueue((java.lang.Object)var26);
    exercise01.RingBuffer.RingBufferIterator var34 = var26.new RingBufferIterator();
    boolean var35 = var34.hasNext();
    var1.enqueue((java.lang.Object)var35);
    java.util.Iterator var37 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test138");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var9 = var1.dequeue();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(10);
    int var12 = var11.size();
    int var13 = var11.size();
    exercise01.RingBuffer.RingBufferIterator var14 = var11.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    boolean var16 = var14.hasNext();
    boolean var17 = var14.hasNext();
    var1.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(10);
    int var21 = var20.size();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var20.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var20.new RingBufferIterator();
    java.util.Iterator var26 = var20.iterator();
    int var27 = var20.size();
    boolean var28 = var20.isEmpty();
    boolean var29 = var20.isEmpty();
    int var30 = var20.size();
    boolean var31 = var20.isEmpty();
    int var32 = var20.size();
    java.util.Spliterator var33 = var20.spliterator();
    var1.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test139");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test140");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    int var8 = var6.size();
    int var9 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    var1.enqueue((java.lang.Object)var10);
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test141");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var4.new RingBufferIterator();
    int var7 = var4.size();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var11 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var10.new RingBufferIterator();
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.util.Spliterator var15 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var10.new RingBufferIterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var19 = var10.iterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var10.new RingBufferIterator();
    java.util.Iterator var22 = var10.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test142");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(10);
    int var5 = var4.size();
    java.util.Spliterator var6 = var4.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var4.new RingBufferIterator();
    int var8 = var4.size();
    java.util.Spliterator var9 = var4.spliterator();
    java.util.Spliterator var10 = var4.spliterator();
    java.util.Iterator var11 = var4.iterator();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    boolean var16 = var15.hasNext();
    boolean var17 = var15.hasNext();
    java.lang.Object var18 = var15.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test143");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    int var8 = var3.size();
    java.util.Spliterator var9 = var3.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test144");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    boolean var12 = var10.hasNext();
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var1.dequeue();
    boolean var15 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var16 = var1.new RingBufferIterator();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Spliterator var19 = var18.spliterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var18.new RingBufferIterator();
    java.util.Spliterator var21 = var18.spliterator();
    int var22 = var18.size();
    int var23 = var18.size();
    boolean var24 = var18.isEmpty();
    boolean var25 = var18.isEmpty();
    java.util.Iterator var26 = var18.iterator();
    exercise01.RingBuffer.RingBufferIterator var27 = var18.new RingBufferIterator();
    boolean var28 = var18.isEmpty();
    var1.enqueue((java.lang.Object)var18);
    java.util.Spliterator var30 = var1.spliterator();
    java.lang.Object var31 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test145");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
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
    assertTrue(var4 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test146");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var10 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    boolean var12 = var11.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test147");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    java.util.Iterator var23 = var9.iterator();
    exercise01.RingBuffer var25 = new exercise01.RingBuffer(10);
    int var26 = var25.size();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var25.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var30 = var25.new RingBufferIterator();
    exercise01.RingBuffer var32 = new exercise01.RingBuffer(0);
    int var33 = var32.size();
    java.util.Iterator var34 = var32.iterator();
    boolean var35 = var32.isEmpty();
    boolean var36 = var32.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var37 = var32.new RingBufferIterator();
    var25.enqueue((java.lang.Object)var32);
    exercise01.RingBuffer.RingBufferIterator var39 = var32.new RingBufferIterator();
    var9.enqueue((java.lang.Object)var32);
    int var41 = var9.size();
    exercise01.RingBuffer.RingBufferIterator var42 = var9.new RingBufferIterator();
    java.util.Spliterator var43 = var9.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test148");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var15.enqueue((java.lang.Object)var17);
    var10.enqueue((java.lang.Object)var15);
    java.util.Spliterator var23 = var15.spliterator();
    int var24 = var15.size();
    var1.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test149");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.lang.Object var10 = var9.next();
    boolean var11 = var9.hasNext();
    boolean var12 = var9.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0f)+ "'", var10.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test150");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Spliterator var13 = var10.spliterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var15 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var16 = var1.new RingBufferIterator();
    java.util.Spliterator var17 = var1.spliterator();
    java.util.Spliterator var18 = var1.spliterator();
    java.util.Iterator var19 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0f)+ "'", var15.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test151");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    java.lang.Object var23 = var9.dequeue();
    java.lang.Object var24 = var9.dequeue();
    int var25 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var9.dequeue();
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
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test152");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var6.new RingBufferIterator();
    int var14 = var6.size();
    java.util.Iterator var15 = var6.iterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var6.new RingBufferIterator();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(10);
    int var20 = var19.size();
    boolean var21 = var19.isEmpty();
    java.util.Iterator var22 = var19.iterator();
    boolean var23 = var19.isEmpty();
    boolean var24 = var19.isEmpty();
    java.util.Iterator var25 = var19.iterator();
    boolean var26 = var19.isEmpty();
    boolean var27 = var19.isEmpty();
    exercise01.RingBuffer var29 = new exercise01.RingBuffer(0);
    java.util.Iterator var30 = var29.iterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var29.new RingBufferIterator();
    int var32 = var29.size();
    int var33 = var29.size();
    exercise01.RingBuffer.RingBufferIterator var34 = var29.new RingBufferIterator();
    int var35 = var29.size();
    var19.enqueue((java.lang.Object)var29);
    int var37 = var29.size();
    int var38 = var29.size();
    java.util.Iterator var39 = var29.iterator();
    boolean var40 = var29.isEmpty();
    java.util.Iterator var41 = var29.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.enqueue((java.lang.Object)var41);
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
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test153");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    java.util.Spliterator var8 = var1.spliterator();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test154");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(byte)1);
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test155");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    boolean var9 = var6.isEmpty();
    boolean var10 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    var1.enqueue((java.lang.Object)var12);
    boolean var14 = var1.isEmpty();
    java.lang.Object var15 = var1.dequeue();
    java.util.Spliterator var16 = var1.spliterator();
    java.util.Iterator var17 = var1.iterator();
    java.util.Iterator var18 = var1.iterator();
    boolean var19 = var1.isEmpty();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    java.util.Spliterator var22 = var21.spliterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var21.new RingBufferIterator();
    java.util.Spliterator var24 = var21.spliterator();
    java.util.Spliterator var25 = var21.spliterator();
    java.util.Iterator var26 = var21.iterator();
    java.util.Iterator var27 = var21.iterator();
    exercise01.RingBuffer.RingBufferIterator var28 = var21.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var21.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var29);
    boolean var31 = var29.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0+ "'", var15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test156");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    java.util.Iterator var11 = var10.iterator();
    java.util.Spliterator var12 = var10.spliterator();
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.util.Spliterator var15 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var10.new RingBufferIterator();
    boolean var17 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var17);
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var22 = new exercise01.RingBuffer(0);
    java.util.Spliterator var23 = var22.spliterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var22.new RingBufferIterator();
    java.util.Spliterator var25 = var22.spliterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var22.new RingBufferIterator();
    var20.enqueue((java.lang.Object)var22);
    java.lang.Object var28 = var20.dequeue();
    exercise01.RingBuffer var30 = new exercise01.RingBuffer(0);
    java.util.Spliterator var31 = var30.spliterator();
    exercise01.RingBuffer.RingBufferIterator var32 = var30.new RingBufferIterator();
    java.util.Iterator var33 = var30.iterator();
    exercise01.RingBuffer.RingBufferIterator var34 = var30.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var35 = var30.new RingBufferIterator();
    var20.enqueue((java.lang.Object)var35);
    java.util.Spliterator var37 = var20.spliterator();
    var1.enqueue((java.lang.Object)var37);
    java.lang.Object var39 = var1.dequeue();
    java.util.Iterator var40 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + true+ "'", var39.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

}
