public class Minimax {

        public static int minimax(char[][] board, boolean isMax) {

            String result = GameState.checkWinner(board);

            if (result != null) {
                if (result.equals("WIN")) return 1;
                if (result.equals("LOSE")) return -1;
                return 0;
            }

            if (isMax) {
                int best = Integer.MIN_VALUE;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (board[i][j] == ' ') {
                            board[i][j] = 'O';

                            int score = minimax(board, false);

                            board[i][j] = ' '; // undo

                            best = Math.max(best, score);
                        }
                    }
                }
                return best;

            } else {
                int best = Integer.MAX_VALUE;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (board[i][j] == ' ') {
                            board[i][j] = 'X';

                            int score = minimax(board, true);

                            board[i][j] = ' '; // undo

                            best = Math.min(best, score);
                        }
                    }
                }
                return best;
            }
        }
    }

