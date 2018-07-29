package edu.buet.cse.spring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.buet.cse.spring.search.BinarySearchBean;
import edu.buet.cse.spring.util.ArrayGenerator;

@SpringBootApplication
public class SpringBootIntroApplication {

  public static void main(String[] args) {
    ApplicationContext appContext = SpringApplication.run(SpringBootIntroApplication.class, args);
    BinarySearchBean binarySearchBean = appContext.getBean(BinarySearchBean.class);

    int[] values = ArrayGenerator.generateValues();
    int searchKey = values[0];
    int i = binarySearchBean.binarySearch(values, searchKey);

    System.out.printf("The value %d was found at location %d of the array %s%n", searchKey, i,
        Arrays.toString(values));

    System.out.printf("The class of the sort algorithm being used is %s%n",
        binarySearchBean.getSortAlgorithm().getClass().getCanonicalName());
  }
}
