
import java.util.Scanner;

public class WordSearch {

    public static boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean search(char[][] board, String word,
                                 int i, int j, int index) {

        // All characters matched
        if (index == word.length()) {
            return true;
        }

        // Check boundaries and character match
        if (i < 0 || j < 0 ||
            i >= board.length || j >= board[0].length ||
            board[i][j] != word.charAt(index)) {

            return false;
        }

        // Mark current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Search in four directions
        boolean found =
                search(board, word, i + 1, j, index + 1) ||
                search(board, word, i - 1, j, index + 1) ||
                search(board, word, i, j + 1, index + 1) ||
                search(board, word, i, j - 1, index + 1);

        // Restore original character
        board[i][j] = temp;

        return found;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        char[][] board = new char[m][n];

        // Read board characters
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        String word = sc.next();

        if (exist(board, word)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
