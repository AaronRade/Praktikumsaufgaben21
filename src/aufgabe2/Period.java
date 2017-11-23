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
		return this.getMinutes()-getHours()*60;
	}

	@Override
	public Period clone(){
		return new Period(this.getHours(), this.getMinorMinutes());
	}
	
	public Period change(int value) {
		if(value>0) {
			this.stunden+=(this.getMinorMinutes()+value)/60;
			value = value%60;
			this.minuten+=value;
		}
		return this;
	}

	@Override
	public String toString() {
		return this.stunden+":"+this.minuten;
	}

}