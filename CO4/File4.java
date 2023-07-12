import java.io.FileWriter;

public class File4
{

   public static void main(String [] args)

    {
      
     String  message =("Learn Java Programming with me");
     String a=("i am here with you");

     try
      {
          FileWriter fw= new FileWriter("fileexample1.txt");
          fw.write(message);
          fw.write(a);
          
          System.out.println("Message written to file successfully!!!");
          fw.close();
          
          }


      catch(Exception e)
      {
          System.out.println("Error occured during file writing ");

      }

 }    

}