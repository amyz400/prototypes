package main.java.sample;

    import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 */
public class ThreadSafeCounterSample {

  public static class Counter {

    private int count = 0;

    public synchronized int increment() {
      return ++count;
    }

    public int getCount() {
      return count;
    }

    public synchronized void resetCount() {
      count = 0;
    }

  }
}