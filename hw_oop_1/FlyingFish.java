public class FlyingFish extends Animal implements Swinable, Flyable {
    
    @Override
    public void  toGo(){
        System.out.println("Я не умею ходить! Я ведь рыба");
    }

    @Override
    public void canSweem(int speed) {
        System.out.println( "Я умею плавать как рыба со скоростью " + speed);
        
    }

    @Override
    public void fly (int speed) {
         System.out.println( "Я немного умею летать. Я рыбы-летяга со скоростью " + speed);
        
    }
    
}