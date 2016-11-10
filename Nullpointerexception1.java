import java.util.*;
class Nullpointerexception1
{
public static void main(String args[])
{
try
{
String num=null;
System.out.println(num.length());
}
catch(Exception e)
{
System.out.println("This is null exception handling");
}
}
}