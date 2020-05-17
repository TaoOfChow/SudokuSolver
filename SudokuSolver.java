package codes;

public class SudokuSolver {

	public static void main(String[] args)throws Exception {
		
		Board puzzle = new Board();
		puzzle.loadPuzzle("hard");
		puzzle.display();
		puzzle.logicCycles();
		puzzle.display();
		System.out.println(puzzle.errorFound());
		System.out.println(puzzle.isSolved());
		

	}

}
