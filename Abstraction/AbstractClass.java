package oops.Abstraction;

import java.util.*;
//Abstraction can be achieved by two methods 
        //Abstract method
        //using Interface
abstract class Bank
{
   //rate of intrest will be differ form one to another banks;
   
   //the methods which are defined are called concrete method
    /* <===concrete method=====>
            void credit()
             {
                 System.out.println("the debiting process in all banks are same");
             }
             */
    //the method which are declared with abstract keyword are called abstract method
    /*example ====>abstract void Intrest();*/
    //****  Abstract class containd both abstract method and concrete method
   
    
    
    abstract void Intrest();
   
   void credit()
    {
        System.out.println("the debiting process in all banks are same");
    }
   void debit()
   {
       System.out.println("the debiting process in all banks are same");
   }

}
class Icic extends Bank
{
    @Override
    public void Intrest()
    {
        System.out.println("WE give 13%* for savings");
    }

    
}
class Canara extends Bank
{
    
    @Override
    public void Intrest()
    {
        System.out.println("WE give the intrest rate of 10%*");
    }

    
}

public class AbstractClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank a=new Icic();
        Bank c=new Canara();
        a.Intrest();
        a.credit();
        a.debit();
        c.Intrest();
        c.credit();
        c.debit();
    }
}
