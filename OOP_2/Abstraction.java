class Abstraction{
    public static void main(String args[]){
       Chikan chiku = new Chikan();
       chiku.eat();
       chiku.walk();
       System.out.println(chiku.color);
       
       System.out.println();

       Dog  dogesh = new Dog();
       dogesh.eat();
       dogesh.walk();

       dogesh.changeColor();
       System.out.println(dogesh.color);
       
       System.out.println();
       Ponia po = new Ponia();
       //Animal => Chikan => Ponia
    }
}
 
abstract class Animal{             //cannot create object of Aimal
    String color;

    Animal(){                 //Constructor
       color = "brown";
       System.out.println("Constructor of Animal class");
    }
    void eat(){              
        System.out.println("eat");
    }

    abstract void walk();        //Gives idea about next
}

class Chikan extends Animal{
    Chikan(){
        System.out.println("Constructor of Chikan class");
    }
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
class Ponia extends Chikan{
    Ponia(){
        System.out.println("Constructor of Ponia class");
    }
}

class Dog extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}