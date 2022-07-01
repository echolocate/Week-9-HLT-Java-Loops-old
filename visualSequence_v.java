import java.util.ArrayList;

public class visualSequence_v {

	public static void main(String[] args) {

		ArrayList<String> star = new ArrayList<String>();
		int addStarRight = 3;
		int addStarLeft = 3;
		
		for (int rows = 1; rows <= 6; rows++) {
			
			for (int col = 1; col <= 9; col++) {
			star.add(" ");			
			System.out.print(star.get(col));			 
			}
			
			System.out.print("   " + addStarRight + " " + addStarLeft);
			System.out.println();
			//String rowStr = Integer.toString(rows);
			
//			star.set(addStarLeft, rowStr);
//			star.set(addStarRight, rowStr);
			
			if (addStarLeft == 0) {
				addStarLeft += 1;
				} else addStarLeft -= 1;
			if (addStarRight == 8) {
				addStarRight -= 1;
				} else addStarRight += 1;
			// addStarRight += 1;
		}
	}
}
