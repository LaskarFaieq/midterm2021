package algorithm;

import com.mongodb.client.MongoDatabase;
import databases.ConnectDB;

import java.util.List;
import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting. Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algorithm, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[100];

		storeRandomNumbers(num);

		ConnectDB connectDB = new ConnectDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;

		System.out.println("Total Execution Time of "+ num.length + " Numbers in Selection Sort take: " + selectionSortExecutionTime + " Milli sec");
        connectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		System.out.println("----------------------------------------------------------------------------------------------------");
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Insertion Sort take: " + insertionSortExecutionTime + " Milli Sec");

		//By following above, Continue for rest of the Sorting Algorithm....
		connectDB.insertDataFromArrayToMySql(num, "insertion_sort", "SortNumbers");
		System.out.println("Data showing from Database: ");
		List<String> numbersi = connectDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbersi);
		int ni = num.length;
		randomize(num, ni);
		System.out.println("-----------------------------------------------------------------------------------------------------");

		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Bubble Sort take: " + bubbleSortExecutionTime + " Milli Sec");

		connectDB.insertDataFromArrayToMySql(num, "bubble_sort", "SortingNumbers");
		System.out.println("Data showing from Database: ");
		List<String> numbersb = connectDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbersb);
		int nb = num.length;
		randomize(num, nb);
		System.out.println("--------------------------------------------------------------------------------------------------------");

		algo.mergeSort(num);
		long mergSortExecutionTime = algo.executionTime;
		System.out.println("Total Ececution Time of " + num.length + " Numbers in Merge Sort take: " + mergSortExecutionTime + "Milli Sec");

		connectDB.insertDataFromArrayToMySql(num, "merge_sort", "SortingNumbers");
		System.out.println("Data showing from Database ");
		List<String> numbersm = connectDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbersm);
		int nm = num.length;
		randomize(num, nm);
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + "Numbers in Quick Sort take; " + quickSortExecutionTime + "Milli Sec");

		connectDB.insertDataFromArrayToMySql(num, "quick_sort", "SortingNumbers");
		System.out.println("Data showing from Database: ");
		List<String> numbersq = connectDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbersq);
		int nq = num.length;
		randomize(num, nq);
		System.out.println("---------------------------------------------------------------------------------------------------------------");

		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Eceution Time of " + num.length + "Numbers in Heap Sort take: " + heapSortExecutionTime + "Milli Sec");

		connectDB.insertDataFromArrayToMySql(num, "heap_sort", "SortingNumbers");
		System.out.println("Data showing from database: ");
		List<String> numbersh = connectDB.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbersh);
		int nh = num.length;
		randomize(num, nh);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		algo.bucketSort(num);
		long bucketSortExecutionime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + "Numbers in Bucket Sort take: " + bucketSortExecutionime + "Milli Sec");

		connectDB.insertDataFromArrayToMySql(num, "shell_sort", "SortingNumbers");
		System.out.println("Data showing from Database ");
		List<String> numbersl = connectDB.readDataBase("shell_sort", "SortingNUmbers");
		printValue(numbersl);
		int nl = num.length;
		randomize(num, nl);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
