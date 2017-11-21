package Testat21;

public class Box {
	private double w,h,d;
	public Box(double w,double h,double d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}
	public double getWidth() {
		return w;
	}
	public double getHeight() {
		return h;
	}
	public double getDepth() {
		return d;
	}
	public double getVolumeSize() {
		return w*h*d;
	}
	public double getAreaSize() {
		return (2*(w*h))+(2*(w*d))+(2*(h*d));
	}
	public double getEdgesLength() {
		return (4*w)+(4*h)+(4*d);
	}
	public boolean isCube() {
		boolean result = false;
		if (w==h&w==d) {
			result = true;
		}
		return result;
	}
	public int compareTo(Box f) {
		int result;
		if(this.getVolumeSize()<f.getVolumeSize()) {
			result = -1;
		}
		else if(this.getVolumeSize()>f.getVolumeSize()) {
			result = 1;
		}
		else result = 0;
		return result;
	}
	public boolean encloses(Box f) {
		boolean result = false;
		int a = this.compareTo(f);
		if (a > 0) {
			result = true;
		}
		return result;
		
	}
	public static void main(String[] args) {
		Box object = new Box(30,20,10);
		Box f = new Box(31,21,11);
		System.out.println(object.encloses(f));
		System.out.println(f.encloses(object));
		
		
	}

}
