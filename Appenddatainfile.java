import java.io.*;
public class Appenddatainfile
{
public static void main(String args[])
{
try
{
String data="This is my additional data";
File fobj=new File("C:\\classproblem\\New Folder (4)");
if(!fobj.exists())
{
fobj.createNewFile();
}
FileWriter fw=new FileWriter(fobj.getName(),true);
BufferedWriter bwr=new BufferedWriter(fw);
bwr.write(data);
bwr.close();
}
catch(IOException ioe)
{
System.out.println(ioe.toString());
}
}
}


