package datastructure;

import databases.ConnectDB;
import org.bson.types.BSONTimestamp;

import java.util.*;


public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> ar = new ArrayList<>();

		ar.add(2200);
		ar.add(2005);
		ar.add(3070);
		ar.add(2576);
		ar.add(9012);
		ar.add(2348);
		ar.add(9081);
		ar.add(1200);


        //Array List Printed
		System.out.println("Retrieving elements from ArrayList: " + ar);

		//First Element Peek Using Get
		System.out.println("Arrays peek element: " + ar.get(0));

		//Remove Element from Array List
		System.out.println("Remove elemnt at index 3:" + ar.remove(3));

		//Retrieving Elements from Array List
		System.out.println("Re-retrieving elements from ArrayList: " + ar);

		//Retrieving Data using for each Loop
		System.out.println("Re-retieving elements from ArrayList: ");
		for (Integer in : ar ){
			System.out.println(" " + in);
		}
		System.out.println();

		//Retrieving DAta using Iterator
		System.out.println("Re-retrieving elements from ArrayList: ");
		Iterator it = ar.iterator();
		while (it.hasNext()){
			Integer i = (Integer) it.next();
			System.out.println(" " + i);
		}
		System.out.println();

		Collections.sort(ar);
		System.out.println(ar);
		List list = new ArrayList();
		list = ar;

		//connect to db
		ConnectDB ct = new ConnectDB();
		//ct.insertDataFromArrayToMySql(list, "ArrayList", "ArrayData");

		List<String> numbers = ct.readDataBase("ArrayList", "ArrayData");
		for (String st : numbers){
			System.out.println(st);
		}




	}

}
