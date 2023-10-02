import java.util.Scanner;

public class ChooseMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter todays month as a number: ");
        String month = scanner.nextLine();
        try{
            int numericMonth = Integer.parseInt(month);
            String[] monthList = new String[13];
            monthList[1] = "January";
            monthList[2] = "February";
            monthList[3] = "March";
            monthList[4] = "April";
            monthList[5] = "May";
            monthList[6] = "July";
            monthList[7] = "June";
            monthList[8] = "August";
            monthList[9] = "September";
            monthList[10] = "October";
            monthList[11] = "November";
            monthList[12] = "December";
            System.out.println(monthList[numericMonth]);
            if(monthList[numericMonth].contains("e")){
                System.out.println("The month contains \"e\"");
            }else{
                System.out.println("The month doesn't contains \"e\"");
            }
            System.out.println("Season: " + getSeasonFromMonth(numericMonth));

            int days = 0;
            switch(numericMonth){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    days = 28;
                    break;
            }
            System.out.println("Number of days: " + days);

            System.out.print("Enter todays year: ");
            String year = scanner.nextLine();
            int numericYear = Integer.parseInt(year);
            if(numericYear % 4 == 0){
                System.out.println("This is a leap year");
            }else{
                System.out.println("This is not a leap year");
            }
        }catch(NumberFormatException exeption){
            System.out.println("Month format is wrong");
        }
        scanner.close();
    }

    public static String getSeasonFromMonth(int month){
        if(month <= 2 || month == 12){
            return "Winter";
        }
        if(month <= 5 && month > 2){
            return "Spring";
        }
        if(month <= 8 && month > 5){
            return "Summer";
        }
        if(month <= 11 && month > 8){
            return "Autumn";
        }
        return "Wrong Season";
    }
}
