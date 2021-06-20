package p1;

import java.util.StringTokenizer;



public class temptest {

	public static void main(String[] args) {
		String x = "8 dtobin";
		Evaluatro ob = Factory.getEvaluatro(3,x);
		try {
			//Date_Evaluator ob = new Date_Evaluator(x);
			ob.evaluate();
			System.out.println(ob);
			ob.displayHistory();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
}
