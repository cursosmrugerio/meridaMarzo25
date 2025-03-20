package com.curso.v0;

public class Bear {
    private Bear pandaBear;
    
    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
    }
    
    public static void main(String[] args) {
        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        brownBear.roar(polarBear);
        
        System.out.println(polarBear == brownBear.pandaBear);
        
        polarBear = null;
        
        System.out.println(brownBear.pandaBear);
        
        Bear xBear = brownBear.pandaBear;
        
        brownBear = null;
        
        System.gc();
    }
}
