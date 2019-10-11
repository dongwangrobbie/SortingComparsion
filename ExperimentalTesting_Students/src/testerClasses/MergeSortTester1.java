package testerClasses;

import java.util.ArrayList;
import java.util.Map;

import strategiesClasses.MergeSort;

public class MergeSortTester1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = TestingUtils.generateListOfIntegers(200);
		
		TestingUtils.displayListElements("Original Data", data);
		
//		MergeSort<Integer> sorter = new MergeSort<>(new IntegerComparator1());
		MergeSort<Integer> sorter = new MergeSort<>(new IntegerComparator2());



		sorter.sortList(data);
		
		TestingUtils.displayListElements("Sorted", data);
	}

}
