package edu.buet.cse.spring.sort.impl;

import org.springframework.stereotype.Component;

import edu.buet.cse.spring.sort.SortAlgorithm;

@Component
public class InsertionSortAlgorithm implements SortAlgorithm {

  @Override
  public void sort(int[] values) {
    final int n = values.length;

    for (int i = 1; i < n; i++) {
      int m = values[i];
      int j = i - 1;

      while (j >= 0 && values[j] > m) {
        values[j + 1] = values[j];
        j--;
      }

      values[j + 1] = m;
    }
  }
}
