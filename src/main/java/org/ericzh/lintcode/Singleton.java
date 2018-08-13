package org.ericzh.lintcode;

public class Singleton {

  private Singleton() {
    // private constructor
  }

  // Inner class to provide instance of class
  private static class SingletonHolder {
    private static final Singleton INSTANCE = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

  public static void main(String ...args) {
//    try {
//      Class.forName("org.ericzh.lintcode.Singleton");
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//    }
    Singleton.getInstance();
    Singleton.getInstance();
  }
}
