import javax.xml.crypto.Data;

public class Therapist  extends Doctor implements DoInjection, MakeDiapgnoses{

    public Therapist(String name, int experienceYears, Data workTime) {
        super(name, experienceYears, workTime);
        
    }

    @Override
    public void doInjection() {
       System.out.println("Делаю уколы");
        
    }

    @Override
    public void makeDiapgnoses() {
        System.out.println("Поставлю диагноз ");
        
    }
    
}