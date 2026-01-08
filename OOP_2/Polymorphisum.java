class Polymorphisum{

    public static void main(String args[]){
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum(1,2,3));
        System.out.println(cal.sum((float)1.5,(float)2.5));

        Dear D = new Dear();
        D.eat();
    }
}

//Method Overloading
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a , int b ,int c){
        return a+b+c;
    }
    float sum(float a , float b){
        return a+b;
    }
}
//method overrideing
class Animal{
    void eat(){
        System.out.println("eats Anything");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}