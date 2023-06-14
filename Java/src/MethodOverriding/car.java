
package MethodOverriding;
public class car extends Vehicle{
int speed = 80;
    
    public car()
    {
        super("Black");
        System.out.println("Car is Created\n");
    }
    
    public void display()
    {
        super.display();
        System.out.println("Vehicle Speed is: "+super.speed);
        System.out.println("Car Speed is: "+speed);
    }    
    
    public static void main(String[] args) {        
        
        car c1 = new car();       
        c1.display();      
      }    
}
