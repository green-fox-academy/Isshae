public class multiArray {
    public static void main(String[] args) {

        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i + j;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
