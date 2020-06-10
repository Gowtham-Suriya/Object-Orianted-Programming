
package oops.Encaptulation;
/*
<======  ENCAPTULATION   =====>
        
        * Wraping of data and code actiong on data Methods
        * the member variable and methods are declared on private
        * the outside of the class it is not vissible
        * the accesing of the variable by using getters and setters
        * the geters and setters must be public
        
*/

class Student
{
    private String name;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    
}
public class EncaptulationExample {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Gowtham Suriya");
        System.out.println(s.getName());
    }
}
