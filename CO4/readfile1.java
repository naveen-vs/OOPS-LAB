import java.io.FileReader;

public class readfile1
{

   public static void main(String [] args)

    {
      
     char [] data = new char[50];


     try
      {
          FileReader fr= new FileReader("fileexample1.txt");
          fr.read(data);
          
          System.out.println("The contents of file is :");
          System.out.print(data);
          fr.close();
          
          }


      catch(Exception e)
      {
          System.out.println("Error occured during file reading ");

      }

 }    

}