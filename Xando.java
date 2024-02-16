import java.util.Scanner;

class Xando{

  private String[][] board = new String[3][3];
  private boolean running = true;
  private int playerTurn = 1;
  private Scanner scanner = new Scanner(System.in);
  
  /**
   * Function initialises the program
   */
  public static void main(String[] args){
    Xando instance = new Xando();
    instance.start();
  }
  
  /**
   * Start function to run the program
   */
  public void start(){
    this.clearBoard();
    this.printBoard();

    while(this.running){
      this.tick();
    }
  }
  
  /**
   * This function controls the main logic of the program
   */
  private void tick(){
    System.out.println("Player's " + this.playerTurn + " turn: input coordinates to go to");
    String[] coordinates = this.scanner.nextLine().split(" "); //Splits coordinates into array so we can work with that
    if(coordinates.length != 2){ //some validation
      return;
    }
    
    String entry;
    if(this.playerTurn == 1){
        entry = "X";
    }else{
        entry = "O";
    }
    
    //following block of code is used to make sure that the coordinates are valid
    int x = 0;
    int y = 0;
    try{
        y = Integer.parseInt(coordinates[0]);
        x = Integer.parseInt(coordinates[1]);
    }catch(Exception e){
        System.out.println("Not valid position to move");
        return;
    }
    
    if(!this.processTurn(x, y, entry)){ //handles the turn
      return;
    }
    if(this.playerTurn == 1){ //alternates between two players
        this.playerTurn = 2;
    }else{
        this.playerTurn = 1;
    }
    this.printBoard(); //updates the board after each turn so players can se updates board
  }
  
  /**
   * Handles every turn where player goes.
   * Returns boolean that represents if the turn is valid and can happen or no.
   */
  private boolean processTurn(int x, int y, String entry){
    if(x > 2 || y > 2 || x < 0 || y < 0){
      System.out.println("Not valid position to move");
      return false;
    }
    if(!this.board[x][y].equals("-")){
      System.out.println("Not valid position to move");
      return false;
    }
    this.board[x][y] = entry;
    if(this.checkForWin(x, y)){ //checks if one of the players has won
      return false;
    }
    return true;
  }
  
  /**
   * Called when player given in parameters has won
   */
  private void celebrateWin(String player){
    this.printBoard();
    if(player.equals("X")){
      System.out.println("Player 1 won");
    }else{
      System.out.println("Player 2 won");
    }
    this.running = false;
  }
  
  /**
   * Checks all position near the given position and compares the entry in them. Calls celebrateWin function when 3 of the same entry is in a row.
   * Returns boolean that depends if the win combinationb has been found or not.
   */
  private boolean checkForWin(int x, int y){
    String searchFor = this.board[x][y];
    
    
    //The following block of code checks for every possible combinations to win
    if(
      this.board[0][0].equals(searchFor) && this.board[0][1].equals(searchFor) && this.board[0][2].equals(searchFor)
      || this.board[1][0].equals(searchFor) && this.board[1][1].equals(searchFor) && this.board[1][2].equals(searchFor)
      || this.board[2][0].equals(searchFor) && this.board[2][1].equals(searchFor) && this.board[2][2].equals(searchFor)
      || this.board[0][0].equals(searchFor) && this.board[1][0].equals(searchFor) && this.board[2][0].equals(searchFor)
      || this.board[0][1].equals(searchFor) && this.board[1][1].equals(searchFor) && this.board[2][1].equals(searchFor)
      || this.board[0][2].equals(searchFor) && this.board[1][2].equals(searchFor) && this.board[2][2].equals(searchFor)
      || this.board[0][0].equals(searchFor) && this.board[1][1].equals(searchFor) && this.board[2][2].equals(searchFor)
      || this.board[0][2].equals(searchFor) && this.board[1][1].equals(searchFor) && this.board[2][0].equals(searchFor)
    ){
      this.celebrateWin(searchFor);
      return true;
    }
    return false;
  }
  
  /**
   * Clears the board/grid
   */
  private void clearBoard(){
    for(int x = 0; x < this.board.length; x++){
      for(int y = 0; y < this.board[x].length; y++){
        this.board[x][y] = "-";
      }
    }
  }
  
  /**
   * Outputs the board/grid
   */
  private void printBoard(){
    for(int i = 0; i < 20; i++){
      System.out.println();
    }

    String element;

    for(int x = 0; x < this.board.length; x++){
      System.out.print("___________\n");
      for(int y = 0; y < this.board[x].length; y++){
        element = this.board[x][y];
        if(element == "-"){
          element = " ";
        }
        System.out.print(element + " | ");
      }
      System.out.println();
    }
  }
}
