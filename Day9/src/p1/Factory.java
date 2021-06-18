package p1;

import p1.exceptions.ConversionOp;

public class Factory {
	
	public static Evaluatro getEvaluatro(int ch,String x) {
		
		if(x.contains(":")) {
			return new Date_Evaluator(x);
		}
		else {
			try{
				ConversionOp.valueOf(x.split(" ")[1]);
				return new Conversion_Evaluatro(x);
				}
		catch(Exception e) {
			return new Expression_Evaluator(x);
			}
	}
	}}


