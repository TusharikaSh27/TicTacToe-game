public class main {
    public static void main(String[] args){
        char[][]board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }

        chat player='X';
        boolean gameOver=false;
        Scanner scanner = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player" = palyer + "enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();


            if(board[row][col]==' '){
                board[row][col]= player;

                gameOver=haveWon(board,player);

                if(gameOver){
                    System.out.println("Player"+ player + "has won: ");
                }
                else
            }
        }

    }

    public static printBoard(char[][]board){}
}
