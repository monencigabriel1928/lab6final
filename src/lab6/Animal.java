package lab6;

//Creati o clasa Animal cu metodele eat() si sound(). Creati 3 subclase:
       // Lion, Tiger, Panther. Suprascrieti metoda eat() in fiecare subclasa care
       // sa descrie ce mananca fiecare animal.
        //Suprascrieti metoda sound() care sa descrie sunetul fiecarui animal.
        //In clasa Main creati o instanta din fiecare subclasa si apelati metodele.

// Definirea clasei Animal

class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Definirea subclasei Lion
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars.");
    }
}

// Definirea subclasei Tiger
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and sometimes grass.");
    }

    @Override
    public void sound() {
        System.out.println("Tiger growls.");
    }
}

// Definirea subclasei Panther
class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("Panther eats meat and is a carnivore.");
    }

    @Override
    public void sound() {
        System.out.println("Panther makes a unique sound.");
    }
}

// Clasa Main pentru a testa
class Main {
    public static void main(String[] args) {
        // Crearea instanțelor din fiecare subclasă
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        // Apelarea metodelor pentru fiecare instanță
        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}

