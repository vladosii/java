import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public VetClinic addNewAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getFlyingAnimals(){
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof Flyable){
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }
    public List<Animal> getRuningAnimals(){
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof Runable){
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }
    public List<Animal> getSwimingAnimals(){
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof Swinable){
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }
    
     
    /*public List<flyable> getFlyingAnimals(){
        List<flyable> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof flyable){
                resultAnimals.add((flyable) animal);
            }
        }
        return resultAnimals;
    }*/

    public int index = 0;

}