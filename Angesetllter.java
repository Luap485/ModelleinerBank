import java.util.ArrayList;
import java.util.List;
public class Angestellter extends Person{
    private KUNDE aktKunde;
    private BANK bank;
    private Konto aktKonto;
    private List<Angestellter> Angestellter;

    public Angestellter(String name, int id, Bank Bank){
        this.name = name;
        this.id = id;
        this.bank = bank;
        this.Angestellter = new ArrayList<>();

    }
    ANGESTELLTER(String, int, BANK){}
    int SparkontoEinrichten(double){}
    int GirokontoEinrichten(double){}

    boolean KontoLoeschen(){}
    String AngestelltenLoeschen(String){}

    AUSZUGSEINTRAG AuszugsdatenErstellen(){}
    boolean KundeWaehlen(String){}
    String Neuenkunden Einrichten(String, int ){}
    KUNDE AktkundeGebent(){}
    void KontoSetzen(int){}
    String KundenLoeschen(){}
    String NeuenAngestellterEinrichten(String Name, int id){
        Angestellter=new.Angestellter=new Angestellter(name, id)
        return "New customer created with name: " + name + " and ID: " + id;
    }

}