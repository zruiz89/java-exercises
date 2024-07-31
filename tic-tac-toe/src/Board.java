import java.util.Random;

public class Board {
    private int cols;
    private int rows;
    private int[][] board;

    public Board(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        init();
    }

    private void init() {
        board = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = new Random().nextInt(2);
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean checkHorizontal() {
        boolean win = true;

        for (int i = 0; i < rows; i++) {
            win = true;
            System.out.println("Checking row " + (i));

            for (int j = 0; j < cols; j++) {
                if (j + 1 < cols) {
                    System.out.println("Comparing col " + (j) + " against col " + (j + 1));
                    if (board[i][j] != board[i][j + 1]) {
                        win = false;
                        break;
                    }
                }
            }

            System.out.println("Win is " + win);

            if (win)
                break;
        }

        return win;
    }
}