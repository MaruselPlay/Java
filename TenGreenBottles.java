class TenGreenBottles{
    public static void main(String[] args){
        for(int i = 100; i >= 0; --i){ //for loop thet goes from 100 to 0, subtracting 1 from variable i each time
            try{
                Thread.sleep(1000); //program sleeps for one second so there is one second delay between output
            }catch(InterruptedException e){}
            //following code decides the message that will be outputed
            if(i == 0){
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }else if(i == 1){
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
            }else{
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            }
            if(i - 1 == 0){
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
            }else if(i > 0){
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
            }
            System.out.println(""); //printing blank line to separate each loop run
        }
    }
}