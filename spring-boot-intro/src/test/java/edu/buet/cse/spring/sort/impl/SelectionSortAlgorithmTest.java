package edu.buet.cse.spring.sort.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortAlgorithmTest {

  @Test
  public void testInsertionSort() {
    int[] values = ArrayGenerator.generateValues();
    SelectionSortAlgorithm bubbleSort = new SelectionSortAlgorithm();
    bubbleSort.sort(values);

    for (int i = 0; i < values.length - 1; i++) {
      assertTrue("values are not properly sorted", values[i] <= values[i + 1]);
    }
  }
}
