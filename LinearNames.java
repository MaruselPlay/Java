import java.util.Scanner;

class LinearNames{

  private String[] names = new String[10]; //declaring string array of size 10
  private Scanner scanner = new Scanner(System.in); //declaring global scanner to use at any point in the class

  /**
  * Creates an instance of the class and calls run method in this instance 
  */
  public static void main(String[] args){
    LinearNames instance = new LinearNames();
    instance.run();
  }

  /**
  * Main method of the program, runs the program
  */
  public void run(){
    this.fillArray();
    this.outputNames();
    this.searchUserValue();
  }

  /**
  * Fills the array with first 10 inputs, entered by the user
  */
  private void fillArray(){
    for(int i = 0; i < 12; i++){ //a loop to ask the user for input 12 times
      if(i < 10){ //a check to make sure that no errors could be thrown
        System.out.print("Enter a name: ");
        this.names[i] = this.scanner.nextLine();
        System.out.print("\n");
        System.out.println("Current number of names in the array: " + (i + 1));
      }else if(i == 10){
        System.out.println("The array is full!");
      }
    }
  }

  /**
  * Asks a user for a value and checks if the value in the array, using linear search
  */
  private void searchUserValue(){
    System.out.println("Enter a name to search: ");
    SearchResult result = this.searchForValue(this.scanner.nextLine());
    if(!result.found){
      System.out.println("The name doesn't exist in the array");
      return;
    }

    System.out.println("Found at position " + result.position);
  }

  /**
  * Accepts search value as String and returns SearchResult
  * Performs linear search on value given in the global array
  */
  private SearchResult searchForValue(String value){
    SearchResult result = new SearchResult();
    for(int i = 0; i < this.names.length - 1; i++){
      if(value.equals(this.names[i])){
        result.found = true;
        result.position = i;
        return result;
      }
    }
    return result;
  }

  /**
  * Outputs the names stored in the array, separated by a comma.
  */
  private void outputNames(){
    for(int i = 0; i < this.names.length - 1; i++){
      System.out.print(this.names[i] + (i == this.names.length - 2 ? "" : ", "));
    }
    System.out.print("\n");
  }
}

/**
* Used to store position of an element in array if it's found
*/
class SearchResult{
  public int position = -1;
  public boolean found = false;
}
