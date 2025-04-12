public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int searchMazeMoves(String[][] arr) {

		//start at the bottom left
		int row = arr.length - 1;
		int col = 0;

		int noOfMoves = 0;

		return dfsHelper(arr, row, col, noOfMoves);
		
	}

	public static int dfsHelper(String[][] arr, int row, int col, int moves) {

		// base case
		if (arr[row][col]== "F"){
			return moves;
		}
		else if(row ==-1&& col ==-1){
			return -1;
		}
		// Goes out of bounds
		// Reach the finish
		// return number of moves

		

		// recursive call - increase moves
		// Go right (increase col)
		// Go up (decrease row)
		int right = dfsHelper(arr, row, col+1, moves+1);
		int up = dfsHelper(arr, row-1,col, moves+1);
		if (right < 0) {
			return up;
		}
		else if (up < 0) {
			return right;
		}
		return Math.min(up, right);
	}

	

}
