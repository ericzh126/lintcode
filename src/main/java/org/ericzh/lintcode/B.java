package org.ericzh.lintcode;

public class B extends A {

  B() {
    System.out.println("constructor B");
  }

  static {
    System.out.println("static block B");
  }

  {
    System.out.println("non static block B");
  }


  public static void main(String[] args) {
    B t1 = new B();
    System.out.println("Main method");
    B t2 = new B();
  }
}

class A {
  {
    System.out.println("non static block A");
  }

  static {
    System.out.println("static block A");
  }

  A() {
    System.out.println("constructor A");
  }
}