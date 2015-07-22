
 
package com.niit.abstartInterfaceSingleton;

/**
 *
 * @author Roshan
 */
public class Cat extends Animal implements Movable {

    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat Running");
    }
    
}
