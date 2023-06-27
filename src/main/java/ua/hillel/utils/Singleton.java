package ua.hillel.utils;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Singleton {
  private static Singleton instance;

  private Singleton(){}

  static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
