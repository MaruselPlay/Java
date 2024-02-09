import java.util.Random;

class InsertionLottery{

  /**
  * Main method that initiates run of program
  */
  public static void main(String[] args){
    InsertionLottery instance = new InsertionLottery();
    instance.run();
  }

  /**
  * Controls the program
  */
  public void run(){
    int[] ticket = this.replaceSameNumbers(this.generateTicket());
    this.outputTicket(this.insertionSort(ticket));
  }

  /**
  * Generates ticket number and returns it as int array
  */
  private int[] generateTicket(){
    Random random = new Random(); 
    int[] ticket = new int[6];
    for(int i = 0; i < 6; i++){
      ticket[i] = random.nextInt(48) + 1;
    }
    return ticket;
  }

  /**
  * Accepts ticket as a parameter of type int array.
  * Replaces same numbers and returns new ticket as int array.
  */
  private int[] replaceSameNumbers(int[] ticket){
    Random random = new Random();
    for(int i = 0; i < ticket.length; i++){
      for(int j = 0; j < ticket.length; j++){
        if(ticket[i] == ticket[j]){
          ticket[i] = random.nextInt(48) + 1;
        }
      }
    }
    return ticket;
  }

  /**
  * Accepts ticket as a int array parameter and outputs it.
  */
  private void outputTicket(int[] ticket){
    System.out.print("Ticket: ");
    for(int i = 0; i < ticket.length - 1; i++){
      System.out.print(ticket[i] + " ");
    }
    System.out.println("");
  }

  /**
  * Accepts ticket as int array parameter and sorts numbers in descending order.
  * Returns sorted result as int array
  */
  private int[] insertionSort(int[] ticket){
    int tempItem;
    int currentPosition;

    for(int i = 1; i < ticket.length; i++){
      tempItem = ticket[i];
      currentPosition = i;

      while(currentPosition > 0 && ticket[currentPosition - 1] > tempItem){
        ticket[currentPosition] = ticket[currentPosition - 1];
        currentPosition--;
      }

      ticket[currentPosition] = tempItem;
    }

    return ticket;
  }
}
