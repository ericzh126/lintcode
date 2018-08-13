package org.ericzh.lintcode;

public class Singleton2
{
  // accessed by only by getInstance() method
  private static Singleton2 instance;

  private Singleton2()
  {
    // private constructor
  }

  public static Singleton2 getInstance()
  {
    if (instance == null)
    {
      //synchronized block to remove overhead
      synchronized (Singleton2.class)
      {
        if(instance==null)
        {
          // if instance is null, initialize
          instance = new Singleton2();
        }

      }
    }
    return instance;
  }
}
