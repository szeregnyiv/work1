package hu.neuron.java.intern.runtimeanalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader implements Reader{

	public List getList(String myListName) {
		JSONParser parser = new JSONParser();
		List myList = new LinkedList();
		try {

			Object file = parser.parse(new FileReader("c:\\Users\\szeregnyiv\\work\\runtimeanalyzer\\file.json"));

			JSONObject jsonObject = (JSONObject) file;

			// loop array
			JSONArray jsonList = (JSONArray) jsonObject.get(myListName);
			Iterator<String> iterator = jsonList.iterator();
			while (iterator.hasNext()) {
				myList.add(iterator.next());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return myList;
	}


	public String elementSize() {
		JSONParser parser = new JSONParser();
		String size="";
		try {
			Object file = parser.parse(new FileReader("c:\\Users\\szeregnyiv\\work\\runtimeanalyzer\\file.json"));
			JSONObject jsonObject = (JSONObject) file;
			size = jsonObject.get("size").toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return size;
	}


}
