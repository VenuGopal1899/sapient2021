package p1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import bean.History;

public abstract class Evaluatro {
	List<History> ob;
	public Evaluatro() {
		ob = new  ArrayList<>();
	}
	
	public abstract void evaluate() throws Exception;
	
	public void addHistory(String x, String result, String type) {
	
		String x1 = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date());
		
		ob.add(new History(x1,x,result,type));
	}
	
	public void displayHistory() {
		
		ob.forEach(System.out::println);
	}
	
	public void sortHistory() {
		Collections.sort(ob, (History p1, History p2) -> p1.getDates().compareTo(p2.getDates())) ;
	}
	
	public long Counttype(String type1) {
		
		long l1 =  ob.stream().filter((Evaluatro::check1)).count();
	
		return ob.stream().filter(p ->(p.getType().equals(type1))).count();
	}
	
	public static boolean check1(History p) {
		
		return true;
	}
	
	
	public int[] countOperator() {
		
		int count[]= {0,0,0,0,0};
		 String op[]= {"+","-","*","/","%"};
		 List<History> even = ob.stream()
                 .filter(number -> number.getType().equals("Airth"))
                 .collect(Collectors.toList());

		 even.forEach(action ->{
		 for(int i = 0;i<op.length;i++) {
			 
			 count[i] += (action.getExpre().split(op[i]).length -1);
		 }
		 });
		
		return count;
	}
}
