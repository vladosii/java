public class Duck  extends Animal implements Soundable, Flyable{
    

    @Override
    public void sound() {
        System.out.println("krya");
    }

    @Override
    public void fly( int speed) {
        System.out.println(getClass().getName() + " is flying whith speed " + speed);
    }
}