
package lineLength;
import java.lang.Math;

public class LineLength {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		lengthCalculate();
		//lengthEqual();
	}

	public static void lengthCalculate() {
	
	
	double x1 = 1, x2=3 , y1 = 10, y2 = 20;
	
	double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	
	System.out.println("THe length of line is = " + distance);
}
	
	
	public static void lengthEqual() {
		
		double x11 = 1, x12=3 , y11 = 10, y12 = 20;
		double x21 = 1, x22=3 , y21 = 10, y22 = 20;
		
		double distance1=Math.sqrt((x12-x11)*(x12-x11) + (y12-y11)*(y12-y11));
		double distance2=Math.sqrt((x22-x21)*(x22-x21) + (y22-y21)*(y22-y21));
		
		if(distance1 == distance2) {
			System.out.println("Lines are equal");
			
		} else if(distance1 > distance2) {
			System.out.println("Line-1 is greater than Line- 2");
			
		}else if(distance1 < distance2) {
			
			System.out.println("Line-1 is less than Line- 2");
		}
		
	}
	


}



