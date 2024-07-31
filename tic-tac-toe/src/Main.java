//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int COLS = 3;
    private static final int ROWS = 3;

    public static void main(String[] args) {

        Board board = new Board(COLS, ROWS);
        board.display();
        boolean win = board.checkHorizontal();
        System.out.println("You " + (win ? "won": "lost"));
    }
}