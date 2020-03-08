/**
 * 
 */
package displayMe;

import java.util.Arrays;

/**
 * @author Bona
 *
 */
public class MainProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Display Me");
		
		int[][] inputTrue = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		System.out.println(checkStraightLine(inputTrue));
		
		int[][] inputFalse = {{1,1},{2,2},{3,4},{4,5},{5,6},{6,7}};
		System.out.println(checkStraightLine(inputFalse));

	}

	/*
	 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
	 * represents the coordinate of a point. Check if these points make a
	 * straight line in the XY plane.
	 * 
	 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]] Output: true
	 * 
	 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]] Output: false
	 * 
	 * 2 <= coordinates.length <= 1000 
	 * coordinates[i].length == 2 
	 * -10^4 <=coordinates[i][0], coordinates[i][1] <= 10^4 
	 * coordinates contains no duplicate point.
	 */

	public static boolean checkStraightLine(int[][] coordinates) {
		boolean retValue = true;
		int[] pointA = coordinates[0];
		int[] pointB = coordinates[1];
		double slope = ((double)pointA[0] - (double)pointB[0]) / ((double)pointA[1] - (double)pointB[1]);
		System.out.println(slope);
		for(int ctr = 2; ctr < coordinates.length; ctr++) {
			int[] point = coordinates[ctr];
			System.out.println(Arrays.toString(point));
			double chkSlope = ((double)pointA[0] - (double)point[0]) / ((double)pointA[1] - (double)point[1]);
			System.out.println(chkSlope);
			if(slope != chkSlope){
				retValue = false;
				break;
			}
		}
		return retValue;
	}

}
