package oops.Polymorphism;

/*
    <=====   Polymorphism   =====>
    
    *Polymorphism means many forms
    *It can be achieved by two ways:
        ->Method Overloading
        ->method Overriding is also called as runtime polymorphism
     
 */
class Vehicle
{
    void Vehicle()
    {
        System.out.println("This is default constructor");
    }
    void Vehicle(String name)
    {
        System.out.println("The name of the Vehicle is "+name);
    }
    void Vehicle(String name,int year)
    {
        this.Vehicle(name);
        System.out.println("The Year of manufacturing is"+year);
    }
    void run()
    {
        System.out.println("the car runs with engine");
    }
}
class Car extends Vehicle
{
    void Car()
    {
        System.out.println("this is car");
    }
    @Override
    void run()
    {
        System.out.println("The car runs with v12 engine");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        System.out.println("the neme vehicle has same name the perameters and the return ty pe differs it is called method overloading");
        v.Vehicle();
        v.Vehicle("BMW");
        v.Vehicle("BMW",1999 );
        
        Car c=new Car();
        System.out.println("");
        System.out.println("this run function is overrinded it is called method overriding");
        c.run();
        
        
    }
}
