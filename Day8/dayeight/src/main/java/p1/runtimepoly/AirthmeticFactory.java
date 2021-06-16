package p1.runtimepoly;

public class AirthmeticFactory {
	//Need to Change the object creation logic below
	static Airthmetic ob[];
     static {
	ob= new Airthmetic[5];
	ob[0] = new Add();
	ob[1] = new sub();
	ob[2] = new Mul();
	ob[3] = new Div();
	ob[4] = new Percent();
	}
	
	public static Airthmetic getFactory(int n) {
		return ob[n];
	}

}
