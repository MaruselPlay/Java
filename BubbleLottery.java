import java.util.Random;

class BubbleLottery{

  /**
  * Main function that runs the program
  */
  public static void main(String[] args){
    BubbleLottery instance = new BubbleLottery();
    instance.run();
  }

  /**
  * Main function that calls all functions and controls the program 
  */
  public void run(){
    int[] ticket = this.generateTicket();
    this.outputTicket(ticket);
    int[] sortedTicket = this.bubbleSort(ticket);
    this.outputHighestPlayerNumber(sortedTicket);
    this.outputLowestPlayerNumber(sortedTicket);
  }

  /**
  * Generates ticket with 6 random numbers, returns result as int array
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
  * Output highest number from the int array given by the parameters
  */
  private void outputHighestPlayerNumber(int[] sortedTicket){
    System.out.println("Highest number: " + sortedTicket[0]);
  }

  /**
  * Output lowest number from the int array given by the parameters
  */
  private void outputLowestPlayerNumber(int[] sortedTicket){
    System.out.println("Lowest number: " + sortedTicket[sortedTicket.length - 1]);
  }

  /**
  * Accepts ticket as int array and outputs it
  */
  private void outputTicket(int[] ticket){
    System.out.print("Ticket: ");
    for(int i = 0; i < ticket.length - 1; i++){
      System.out.print(ticket[i] + " ");
    }
    System.out.println("");
  }

  /**
  * Accepts ticket as int array and performs bubble sort in ascending order.
  * Returns sorted ticket as int array
  */
  private int[] bubbleSort(int[] ticket){
    int currentElement = 0;
    int tempItem;
    boolean swap = true;

    while(swap){
      swap = false;
      for(int i = 0; i < ticket.length - 1; i++){
        if(currentElement != ticket.length - 1 && ticket[currentElement] < ticket[currentElement + 1]){
          tempItem = ticket[currentElement + 1];
          ticket[currentElement + 1] = ticket[currentElement];
          ticket[currentElement] = tempItem;
          swap = true;
        }
        currentElement++;
        if(currentElement == ticket.length){
          currentElement = 0;
        }
      }
    }

    return ticket;
  }
}
