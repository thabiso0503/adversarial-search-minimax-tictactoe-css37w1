public class AIPlayer {

        public static void makeMove(Board boardObj) {

            int bestScore = Integer.MIN_VALUE;
            int bestRow = -1, bestCol = -1;

            char[][] board = boardObj.board;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (board[i][j] == ' ') {
                        board[i][j] = 'O';

                        int score = Minimax.minimax(board, false);

                        board[i][j] = ' ';

                        if (score > bestScore) {
                            bestScore = score;
                            bestRow = i;
                            bestCol = j;
                        }
                    }
                }
            }

            board[bestRow][bestCol] = 'O';
        }
    }
