
package com.niit.abstartInterfaceSingleton;

/**
 *
 * @author Roshan
 */
public class Dog extends Animal implements Movable {

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Dog Running");
    }
    
}
