public class Duplicate1
{   
public static void main(String[] args) 
{
String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "abc", "def"};

for (int i = 0; i < strArray.length-1; i++)
{
for (int j = i+1; j < strArray.length; j++)
{
if( (strArray[i].equals(strArray[j])) )
{
System.out.println("Duplicate Element is : "+strArray[j]);
}
}
}
}	
}