package world;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchingInFile implements Simple
{
	public String directory(String s,String directory) throws IOException
	{
		String s1="";
	 File f=new File(directory);
	 File[] listOfFiles = f.listFiles();
	// BufferedReader bufferedReader=null;
	 try
	 	{
		 for(File file : listOfFiles)
		 	{
			 if(file.isFile())
			 	{
				 FileReader fr=new FileReader(file.getAbsolutePath());    
		         BufferedReader br=new BufferedReader(fr);    
				 String line;
				 int lineNumber = 0;
				 while ((line = br.readLine()) != null)   
				 	{
					    br.close();
					    lineNumber++;
               			if(line.contains(s))
               			{
               			System.out.println(file.getName()+",linenumber:"+lineNumber+","+s);
               			s1=s1+file.getName()+",linenumber:"+String.valueOf(lineNumber)+","+s;
               		    return s1;
               			}
				 	}
			 	}
			 if(file.isDirectory())
			 {
				 directory(s,file.getAbsolutePath());
			
			 }
		 }
	 }
      catch(FileNotFoundException cnfe)
       {
    	   cnfe.printStackTrace();
       }
	 
    	   return "-1";
     }
}
        


