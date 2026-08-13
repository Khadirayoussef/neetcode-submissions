class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                HashSet<Character> isExist = new HashSet<>();

                if (!check(board[i][j], isExist)) return false;
                if (!check(board[i][j + 1], isExist)) return false;
                if (!check(board[i][j + 2], isExist)) return false;

                if (!check(board[i + 1][j], isExist)) return false;
                if (!check(board[i + 1][j + 1], isExist)) return false;
                if (!check(board[i + 1][j + 2], isExist)) return false;

                if (!check(board[i + 2][j], isExist)) return false;
                if (!check(board[i + 2][j + 1], isExist)) return false;
                if (!check(board[i + 2][j + 2], isExist)) return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!check(board[i][j], row) || !check(board[j][i], col)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean check(char val, HashSet<Character> isExist) {
        if (val == '.') return true;
        return isExist.add(val);
    }
}