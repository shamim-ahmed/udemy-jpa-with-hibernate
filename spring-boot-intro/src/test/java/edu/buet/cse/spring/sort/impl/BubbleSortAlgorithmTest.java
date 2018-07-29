package edu.buet.cse.spring.sort.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortAlgorithmTest {

  @Test
  public void testBubbleSort() {
    int[] values = ArrayGenerator.generateValues();
    BubbleSortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
    sortAlgorithm.sort(values);

    for (int i = 0; i < values.length - 1; i++) {
      assertTrue("values are not properly sorted", values[i] <= values[i + 1]);
    }
  }
}
