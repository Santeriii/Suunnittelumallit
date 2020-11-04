package strategy;

import java.util.HashMap;
import java.util.List;

public class breakAfterEveryThird implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		HashMap<Integer, String> listToArray = new HashMap<Integer, String>();
		
		for (int i = 1; i <= list.size(); i++) {
			listToArray.put(i, list.get(i - 1));
		}
		
		String listAsString = "";

		for (int i = 1; i <= listToArray.size(); i++) {
			if (i % 3 == 0) {
				listAsString += listToArray.get(i) + "\n";
			} else {
				listAsString += listToArray.get(i);
			}
		}
		
		return listAsString;
	}

}
