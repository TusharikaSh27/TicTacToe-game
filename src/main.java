import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player" + player + "enter row and col");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(row<0 || row>2|| col<0 || col>2){
                System.out.println("Invalid input.Try again! ");
                continue;
            }


            if (board[row][col] == ' ') {
                board[row][col] = player; //place the element


                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("Player" + player + "has won: ");
                } else {
                    //f(player =='X'){
                    // player='0';
                    // }else{
                    //   player='X;'//


                    player = (player == 'X') ? '0' : 'X';
                }

            } else {

                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard(board);
    }


    public static boolean haveWon(char[][] board, char player) {
        //check the rows
        for (int row = 0; row < board.length; row++) {

            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        //check cols
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;

    }


    public static void printBoard(char[][] board) {
        System.out.println("---------------------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "  |  ");
                ;
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }
}

