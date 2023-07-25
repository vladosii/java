import javax.xml.crypto.Data;

public class UltrasoundDoctor extends Doctor implements DoUltrasound, MakeDiapgnoses{

    public UltrasoundDoctor(String name, int experienceYears, Data workTime) {
        super(name, experienceYears, workTime);
        
    }

    @Override
    public void doUltrasound() {
        System.out.println("Сделаю УЗИ");
        
    }

    @Override
    public void makeDiapgnoses() {
        System.out.println("Поставлю диагноз ");
        
    }
    
}