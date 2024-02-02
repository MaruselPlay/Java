import java.util.Random;

class BubbleLottery{
  
  public static void main(){
    BubbleLottery instance = new BubbleLottery();
    instance.run();
  }

  public void run(){
    String ticket = this.generateTicket();
    String sortedTicket = this.bubbleSort(ticket);
  }

  private String generateTicket(){
    Random random = new Random(); 
    String ticket = "";
    for(int i = 0; i < 6; i++){
      ticket += random.nextInt(48) + 1;
    }
    return ticket;
  }

  private void outputTicket(String ticket){
    System.out.print(ticket);
  }

  private String bubbleSort(String ticket){
    int currentElement = 0;
    char tempItem;
    boolean swap = true;
    System.out.println(ticket);
    char[] ticketChars = ticket.toCharArray();
    while(swap){
      swap = false;
      for(int i = 0; i < ticketChars.length; i++){
        if(ticketChars[currentElement] > ticketChars[currentElement + 1]){
          tempItem = ticketChars[currentElement + 1];
          ticketChars[currentElement + 1] = ticketChars[currentElement];
          ticketChars[currentElement] = tempItem;
          swap = true;
        }
        currentElement++;
        if(currentElement == ticket.length()){
          currentElement = 0;
        }
      }
    }

    String result = new String(ticketChars);
    System.out.println(result);
    return result;
  }
}