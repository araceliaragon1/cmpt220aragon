import java.util.ArrayList;

public class Loteria {
	
	public static void main(String[] args) {
		ArrayList<String> deck = new ArrayList<String>();
		deck.add("a");
		deck.add("b");
		deck.add("c");
		deck.add("d");
		deck.add("e");
		deck.add("f");
		deck.add("g");
		deck.add("h");
		deck.add("i");
		deck.add("j");
		deck.add("k");
		deck.add("l");
		deck.add("m");
		deck.add("n");
		deck.add("o");
		deck.add("p");
		deck.add("q");
		deck.add("r");
		deck.add("s");
		deck.add("t");
		deck.add("u");
		deck.add("v");
		deck.add("w");
		deck.add("x");
		deck.add("y");
		deck.add("z");
		
		createBoard();
		createCmptBoard();
		
		while (winHorizontally() == false && winVertically() == false && 
				winCmptHorizontally() == false && winCmptVertically() == false) {
			printBoard();
			printCmptBoard();
			int card = (int)(Math.random() * deck.size());
			System.out.println(deck.get(card));
			System.out.println();
			markBoard(deck.get(card));
			markCmptBoard(deck.get(card));
			deck.remove(card);
			if(winHorizontally() == true || winVertically() == true) {
				System.out.println("LOTERIA! You Won!");
			}
			if (winCmptHorizontally() == true || winCmptVertically() == true) {
				System.out.println("LOTERIA! Computer Won!");
			}
		}
	}

	private static Cell[][] board = new Cell [4][5];
	private static Cell[][] cmptBoard = new Cell [4][5];
	
	public static void createBoard() {
		ArrayList<String> letters = new ArrayList<String>();
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		letters.add("f");
		letters.add("g");
		letters.add("h");
		letters.add("i");
		letters.add("j");
		letters.add("k");
		letters.add("l");
		letters.add("m");
		letters.add("n");
		letters.add("o");
		letters.add("p");
		letters.add("q");
		letters.add("r");
		letters.add("s");
		letters.add("t");
		letters.add("u");
		letters.add("v");
		letters.add("w");
		letters.add("x");
		letters.add("y");
		letters.add("z");
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				int letter = (int)(Math.random() * letters.size());
				board[i][j] = new Cell(letters.get(letter));
				letters.remove(letter);
			}
		}
		
	}
	
	public static void createCmptBoard() {
		ArrayList<String> letters = new ArrayList<String>();
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		letters.add("f");
		letters.add("g");
		letters.add("h");
		letters.add("i");
		letters.add("j");
		letters.add("k");
		letters.add("l");
		letters.add("m");
		letters.add("n");
		letters.add("o");
		letters.add("p");
		letters.add("q");
		letters.add("r");
		letters.add("s");
		letters.add("t");
		letters.add("u");
		letters.add("v");
		letters.add("w");
		letters.add("x");
		letters.add("y");
		letters.add("z");
		
		for(int i = 0; i < cmptBoard.length; i++) {
			for(int j = 0; j < cmptBoard[i].length; j++) {
				int letter = (int)(Math.random() * letters.size());
				cmptBoard[i][j] = new Cell(letters.get(letter));
				letters.remove(letter);
			}
		}
		
	}
	
	public static void markBoard(String card) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if (board[i][j].name == card) {
					board[i][j].filled = true;
				}
			}
		}
		
	}
	
	public static void markCmptBoard(String card) {
		for(int i = 0; i < cmptBoard.length; i++) {
			for(int j = 0; j < cmptBoard[i].length; j++) {
				if (cmptBoard[i][j].name == card) {
					cmptBoard[i][j].filled = true;
				}
			}
		}
		
	}
	
	public static boolean winHorizontally() {
		boolean row = true;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if (board[i][j].filled == true) {
					
				}else {
					row = false;
				}
			}
			if (row == true) {
				return true;
			}else {
				row = true;
			}
		}
		return false;
	}
	
	public static boolean winVertically() {
		boolean column = true; 
		for(int i = 0; i < board[0].length; i++) {
			for(int j = 0; j < board.length; j++) {
				if (board[j][i].filled == true) {
					
				}else {
					column = false; 
				}
			}
			if (column == true) {
				return true; // have won because column is true for filled 
			}else {
				column = true; // will set to true to start from the beginning 
			}
		}
		return false; 
	}
	
	public static boolean winCmptHorizontally() {
		boolean row = true;
		for(int i = 0; i < cmptBoard.length; i++) {
			for(int j = 0; j < cmptBoard[i].length; j++) {
				if (cmptBoard[i][j].filled == true) {
					
				}else {
					row = false;
				}
			}
			if (row == true) {
				return true;
			}else {
				row = true;
			}
		}
		return false;
	}
	
	public static boolean winCmptVertically() {
		boolean column = true; 
		for(int i = 0; i < cmptBoard[0].length; i++) {
			for(int j = 0; j < cmptBoard.length; j++) {
				if (cmptBoard[j][i].filled == true) {
					
				}else {
					column = false; 
				}
			}
			if (column == true) {
				return true; 
			}else {
				column = true; // will set to true to start from the beginning 
			}
		}
		return false; 
	}
	
	public static void printBoard() {
		System.out.println("YOU");
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].name);			
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printCmptBoard() {
		System.out.println("CMPT");
		for(int i = 0; i < cmptBoard.length; i++) {
			for(int j = 0; j < cmptBoard[i].length; j++) {
				System.out.print(cmptBoard[i][j].name);			
			}
			System.out.println();
		}
		System.out.println();
	}

}







