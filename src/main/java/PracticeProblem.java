public class PracticeProblem {

	public static void main(String args[]) {
		String[][] maze = {
			{"", "", "", "", ""},
			{"", "", "", "", ""},
			{"", "", "", "F", ""},
			{"S", "", "", "", ""},
		  };
		  System.out.println(noOfPaths(maze));

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
		if(row<0 || col>arr[row].length-1){
			return -1;
		}
		if (arr[row][col].equals("F")){
			return moves;
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



	public static int noOfPaths(String [][] arr){
		int row =arr.length-1;
		int col=0;
		int noOfPaths =0;
		return noOfPathsHelper(row, col, arr, noOfPaths);
		

	}
	public static int noOfPathsHelper(int row, int col,String[][] arr, int paths){
		if (row<0 || col>arr[row].length-1){
			return -1;
		}
		if (arr[row][col].equals("F")){
			System.out.println(paths);
			paths++;
			return paths;
		}
		int up= noOfPathsHelper(row-1, col, arr, paths);
		int right= noOfPathsHelper(row, col+1, arr, paths);
		if(up<0){
			paths--;
			return right;
		}
		if (right<0){
			paths--;
			return up;
		}
		else{
			return up+right;
		}
	}

	

}
