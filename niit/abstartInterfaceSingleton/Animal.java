package com.niit.abstartInterfaceSingleton;

/**
 *
 * @author Roshan
 */
public abstract  class Animal {
    
    private String name;
    public String getName()
    {
        return this.name;
    }
    
    abstract void makeSound();  
    
    
}
