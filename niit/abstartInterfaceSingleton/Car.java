
package com.niit.abstartInterfaceSingleton;

/**
 *
 * @author Roshan
 */
public class Car extends Vehicle implements Movable{
    static int counter=0;
    
    static Car d =new Car();

    @Override
    void drive() {
        System.out.println("Car drive");
    }

    @Override
    public void move() {
        System.out.println("Car moving");
    }
    private Car()
    {
        counter++;
    }
    static Car getInstance()
            
    {
        
        return d;
    }
}
