import java.util.Scanner;
import java.util.Random;

/* 
 * This is PetDog.
 * In this program, the user is asked to input dog's name. mass and coat color.
 * Then few commands avaliable to user: sit, stand, play, feed and kill commands.
 */

public class PetDog{
    public static void main(String[] args){

        String name;
        String coatColour;
        int levelEnergy;
        int weightKG;
        double weightPounds;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your dog name: ");
        name = scanner.nextLine();
        while(name.isEmpty()){
            System.out.print("Not valid name. Enter your dog name: ");
            name = scanner.nextLine();
        }


        System.out.print("Enter the coat colour of your dog: ");
        coatColour = scanner.nextLine();
        while(coatColour.isEmpty()){
            System.out.print("Not coat colour. Enter the coat colour of your dog: ");
            coatColour = scanner.nextLine();
        }

        System.out.print("Enter mass of your dog in kilograms: ");
        try{
            weightKG = Integer.parseInt(scanner.nextLine());
        }catch(Exception exeption){
            weightKG = -1;
        }
        while(weightKG <= 0){
            System.out.print("Wrong mass. Enter mass of your dog in kilograms: ");
            try{
                weightKG = Integer.parseInt(scanner.nextLine());
            }catch(Exception exeption){
                weightKG = -1;
            }
        }

        weightPounds = weightKG * 2.20462;
        levelEnergy = 20;
        String state = "standing";

        System.out.println(name + " mass in KG is " + weightKG);
        System.out.println(name + " mass in pounds is" + weightPounds);
        System.out.println(name + " coat colour is" + coatColour);
        System.out.println(name + " energy level is" + levelEnergy);
        System.out.println(name + " state is " + state);

        boolean alive = true;
        while(alive){
            System.out.print("Enter an action for a dog to perform: ");
            String action = scanner.nextLine();
            switch(action.toLowerCase()){
                case "sit":
                    if(state.equals("sitting")){
                        System.out.println(name + " is already sitting");
                    }else{
                        state = "sitting";
                        System.out.println(name + " is sitting now");
                    }
                    break;
                case "stand":
                    if(state.equals("standing")){
                        System.out.println(name + " is already standing");
                    }else{
                        state = "standing";
                        System.out.println(name + " is standing now");
                    }
                    break;
                case "play":
                    if(levelEnergy == 0){
                        System.out.println("Oh no! " + name + " has no energy to play, try to feed " + name + " first");
                    }else{
                        System.out.println("You're playing with " + name + "...");
                        int secondsToSleep = (new Random()).nextInt(5);
                        try{
                            Thread.sleep(secondsToSleep * 1000);
                        }catch(InterruptedException e){
                        }
                        levelEnergy -= 3 - (new Random()).nextInt(2);
                        if(levelEnergy < 0){
                            levelEnergy = 0;
                        }
                        System.out.println("You've played with " + name + ", energy level of " + name + " is now " + levelEnergy);
                    }
                    break;
                case "feed":
                    if(levelEnergy == 20){
                        System.out.println(name + " is not hungry yet");
                    }else{
                        levelEnergy = 20;
                        System.out.println("You've fed " + name + ", energy level of " + name + " is now " + levelEnergy);
                    }
                    break;
                case "kill":
                    alive = false;
                
            }
        }

        scanner.close();
    }
}