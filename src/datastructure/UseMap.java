package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        /*
		* Demonstrate how to use Map that includes storing and retrieving elements.
		* Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		* Use For Each loop and while loop with Iterator to retrieve data.
		*
	    * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		*/
		Map<String, String> state = new HashMap<String, String>();
		state.put("NY", "New York");
		state.put("NJ", "New Jersey");
		state.put("PA", "Pennsylvania");

		System.out.println(state.get("NY"));

		for (Map.Entry entry:state.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		List<String> cityOfUSA = new ArrayList<>();
		cityOfUSA.add("NY");
		cityOfUSA.add("NJ");
		cityOfUSA.add("CA");



        //implementation here


        //connect to database


    }
}



