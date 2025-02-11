
interface Animal {
    default void sound() {
        System.out.println("Animal makes a sound.");
    }
}

interface Bird {
    default void sound() {
        System.out.println("Bird chirps.");
    }
}

class HybridCreature implements Animal, Bird {
    @Override
    public void sound() {
        System.out.println("HybridCreature resolving sound method conflict...");
        Animal.super.sound(); 
        Bird.super.sound();   
    }
}

public class Question5 {
    public static void main(String[] args) {
        HybridCreature creature = new HybridCreature();
        creature.sound(); 
    }
}
