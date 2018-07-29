package edu.buet.cse.spring.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.buet.cse.spring.sort.SortAlgorithm;

@Component
public class BinarySearchBean {
  @Autowired
  private SortAlgorithm sortAlgorithm;

  public SortAlgorithm getSortAlgorithm() {
    return sortAlgorithm;
  }

  public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
  }

  public int binarySearch(int[] values, int m) {
    sortAlgorithm.sort(values);
    int start = 0;
    int end = values.length - 1;
    int result = -1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (m == values[mid]) {
        result = mid;
        break;
      }

      if (m > values[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }      
    }

    return result;
  }
}
