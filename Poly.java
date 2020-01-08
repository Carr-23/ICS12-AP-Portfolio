
class Animal {

    public void sound() {
        System.out.println("...");
    }
}

class Bird extends Animal {

    public void sound() {
        System.out.println("Chirp Chirp");
    }
}

class Cat extends Animal {

    public void sound() {
        System.out.println("Meow");
    }
}

class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal bird = new Bird();

        animal.sound(); // call sound
        bird.sound(); // call sound
        cat.sound(); // call sound

        Animal a = cat; //Up casting
        a.sound();
        Cat c2 = (Cat) a; //Down Casting back to its original
        c2.sound();
    }
}
