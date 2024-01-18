import java.util.Scanner;
import java.io.FileWriter;

class FileWriterAdvanced{

  public String[] dataToWrite = new String[10];

  public static void main(String[] args){
    FileWriterAdvanced object = new FileWriterAdvanced();
    object.start();
  }

  public void start(){
    try{
      Scanner scanner = new Scanner(System.in);
      this.inputLinesFromUser(scanner);
      this.writeLines(this.inputFileNameFromUser(scanner));
      scanner.close();
    }catch(Exception e){
      System.out.println("An error happend while writing to file: ");
      e.printStackTrace();
    }
  }

  public void inputLinesFromUser(Scanner scanner){
    int count = 0;
    String line;
    do{
      System.out.print("Enter line or type \"STOP\" to stop writing: ");
      line = scanner.nextLine();
      if(line.equals("STOP")){
        break;
      }
      this.dataToWrite[count] = line;
      count++;
    }while(this.canWriteToArray(count));
  }

  public boolean canWriteToArray(int index){
    return index < this.dataToWrite.length;
  }

  public String inputFileNameFromUser(Scanner scanner){
    System.out.print("Enter the name of file: ");
    return scanner.nextLine();
  }

  public void writeLines(String file){
    try{
      FileWriter fileWriter = new FileWriter(file);

      for(int i = 0; i < this.dataToWrite.length; i++){
        fileWriter.write(this.dataToWrite[i] + "\n");
      }
      fileWriter.close();
      System.out.println("Done!");
    }catch(Exception e){
      System.out.println("An error happend while writing to file: ");
      e.printStackTrace();
    }
  }
}