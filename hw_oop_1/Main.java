// Дз: добавить в класс Animal protected методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать. Причем, если допустим кошка не умеет летать, то она не должна этого делать.

// ОБЯЗАТЕЛЬНО: В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
// (если они есть)
// Ссылка на гитхаб проект

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик", "Ольга", "простуда", false);

        System.out.println(barsik.isVaccinated());
        barsik.setVaccinated(true);
        System.out.println(barsik.isVaccinated());
        System.out.println(barsik.getType());
        Cat cat = new Cat();

        System.out.println(cat);

        Cat musya = new Cat();
        Dog pes = new Dog("Ральф", "Василий Петрович", "здоров",true );
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(barsik);
        animals.add(pes);
        // System.out.println(animals);

        // System.out.println(musya.getType());
        // System.out.println(musya.getType("C arg "));
        // cat.hunt();
        // cat.toGo(); // вызывается из родительского класса
        // cat.fly(); // вызывается из переопределенного метода внутри класса Сat
        // cat.sweem(); // вызывается из переопределенного метода внутри класса Сat
        // System.out.println("___________________________");
        // Animal flyingFish = new FlyingFish();
        // flyingFish.fly();
        // flyingFish.toGo();
        // flyingFish.sweem();
        // System.out.println("___________________________");
        // Animal chicken = new Eagle();
        // chicken.fly();
        // chicken.toGo();
        // chicken.sweem();
        // String ownerEagle = chicken.ownerName = " Я вольная птица. У меня нет хозяина";
        // System.out.println(ownerEagle);
        // System.out.println("___________________________");

        //Семинар 2
        VetClinic clinic = new VetClinic();
        clinic.addNewAnimal(pes).addNewAnimal(barsik);
        
        for (Animal animal: clinic.getAnimals()) {
            animal.ill();
        }
        
        musya.canRun(20);

    }
}