package strategy;

import java.util.List;

public class Context {
	   private ListConverter listConverter;

	   public Context(ListConverter listConverter){
	      this.listConverter = listConverter;
	   }

	   public String executeStrategy(List<String> list){
	      return listConverter.listToString(list);
	   }
	}