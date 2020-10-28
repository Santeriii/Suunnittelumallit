package decorator;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDataStructure implements DataStructure {

	private ArrayList<String> data = new ArrayList<>();
	
	public void printArray() {
		data.add("Salaista");
		data.add("Tietoa");
		for (String s : data) {
			System.out.println(s);
		}
	}

	public void addToArray(String toBeAdded) {
		data.add(toBeAdded);
	}

	@Override
	public String getDescription() {
		return "Array as a data structure";
	}

	@Override
	public void checkAccess(Scanner reader) {
		System.out.println("Pass");
	}

}
