package bean;

public class History {
	
	private String dates,expre,result,type;

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	public String getExpre() {
		return expre;
	}

	public void setExpre(String expre) {
		this.expre = expre;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public History(String dates, String expre, String result, String type) {
		super();
		this.dates = dates;
		this.expre = expre;
		this.result = result;
		this.type = type;
	}
	
	public History() {
		super();
		this.dates = "";
		this.expre = "";
		this.result = "";
		this.type = "";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dates +" ... " +expre +" ... " +result+" ... " +type;
	}

}
