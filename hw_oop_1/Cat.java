public class Cat extends Animal implements Soundable, Ilable, Runable  {
    private int countPaws;
    
    
    
    public Cat (){
        this("Max",null,null, false, 4);
    }
    public Cat (String animal, String ownerName, String diagnosis, Boolean isVaccinated, int countPaws ){
        super( animal, ownerName,diagnosis,  isVaccinated);
        this.countPaws = countPaws;

    }
    private void wakeUp (){
        System.out.println("Кот проснулся");
    }
    private void findFood (){
        System.out.println("Кот нашел еду");
    }
    private void eat (){
        System.out.println("Кот поел");
    }
    private void sleep (){
        System.out.println("Кот уснул");
    }
   public void hunt(){
    
    wakeUp(); 
    findFood ();
    eat ();
    sleep();
   }
  

     @Override
    public void sweem() {
       System.out.println(" Я не умею плавать! Держи меня подальше от воды"); 
    }
    @Override
    public void ill(){
        System.out.println("Я могу лечиться ");
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
    @Override
    public void canRun(int speed) {
        System.out.println("Я бегаю со скоростью " + speed);
        
    }


}