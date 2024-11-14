/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 11/13/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Luke Adjei
*/

public class Plot {
	private int x;
	private int y;
	private int depth;
	private int width;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.depth = 1;
		this.width = 1;
	}
	
	public Plot(int x, int y, int depth, int width) {
		this.x = x;
		this.y = y;
		this.depth = depth;
		this.width = width;
	}
	
	public Plot(Plot otherPlot) {
		this.x = otherPlot.getX();
		this.y = otherPlot.getY();
		this.depth = otherPlot.getDepth();
		this.width = otherPlot.getWidth();
	}
	
	
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public int getDepth() {
		return this.depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public boolean overlaps(Plot plot) {
		boolean depthCheck = false;
		boolean widthCheck = false;

		int tempWidth = this.x + this.width;
		int tempDepth = this.y + this.depth;
		
		if (plot.getWidth()+ plot.getX() == this.x && plot.getDepth() + plot.getY() == this.y) {
			return false;
		}
		//x axis check
		for(int tempX = this.x; tempX < tempWidth; tempX++) {
			if (plot.getX() == tempX) {
				widthCheck = true;
			}
		}
		
		//y axis check
		for(int tempY = this.y; tempY < tempDepth; tempY++) {
			if (plot.getY() == tempY) {
				depthCheck = true;
			}
		}
		

		if (depthCheck && widthCheck == true) {
			return true;
		}

		return false;
		
		
	}
	
	public boolean encompasses(Plot plot) {
		if(plot.getX() >= this.x && plot.getY() >= this.y && plot.getX() + plot.getWidth() <= this.x + this.width && plot.getY() + plot.getDepth() <= this.y + this.getDepth()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return this.x+","+this.y+","+this.depth+","+this.width;
	}
	
	@Override
	public boolean equals(Object obj) {
		Plot temp = (Plot)obj;
		
		
		if (this.x == temp.getX() && this.y == temp.getY() && this.depth == temp.getDepth() && this.width == temp.getWidth()) {
			return true;
		}
		return false;
		
	}
	
	
}
