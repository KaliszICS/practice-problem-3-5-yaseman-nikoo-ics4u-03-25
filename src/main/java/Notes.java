
class Notes {
	public static void main(String[] args) {

	}

	public static int dfs(String[][] arr) {

		//start at the bottom left
		int row = arr.length - 1;
		int col = 0;

		int noOfMoves = 0;

		return dfsHelper(arr, row, col, noOfMoves);
		
	}

	public static int dfsHelper(String[][] arr, int row, int col, int moves) {

		// base case
		
		// Goes out of bounds
		// Reach the finish
		// return number of moves

		

		// recursive call - increase moves
		// Go right (increase col)
		// Go up (decrease row)
		return 0;
		
	}

	
}
