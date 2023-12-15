class ElfNameArrayStandard{
    public static void main(String[] args){
        String[] firstLetter = new String[26];
        firstLetter[0] = "a";
        firstLetter[1] = "b";
        firstLetter[2] = "c";
        firstLetter[3] = "d";
        firstLetter[4] = "e";

        System.out.println(firstLetter[0]);
        System.out.println(firstLetter[25]);

        String[] month = new String[12];
        month[0] = "January";
        month[1] = "Febrary";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";

        for(int i = 0; i < month.length; i++){
            System.out.println(month[i]);
        }
    }
}