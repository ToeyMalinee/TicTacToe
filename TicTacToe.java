import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int board[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		boolean isWinner = false;
		//Check Draw
		int xScore = 0;
		int oScore = 0;

		// horizontal and vertical 
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1) {
				xScore++;
			}
			if (board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1) {
				xScore++;
			}

			if (board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2) {
				oScore++;
			}

			if (board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 2) {
				oScore++;
			}
		}
		// check Cross
		if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
			xScore++;
		}
		if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) {
			xScore++;
		}
		if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
			oScore++;
		}
		if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2) {
			oScore++;
		}

		if (xScore > 0 && oScore > 0) {
			System.out.println("Draw");

		} else {
			
			// Check Row
			for (int i = 0; i < n; i++) {
				if (!isWinner) {
					int tmp = board[i][0];
					boolean isEqual = true;
					for (int j = 0; j < n; j++) {
						if (tmp != board[i][j]) {
							isEqual = false;
							break;
						}
					}

					if (isEqual) {
						if (tmp == 1) {
							System.out.println("X");
						} else if (tmp == 2) {
							System.out.println("O");
						}
						isWinner = true;
					}
				}
			}
			// Check Column
			for (int i = 0; i < n; i++) {
				if (!isWinner) {
					int tmp = board[0][i];
					boolean isEqual = true;
					for (int j = 0; j < n; j++) {
						if (tmp != board[j][i]) {
							isEqual = false;
							break;
						}
					}

					if (isEqual) {
						if (tmp == 1) {
							System.out.println("X");
						} else if (tmp == 2) {
							System.out.println("O");
						}
						isWinner = true;

					}
				}
			}
			// Check Cross
			if (!isWinner) {
				boolean isEqual = true;
				int tmp = board[0][0];

				for (int i = 0; i < n; i++) {
					if (tmp != board[i][i]) {
						isEqual = false;
						break;
					}
				}

				if (isEqual) {
					if (tmp == 1) {
						System.out.println("X");
					} else if (tmp == 2) {
						System.out.println("O");

					}
					isWinner = true;

				}

			}
			// Check Cross
			if (!isWinner) {
				int tmp = board[0][n - 1];
				boolean isEqual = true;
				for (int i = n - 1; i > 0; i--) {
					if (tmp != board[i][n - i - 1]) {
						isEqual = false;
						break;
					}
				}

				if (isEqual) {
					if (tmp == 1) {
						System.out.println("X");
					} else if (tmp == 2) {
						System.out.println("O");
					}
					isWinner = true;

				}
			}
		}

	}

}
