import java.util.Scanner;

class LinearNames{

  private String[] names = new String[10]; //declaring string array of size 10
  private Scanner scanner = new Scanner(System.in); //declaring global scanner to use at any point in the class

  public static void main(String[] args){
    LinearNames instance = new LinearNames();
    instance.run();
  }

  public void run(){
    this.fillArray();
    this.outputNames();
    this.searchUserValue();
  }

  private void fillArray(){
    for(int i = 0; i < 12; i++){
      if(i < 10){
        System.out.print("\nEnter a name: ");
        this.names[i] = this.scanner.nextLine();
        System.out.print("\nCurrent number of names in the array: " + (i + 1));
      }else if(i == 10){
        System.out.print("\nThe array is full!");
      }
    }
  }

  private void searchUserValue(){
    System.out.print("\nEnter a name to search: ");
    SearchResult result = this.searchForValue(this.scanner.nextLine());
    if(!result.found){
      System.out.print("\nThe name doesn't exist in the array");
      return;
    }

    System.out.print("\nFound at position " + result.position);
  }

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

  private void outputNames(){
    for(int i = 0; i < this.names.length - 1; i++){
      System.out.print("\n" + this.names[i] + (i == this.names.length - 1 ? "" : ", "));
    }
  }
}

class SearchResult{
  public int position = -1;
  public boolean found = false;
}