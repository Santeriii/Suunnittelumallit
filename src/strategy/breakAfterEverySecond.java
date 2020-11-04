package strategy;

import java.util.List;

public class breakAfterEverySecond implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		String listAsString = "";
		boolean brk = true;
		for (int i = 0; i < list.size(); i++) {
			if (brk) {
				listAsString += list.get(i) + "\n";
			} else {
				listAsString += list.get(i);
			}
			brk = !brk;
		}
		return listAsString;
	}

}
