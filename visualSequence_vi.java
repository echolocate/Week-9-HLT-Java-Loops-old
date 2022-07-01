import java.util.ArrayList;

public class visualSequence_vi {

	public static void main(String[] args) {

		ArrayList<String> star = new ArrayList<String>();
		int addStarRight = 4;
		int addStarLeft = 4;
		
		for (int rows = 0; rows <= 5; rows++) {
			
			for (int col = 0; col <= 8; col++) {
			star.add(" ");			
			System.out.print(star.get(col));			 
			}
			
			//System.out.print("   " + addStarRight + " " + addStarLeft);
			System.out.println();
			String rowStr = Integer.toString(rows+1);
			
			star.set(addStarLeft, rowStr);
			star.set(addStarRight, rowStr);
			
			if (addStarLeft == 0) {
				addStarLeft += 1;
				} else addStarLeft -= 1;
			addStarRight += 1;
		}
	}
}