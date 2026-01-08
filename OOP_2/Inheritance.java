public class Inheritance{

    public static void main(String args[]){
        
        Dog dobby = new Dog();
        dobby.breath();

        Fish F = new Fish();
        F.eat();
        Bird B = new Bird();
        B.breath();

        Shark s = new Shark();
        s.swim();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

//Multi level inheritance
class Mammel extends Animal{
    void walks(){
        System.out.println("walk");
    }
}
class Dog extends Mammel{
    int breed;
}

//hirarchical Inheritance
class Bird extends Animal{
    void fly(){
        System.out.println("bird can fly");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("fish can swim");
    }
}
class Shark extends Fish{
    void sharpTeeth(){
        System.out.println("sharpTeeth");
    }
}