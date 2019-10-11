package testerClasses;

import java.util.ArrayList;
import java.util.Map;

import strategiesClasses.BubbleSort;
import strategiesClasses.HeapSort;
import strategiesClasses.QuickSort;
import strategiesClasses.SelectionSort;
import strategiesClasses.SequentialFD;

public class QuickSortTester1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = TestingUtils.generateListOfIntegers(20);
		
		TestingUtils.displayListElements("Original Data", data);
		
		QuickSort<Integer> sorter = new QuickSort<>(new IntegerComparator1());
//		QuickSort<Integer> sorter = new QuickSort<>(new IntegerComparator2());


		sorter.sortList(data);
		
		TestingUtils.displayListElements("Sorted", data);
	}
}
