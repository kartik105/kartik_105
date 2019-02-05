import java.io.*;
import java.util.* ;

public class FileDemo 
{
   
   public static void main(String[] args) 
   {
      File f = null;
      String strs = "test1.txt";
      try 
      {
            f = new File(strs);
            String a = f.getAbsolutePath(); 
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
        Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
        while(sc.hasNext())
        {
               bout.write(sc.nextLine());
               bout.newLine();
        }
            bout.close();
               

            
 	     System.out.print("\n"+a);
            System.out.print("\nLength =" +f.length());
           } 
         
          catch (Exception e) 
         {
          e.printStackTrace();
         }
   }
}
