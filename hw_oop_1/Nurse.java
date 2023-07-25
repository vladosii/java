import javax.xml.crypto.Data;

public class Nurse extends Doctor implements DoInjection {

    public Nurse(String name, int experienceYears, Data workTime) {
        super(name, experienceYears, workTime);
        
    }
    @Override
    public void doInjection() {
       System.out.println("Делаю уколы");
        
    }
    
}