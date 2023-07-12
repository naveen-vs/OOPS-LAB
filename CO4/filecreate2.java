import java.io.File;

public class filecreate2
{

   public static void main(String [] args)
   {
       File  f = new File("fileexample2.txt");
      
      try
      {
          
            boolean status = f.createNewFile();
            if(status)
            {
               System.out.println("The new file created!!! ");
            }
            else

           {
              System.out.println("The file already exists ");
           }
        }

      catch(Exception e)
      {
          System.out.println("Error occured during file creation ");

      }

 }    

}