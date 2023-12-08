/**
 * Goes from 1 to 100 and outputs FizzBuzz for numbers that can be divided by 3 and 5.
 * If number can't be divided by 3 and 5, current count is outputed
 */

class FizzbuzzStandard{
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){ //for loop to count from 0 to 100
            if(i % 15 == 0){ //if number can be divided by 3 and 5
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){ //if number can be divided by 5 only
                System.out.println("Buzz");
            }else if(i % 3 == 0){ //if number can be divided by 3 only
                System.out.println("Fizz");
            }else{
                System.out.println(i); //outputs current count
            }
        }
    }
}