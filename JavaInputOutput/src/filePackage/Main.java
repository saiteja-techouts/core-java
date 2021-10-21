package filePackage;

public class Main {

    public static void main(String[] args) {
        try
        {             
            Process process = Runtime.getRuntime().exec("notepad");     
           
        } catch (Exception t)
          {
            t.printStackTrace();
          }

    }
}