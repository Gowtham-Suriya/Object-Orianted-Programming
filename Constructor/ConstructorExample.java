
package oops.Constructor;

import java.util.logging.Logger;

class First
{
    String name;
    String dept;
    
    public First(String name,String dept)
    {
        this.name= name;
        this.dept= dept;
    }

    @Override
    public String toString() {
        return "First{" + "name=" + name + ", dept=" + dept + '}';
    }
    
   
  
}

public class ConstructorExample {
    public static void main(String[] args) {
        First a=new First("Gowtham Suriya","ECE");
        System.out.println(a);
    }
}
