public class Human extends Animal implements Ilable, Swinable {
   public void ill(){
    System.out.println( "Я болею^ как человек");
    }

@Override
public void canSweem(int speed) {
    System.out.println("Я плаваю кролем и брасом со скоростью " + speed);
    
}
}