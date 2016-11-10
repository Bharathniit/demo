class Parameterisedconstructor
{  
    int id;  
    String name;  
      
    Parameterisedconstructor(int i,String n)
{  
 id = i;  
name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Parameterisedconstructor s1 = new Parameterisedconstructor(111,"Karan");  
    Parameterisedconstructor s2 = new Parameterisedconstructor(222,"Aryan");  
    s1.display();  
    s2.display();  
   }  
}  