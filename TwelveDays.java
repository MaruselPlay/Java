class TwelveDays{

  public static void main(String[] args){
    //declare array with gifts
    String[] gifts = {"Drummers Drumming", "Pipers Piping", "lords a leaping", "ladies dancing", "maids a milking", "swans a swimming", "geese a laying", "golden rings", "calling birds", "french hens", "turtle doves", "A Partridge in a pear tree"};
    int dayCount = 0; //declaring a variable to store count of days
    String day;
    for(int i = 0; i < gifts.length; i++){ //for loo to go through each gift in array
      if(i == gifts.length - 1){ //logic to output and before the last gift
        System.out.println("and " + gifts[i]);
        break;
      }

      dayCount++;

      //following block of code will decide the correct ending to use
      if(dayCount == 1){
        day = dayCount + "st";
      }else if(dayCount == 2){
        day = dayCount + "nd";
      }else if(dayCount == 3){
        day = dayCount + "rd";
      }else{
        day = dayCount + "th";
      }

      System.out.println("On the " + day + " day of Christmas my true love gave to me: ");
      for(int j = 0; j < gifts.length - i; j++){ //outputting all gifts for the current day and all days lower
        System.out.println(dayCount + " " + gifts[j]);
      }
    }
  }
}