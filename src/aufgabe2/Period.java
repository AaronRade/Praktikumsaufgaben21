package aufgabe2;

public class Period {
	private int stunden, minuten;
	
	public Period(int minuten) {
		if (minuten<0) {
			minuten=0;
		}
		this.stunden=0;
		this.minuten=minuten;
	}
	
	public Period(int stunden, int minuten) {
		if (minuten<0) {
			minuten=0;
		}
		this.stunden=stunden;
		this.minuten=minuten;
		
	}
	
	public static void main(String []Args) {
		Period Period1 = new Period(2, 40);
		Period Period2 = new Period(1, 30);
		
		//expected results commented
		
		System.out.println("Period1: "+Period1);
		// 2:40
		System.out.println("Period2: "+Period2);
		// 1:30
		System.out.println("Period1 Minuten insgesamt: "+Period1.getMinutes());
		// 160
		System.out.println("Period1 Stunden: "+Period1.getHours());
		// 2
		System.out.println("Period1 Minuten: "+Period1.getMinorMinutes());
		// 40
		System.out.println("Period2 cloned: "+Period2.clone());
		// 1:30
		System.out.println("Period2 change mit 10: "+Period2.change(10));
		// 1:40
		System.out.println("Period1 change mit 70: "+Period1.change(70));
		// 3:50
		
	}
	
	public int getMinutes() {
		return this.stunden*60+this.minuten;
	}
	
	public int getHours() {
		if (this.stunden==0) {
			return this.minuten/60;
		}
		else return this.stunden;
	}
	
	public int getMinorMinutes() {
		return this.minuten;
	}
	
	public Period clone(){
		Period cloned = new Period(this.getHours(),this.getMinorMinutes());
		return cloned;
	}
	
	public Period change(int value) {
		if(value>0) {
			this.stunden+=(this.getMinorMinutes()+value)/60;
			value = value%60;
			this.minuten+=value;
		}
		return this;
	}
	
	public String toString() {
		return this.stunden+":"+this.minuten;
	}

}