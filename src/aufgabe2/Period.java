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
		
		System.out.println(Period1);
		// 2:40
		System.out.println(Period2);
		// 1:30
		System.out.println(Period1.getMinutes());
		// 160
		System.out.println(Period1.getHours());
		// 2
		System.out.println(Period1.getMinorMinutes());
		// 40
		System.out.println(Period2.clone());
		// 1:30
		System.out.println(Period2.change(10));
		// 1:40
		System.out.println(Period2.change(30));
		// 2:00
		
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
			if((this.getMinorMinutes()+value)%60==0) {
				this.stunden+=1;
				this.minuten=0;
			}
			else this.minuten=(this.getMinorMinutes()+value)%60;
		}
		return this;
	}
	@Override
	
	public String toString() {
		return this.stunden+":"+this.minuten;
	}

}