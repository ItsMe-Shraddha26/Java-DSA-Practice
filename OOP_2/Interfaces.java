class Interfaces{
    public static void main(String args[]){
        Queen Q = new Queen();
        Q.moves();
        
        Beer B = new Beer();
        B.grass();
        B.meat();
    }
}
interface  ChessPlayer{
    void moves();        // public and abstract by default
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen => up,down,left,right, diagonal(all 4 direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
         System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
         System.out.println("up,down,left,right,(diagonal 1 step)");
    }
}

//multiple inheritance
interface Herbivorus{
    void grass();
}
interface Carnivorus{
    void meat();
}
class Beer implements Herbivorus,Carnivorus{
    public void grass(){
       System.out.println("Eat fresh grass");
    }
    public void meat(){
       System.out.println("Eat fresh meat");
    }
}