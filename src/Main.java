import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new TicTacToeGUI();
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        while (true) {

            board.printBoard();

            // Player move
            int row, col;
            while (true) {
                System.out.print("Enter row (0-2): ");
                row = scanner.nextInt();

                System.out.print("Enter col (0-2): ");
                col = scanner.nextInt();

                if (board.playerMove(row, col)) break;

                System.out.println("Invalid move, try again.");
            }

            if (GameState.checkWinner(board.board) != null) break;

            // AI move
            AIPlayer.makeMove(board);

            if (GameState.checkWinner(board.board) != null) break;
        }

        board.printBoard();
        System.out.println(GameState.checkWinner(board.board));
    }
}