package edu.buet.cse.spring.sort.impl;

import edu.buet.cse.spring.sort.SortAlgorithm;

public class InsertionSortAlgorithm implements SortAlgorithm {

  @Override
  public void sort(int[] values) {
    final int n = values.length;

    for (int i = n - 1; i > 0; i--) {
      int max = 0;

      for (int j = 1; j <= i; j++) {
        if (values[j] > values[max]) {
          max = j;
        }
      }

      swap(values, i, max);
    }
  }

  private void swap(int[] values, int i, int j) {
    if (values[i] == values[j]) {
      return;
    }

    int temp = values[i];
    values[i] = values[j];
    values[j] = temp;
  }
}
