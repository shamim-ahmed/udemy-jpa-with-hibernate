package edu.buet.cse.spring.sort.impl;

import java.util.Random;

public class ArrayGenerator {
  public static final int MAX = 1000;
  public static final int SIZE = MAX / 10;

  public static int[] generateValues() {
    Random randomGenerator = new Random();
    int[] values = new int[SIZE];

    for (int i = 0; i < values.length; i++) {
      values[i] = randomGenerator.nextInt(MAX) + 1;
    }

    return values;
  }

  private ArrayGenerator() {}
}
