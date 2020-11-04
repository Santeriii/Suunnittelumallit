package strategy;

import java.util.Iterator;
import java.util.List;

public class breakAfterEvery implements ListConverter {
	
	@Override
	public String listToString(List<String> list) {
		Iterator<String> it = list.iterator();
		String listAsString = "";
		while (it.hasNext()) {
			listAsString += it.next() + "\n";
		}
		return listAsString;
	}

}
