package aufgabe2;

public class PointInTime {
	private int year, day, hour = 0;
	
	public PointInTime(int year, int day, int hour) {
		if(year>999&&year<10000) {
			this.year=year;
		}
		if(day>0&&day<356) {
			this.day=day;
		}
		if(hour>-1&&hour<24) {
			this.hour=hour;
		}
		
	}

	public int getYear(){return year;}
	public int getDay(){return day;}
	public int getHour(){return hour;}
	
	public String toString() {
		return this.year+"/"+this.day+"/"+this.hour;
	}
	
	public PointInTime clone() {
		return new PointInTime(this.year, this.day, this.hour);
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
