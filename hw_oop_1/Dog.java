public class Dog extends Animal implements Ilable, Soundable{
    public Dog(String animal, String ownerName, String diagnosis, Boolean isVaccinated){
        super (animal,ownerName,diagnosis,isVaccinated);
    }
  
    @Override
    public void sound() {
        System.out.println("bark");
    }
}