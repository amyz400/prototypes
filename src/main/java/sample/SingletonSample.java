package main.java.sample;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

/**
 TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 */
public class SingletonSample {

  public static class Singleton {

    private static Singleton instance = null;

    private Singleton() {  }

    public static Singleton getInstance() {
      if (instance == null) {
        instance = new Singleton();
      }
      return instance;
    }

    public void doSomething() {
      System.out.println("Doing something....");
    }
  }

  public static void main(String a[]){
    Singleton st = Singleton.getInstance();
    st.doSomething();
  }
}
