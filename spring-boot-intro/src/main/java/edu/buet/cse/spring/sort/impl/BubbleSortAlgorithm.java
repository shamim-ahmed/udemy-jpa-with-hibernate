package edu.buet.cse.spring.sort.impl;

import org.springframework.stereotype.Component;

import edu.buet.cse.spring.sort.SortAlgorithm;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

  @Override
  public void sort(int[] values) {
    final int n = values.length;

    for (int i = n - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (values[j] > values[j + 1]) {
          int temp = values[j];
          values[j] = values[j + 1];
          values[j + 1] = temp;
        }
      }
    }
  }
}
