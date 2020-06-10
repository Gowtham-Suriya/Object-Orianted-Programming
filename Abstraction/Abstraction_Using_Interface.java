
package oops.Abstraction;

//Interface 
    // * the methods defined inside the interface
    //    by default all the method will be public and abstract 
 
interface Bank1
{
    //by default all the method will be public and abstract 
    //the method declared in the interface should be implimented on the class
    //not defined
    void deposit();
    void withdraw();
    void intrest();
}
class Hdfc implements Bank1
{
    @Override
    public void deposit()
    {
        System.out.println("This is deposit of HDFC");
    }
    @Override
    public void withdraw()
    {
        System.out.println("This is withdraw of HDFC");
    }
    @Override
    public void intrest()
    {
        System.out.println("This is deposit of HDFC");
    }
}
class Icici implements Bank1
{
    @Override
    public void deposit()
    {
        System.out.println("This is deposit of Icici");
    }
    @Override
    public void withdraw()
    {
        System.out.println("This is withdraw of Icici");
    }
    @Override
    public void intrest()
    {
        System.out.println("This is deposit of Icici");
    }
}
public class Abstraction_Using_Interface {
    public static void main(String[] args) {
        Bank1 a=new Hdfc();
        a.deposit();
        a.intrest();
        a.withdraw();
        
        Bank1 a1=new Icici();
        a1.deposit();
        a1.intrest();
        a1.withdraw();
    }
}