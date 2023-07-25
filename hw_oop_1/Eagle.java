public class Eagle extends Animal {
   
    @Override
    public void toGo(){
        System.out.println(" Я умею ходить, но медленно. Я ведь птица");
    }
    @Override
    public void sweem(){
        System.out.println(" Я не умею плавать. Я орел");
    }
}