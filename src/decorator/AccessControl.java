package decorator;

import java.util.ArrayList;
import java.util.Scanner;

public class AccessControl implements DataStructure {
	
	protected DataStructure ds;
	
	public AccessControl (DataStructure ds) {
		this.ds = ds;
	}
	
	@Override
	public String getDescription() {
		return ds.getDescription() + ", access control as an addition";
	}

	@Override
	public void checkAccess(Scanner reader) {
		System.out.println("Password:");
		String pw = reader.nextLine();
		while (true) {
			if (pw.equals("abc")) {
				break;
			}
			System.out.println("Password:");
			pw = reader.nextLine();
		}
	}

	@Override
	public void printArray() {
		ds.printArray();
	}
	
}
