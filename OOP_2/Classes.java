public class Classes{

    public static void main(String args[]){
        Pen p1 = new Pen(); //created an object
        p1.setColor("Color : "+"blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println("Tip size : "+p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shraddha";
        System.out.println("username: "+myAcc.username);

        myAcc.setPassword("abs");
        System.out.println("password: "+myAcc.getPassword());
    }

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

//Getter ans Setters
class BankAccount{
   public String username;
   private String password;
   
    void setPassword(String newPassword){
    password = newPassword;
   }

   String getPassword(){
    return this.password;
   }
}