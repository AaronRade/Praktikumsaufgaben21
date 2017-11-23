package aufgabe2;

public class PointInTime {
	private int year, day, hour;
	
	public PointInTime(int year, int day, int hour) {
		if(year<10000&&year>999) {
			this.year=year;
		}
		if(day<357) {
			this.day=day;
		}
		if(hour<24&&hour>-1) {
			this.hour=hour;
		}
		
	}
	
	public String toString() {
		return this.year+"/"+this.day+"/"+this.hour;
	}
	
	public PointInTime clone() {
		PointInTime cloned=new PointInTime(this.year, this.day, this.hour);
		return cloned;
	}
	
	public PointInTime change(int value) {
		if(this.hour+value>23) {
			if(this.day+1>356) {
				this.year+=1;
			}
			else this.day+=1;
		}
		else this.hour+=value;
		return this;
	}

}
