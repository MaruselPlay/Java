class ElfNameArrayStandard{

  public static void main(String[] args){
    String[] firstLetter = new String[26]; //assigning an array of size 26

    //the following block of code assignes first 5 letters of the alphabet to their positions in array
    firstLetter[0] = "a";
    firstLetter[1] = "b";
    firstLetter[2] = "c";
    firstLetter[3] = "d";
    firstLetter[4] = "e";

    //ouputting first and last element of the array
    System.out.println(firstLetter[0]);
    System.out.println(firstLetter[25]);

    String[] month = new String[12]; //assigning an array of size 12

    //the following block of code assignes first 5 months to their positions in array
    month[0] = "January";
    month[1] = "Febrary";
    month[2] = "March";
    month[3] = "April";
    month[4] = "May";

    for(int i = 0; i < month.length; i++){ //outputting each value of the array
      System.out.println(month[i]);
    }
  }
}