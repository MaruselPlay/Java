class Xando{

  private String[][] board = new String[3][3];
  private boolean running = true;

  public static void main(String[] args){
    Xando instance = new Xando();
    instance.start();
  }

  public void start(){
    this.clearBoard();
    this.printBoard();

    while(this.running){
      this.tick();
    }
  }

  private void tick(){
    
  }

  private boolean processTurn(int x, int y, String entry){
    if(this.board[x][y] != "-"){
      return false;
    }
    this.board[x][y] = entry;
  }

  private boolean celebrateWin(String player){

  }

  private boolean checkForWin(int x, int y){
    String searchFor = this.board[x][y];
    int found = 0;
    for(int xx = x - 2; xx <= 2; xx++){
      if(this.board[xx][y] == searchFor){
        found++;
        if(found == 3){
          if(this.celebrateWin(searchFor)){
            return true;
          }
        }
      }else{
        found = 0;
      }
      for(int yy = y - 2; yy <= 2; yy++){
        if(xx < 0 || yy < 0){
          continue;
        }

        if(this.board[x][yy] == searchFor){
          found++;
          if(found == 3){
            if(this.celebrateWin(searchFor)){
              return true;
            }
          }
        }else if(this.board[xx][yy] == searchFor){
          found++;
          if(found == 3){
            if(this.celebrateWin(searchFor)){
              return true;
            }
          }
        }else{
          found = 0;
        }
      }
    }
    return false;
  }

  private void clearBoard(){
    for(int x = 0; x < this.board.length; x++){
      for(int y = 0; y < this.board[x].length; y++){
        this.board[x][y] = "-";
      }
    }
  }

  private void printBoard(){
    for(int i = 0; i < 20; i++){
      System.out.println();
    }

    String element;

    for(int x = 0; x < this.board.length; x++){
      System.out.print("______________________\n");
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