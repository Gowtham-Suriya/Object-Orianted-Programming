
package oops.Inheritance;
/*

<====   Inheritance   ====>
    * single inheritance 
    * Multilevel inheritance
    * Hirarchical inheritance

Adv:
    *reusablity of code
    *



*/
class Car
{
    void run()
    {
        System.out.println("the car runs with engine");
    }
    void breaking()
    {
        System.out.println("by default it uses drum break");
    }
}
class BMW extends Car
{
    void music()
    {
        System.out.println("It has JBL music system");
    }
    
    @Override
    void run()
    {
        System.out.println("The car runs with v12 engine");
    }
    
}
class XSixcar extends BMW
{
    void engine()
    {
        System.out.println("It is powered by V6 engine");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        XSixcar ob=new XSixcar();
        ob.run();
        ob.breaking();
        ob.engine();
        ob.music();
                
                
    }
}
