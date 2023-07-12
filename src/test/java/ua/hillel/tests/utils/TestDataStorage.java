package ua.hillel.tests.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class TestDataStorage {
  private static Map<String, Object> testData = new HashMap<>();

  public static void saveTestData(String name, Object value) {
    testData.put(name, value);
  }

  public static Object getTestData(String name) {
    return testData.get(name);
  }
}
