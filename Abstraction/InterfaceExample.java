package oops.Abstraction;

interface And
{
    //we can define member functions but not advoisable
    public static int legs=4;
    public static boolean isActionable = false;
    
    //methods
    public void eat();
    public void sound();
}
interface Boy
{
    //methods
    public void fly();
}
class Cat implements And
{
    @Override
    public void eat()
    {
        System.out.println("This is eating process");
    }
    @Override
    public void sound()
    {
        System.out.println("this is sound");
    }
}
class Dog implements Boy
{
    @Override
    public void fly()
    {
        System.out.println("This process is Flying");
    }
}

//Multiple Interface
class Elephant implements And,Boy
{
    @Override
    public void fly()
    {
        System.out.println("this is multiple interface fly function");
    }
    @Override
    public void eat()
    {
        System.out.println("Eat fun on multiple interface");
    }
    @Override
    public void sound()
    {
        System.out.println("Sound system in multiple");
    }
    
}


public class InterfaceExample {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        
        Dog d=new Dog();
        d.fly();
        
        Elephant e=new Elephant();
        e.eat();
        e.fly();
        e.sound();
        System.out.println("legs of animals are: "+e.legs);
    }
}
