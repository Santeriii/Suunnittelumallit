package decorator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DataStructure ds = new AccessControl(new SimpleDataStructure());
		Scanner reader = new Scanner(System.in);
		
		ds.checkAccess(reader);
		ds.printArray();
	}
}