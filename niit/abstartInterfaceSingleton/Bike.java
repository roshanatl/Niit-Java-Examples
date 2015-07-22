

package com.niit.abstartInterfaceSingleton;

/**
 *
 * @author Roshan
 */
public class Bike extends Vehicle implements Movable{
    static int counter=0;
    
    static Bike d =new Bike();

    @Override
    void drive() {
        System.out.println("Bike drive");
    }

    @Override
    public void move() {
        System.out.println("Bike moving");
    }
    private Bike()
    {
        counter++;
    }
    static Bike getInstance()
            
    {
        
        return d;
    }
}
