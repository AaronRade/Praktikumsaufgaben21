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

}
