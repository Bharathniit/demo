class Duplicate
{
    public static void main(String[] args)
    {
        String str = "  This is a   java   program  ";
 
 
        String strWithoutSpace = str.replaceAll("\\s", "");
 
        System.out.println(strWithoutSpace);

}
}