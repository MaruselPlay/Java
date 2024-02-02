class TenTimesBinary{

  private int[] intArray = new int[100]; //declaring global array with a size of 100
  
  /**
   * Main function to run the program
   */
  public static void main(String[] args){
    TenTimesBinary instance = new TenTimesBinary();
    instance.run();
  }
  
  /**
  * Fills the 100 values in the array, each value is 100 times greater than its index
  */
  private void fillArray(){
    for(int i = 0; i < this.intArray.length - 1; i++){
      this.intArray[i] = i * 10;
    }
  }
  
  /**
   * The function triggers the array to be filled and then calls binarySearch function 
   * to locate the position of value of 350 and 370 in the array and output the result
   */
  private void run(){
    this.fillArray();
    System.out.print("Search result for value 350: ");
    SearchResult result = this.binarySearch(this.intArray, 350);
    if(result.found){
      System.out.println("Found at position " + result.position);
    }else{
      System.out.println("Not found");
    }
    
    System.out.print("Search result for value 750: ");
    result = this.binarySearch(this.intArray, 750);
    if(result.found){
      System.out.println("Found at position " + result.position);
    }else{
      System.out.println("Not found");
    }
  }
  
  /**
  * Accepts search value as String and returns SearchResult
  * Performs binary search on value given in the global array
  */
  private SearchResult binarySearch(int[] array, int searchValue){
    SearchResult result = new SearchResult();
    float left = 0;
    float right = array.length - 1;
    int middle = 0;
    
    while(left <= right){
      middle = (int) Math.floor((left + right) / 2);

      if(array[middle] == searchValue){
        result.position = middle;
        result.found = true;
        return result;
      }else if(array[middle] < searchValue){
        left = middle + 1;
      }else{
        right = middle - 1;
      }
    }
    
    return result;
  }
}

/**
* Used to store position of an element in array if it's found
*/
class SearchResult{
  public int position = -1;
  public boolean found = false;
}
