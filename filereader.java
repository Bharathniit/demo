import java.io.FileWriter;
import java.io.*;  
class filereader{  
 public static void main(String args[])throws Exception{  
  FileReader fr=new FileReader("abc.txt");  
  int i;  
  while((i=fr.read())!=-1)  
  System.out.print((char)i);  
  
  fr.close();  
 }  
}  