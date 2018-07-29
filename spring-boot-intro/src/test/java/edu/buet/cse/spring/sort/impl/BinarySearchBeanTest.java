package edu.buet.cse.spring.sort.impl;

import org.junit.Test;

import edu.buet.cse.spring.search.BinarySearchBean;
import edu.buet.cse.spring.util.ArrayGenerator;

import static org.junit.Assert.*;

import java.util.Arrays;

public class BinarySearchBeanTest {
  @Test
  public void testBinarySearchWithFixedArray() {
    int[] values = {8, 19, 39, 52, 69, 79, 21, 37, 87, 93};
    BinarySearchBean searchBean = new BinarySearchBean();
    searchBean.setSortAlgorithm(new InsertionSortAlgorithm());

    int searchKey = 69;
    int result = searchBean.binarySearch(values, searchKey);
    assertTrue("binary search is not working as expected", result == 6);
  }

  @Test
  public void testBinarySearchWithRandomArray() {
    int[] values = ArrayGenerator.generateValues();
    int[] copyOfValues = Arrays.copyOf(values, values.length);
    int searchKey = values[0];

    BinarySearchBean searchBean = new BinarySearchBean();
    searchBean.setSortAlgorithm(new InsertionSortAlgorithm());
    int result1 = searchBean.binarySearch(values, searchKey);

    Arrays.sort(copyOfValues);
    int result2 = Arrays.binarySearch(copyOfValues, searchKey);
    
    assertEquals("binary search is not working as expected", result1, result2);
  }
}
