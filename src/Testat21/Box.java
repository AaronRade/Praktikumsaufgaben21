package Testat21;

public class Box {
	private double width, height, depth;

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}

	public double getVolumeSize() {
		return width * height * depth;
	}

	public double getAreaSize() {
		return (2*(width * height))+(2*(width * depth))+(2*(height * depth));
	}

	public double getEdgesLength() {
		return (4* width)+(4* height)+(4* depth);
	}

	public boolean isCube() {
		return (width == height & width == depth);
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
