package edu.buet.cse.spring.sort.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortAlgorithmTest {

  @Test
  public void testInsertionSort() {
    int[] values = ArrayGenerator.generateValues();
    InsertionSortAlgorithm bubbleSort = new InsertionSortAlgorithm();
    bubbleSort.sort(values);

    for (int i = 0; i < values.length - 1; i++) {
      assertTrue("values are not properly sorted", values[i] <= values[i + 1]);
    }
  }
}
