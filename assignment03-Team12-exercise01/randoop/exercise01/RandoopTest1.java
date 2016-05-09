package exercise01;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


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
    java.lang.Throwable[] var69 = var31.getSuppressed();
    
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
    assertNotNull(var69);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


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
    boolean var19 = var1.isEmpty();
    java.util.Iterator var20 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var15.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Spliterator var7 = var1.spliterator();
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
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


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
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(10);
    boolean var15 = var14.isEmpty();
    exercise01.RingBufferException var17 = new exercise01.RingBufferException("hi!");
    java.lang.String var18 = var17.toString();
    java.lang.String var19 = var17.toString();
    var14.enqueue((java.lang.Object)var19);
    exercise01.RingBuffer var22 = new exercise01.RingBuffer(0);
    java.util.Spliterator var23 = var22.spliterator();
    java.util.Spliterator var24 = var22.spliterator();
    int var25 = var22.size();
    java.util.Spliterator var26 = var22.spliterator();
    int var27 = var22.size();
    java.util.Iterator var28 = var22.iterator();
    int var29 = var22.size();
    java.util.Spliterator var30 = var22.spliterator();
    var14.enqueue((java.lang.Object)var22);
    java.util.Spliterator var32 = var14.spliterator();
    var1.enqueue((java.lang.Object)var14);
    java.util.Spliterator var34 = var1.spliterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var18.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var19.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


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
    boolean var19 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var20 = var1.new RingBufferIterator();
    
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

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    
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

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


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
    int var20 = var1.size();
    boolean var21 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var22 = var1.new RingBufferIterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


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
    java.lang.String var65 = var23.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "exercise01.RingBufferException: "+ "'", var65.equals("exercise01.RingBufferException: "));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
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

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
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
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
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

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    java.lang.String var8 = var6.toString();
    var4.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var11 = var6.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("hi!");
    java.lang.String var14 = var13.toString();
    exercise01.RingBufferException var16 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    java.lang.String var20 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var13.addSuppressed((java.lang.Throwable)var18);
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var29 = var28.getSuppressed();
    java.lang.String var30 = var28.toString();
    var26.addSuppressed((java.lang.Throwable)var28);
    var24.addSuppressed((java.lang.Throwable)var26);
    var18.addSuppressed((java.lang.Throwable)var24);
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("hi!");
    java.lang.String var36 = var35.toString();
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var40 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var41 = var40.getSuppressed();
    java.lang.String var42 = var40.toString();
    var38.addSuppressed((java.lang.Throwable)var40);
    var35.addSuppressed((java.lang.Throwable)var40);
    var24.addSuppressed((java.lang.Throwable)var40);
    var6.addSuppressed((java.lang.Throwable)var40);
    java.lang.String var47 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var14.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var36.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "exercise01.RingBufferException: "+ "'", var42.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "exercise01.RingBufferException: "+ "'", var47.equals("exercise01.RingBufferException: "));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


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
    java.util.Iterator var32 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var33 = var1.new RingBufferIterator();
    
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

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


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
    java.lang.Throwable[] var27 = var5.getSuppressed();
    java.lang.String var28 = var5.toString();
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


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
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("hi!");
    java.lang.String var29 = var28.toString();
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var34 = var33.getSuppressed();
    java.lang.String var35 = var33.toString();
    var31.addSuppressed((java.lang.Throwable)var33);
    var28.addSuppressed((java.lang.Throwable)var33);
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("");
    var33.addSuppressed((java.lang.Throwable)var39);
    var12.addSuppressed((java.lang.Throwable)var39);
    
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
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var29.equals("exercise01.RingBufferException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "exercise01.RingBufferException: "+ "'", var35.equals("exercise01.RingBufferException: "));

  }

}
