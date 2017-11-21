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
    
	public boolean encloses(Box b) {
		boolean result = false;
        double max1, min1, mid1, max2, mid2, min2;
            
        if (this.getWidth() >= this.getHeight() && this.getWidth() >= this.getDepth()) {
            max1 = this.getWidth();
            if (this.getHeight() >= this.getDepth()) {
                mid1 = this.getHeight();
                min1 = this.getDepth();
            }
            else {
                mid1 = this.getDepth();
                min1 = this.getHeight();
            }
        }
        else {
            if (this.getHeight() >= this.getDepth() && this.getHeight() >= this.getWidth()) {
                max1 = this.getHeight();  
                if (this.getWidth() >= this.getDepth()) {
                    mid1 = this.getWidth();
                    min1 = this.getDepth();
                }
                else {
                    mid1 = this.getDepth();
                    min1 = this.getWidth();                 
                }
            }
            else {
                max1 = this.getDepth();
                if (this.getWidth() >= this.getHeight()) {
                    mid1 = this.getWidth();
                    min1 = this.getHeight();
                }
                else {
                    mid1 = this.getHeight();
                    min1 = this.getWidth();
                }
            }
        }
        
        if (b.getWidth() >= b.getHeight() && b.getWidth() >= b.getDepth()) {
            max2 = b.getWidth();
            if (b.getHeight() >= b.getDepth()) {
                mid2 = b.getHeight();
                min2 = b.getDepth();
            }
            else {
                mid2 = b.getDepth();
                min2 = b.getHeight();
            }
        }
        else {
            if (b.getHeight() >= b.getDepth() && b.getHeight() >= b.getWidth()) {
                max2 = b.getHeight();  
                if (b.getWidth() >= b.getDepth()) {
                    mid2 = b.getWidth();
                    min2 = b.getDepth();
                }
                else {
                    mid2 = b.getDepth();
                    min2 = b.getWidth();                 
                }
            }
            else {
                max2 = b.getDepth();
                if (b.getWidth() >= b.getHeight()) {
                    mid2 = b.getWidth();
                    min2 = b.getHeight();
                }
                else {
                    mid2 = b.getHeight();
                    min2 = b.getWidth();
                }
            }
        }
        if (max1 > max2) {
        	if(mid1>mid2) {
        		if(min1>min2) {
        			result = true;
        		}
        	}
        }
        return result;
	}

    @Override
    public String toString() {
        return "Height: " + this.getHeight() + "\tWidth: " + this.getWidth() + "\tDepth: " + this.getDepth();
    }

    public static void main(String[] args) {

		Box object = new Box(30,20,10);
		Box f = new Box(31,21,11);
		System.out.println(object.encloses(f));
		System.out.println(f.encloses(object));
		
		
	}

}
