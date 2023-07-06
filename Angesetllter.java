import java.util.ArrayList;
import java.util.List;
public class Angestellter extends Person{
    private KUNDE aktKunde;
    private BANK bank;
    private Konto aktKonto;
    private List<Angestellter> Angestellter;
    private List<Angestellter> Kunden;
    public Angestellter(String name, int id, Bank Bank){
        this.name = name;
        this.id = id;
        this.bank = bank;
        this.Angestellter = new ArrayList<>();
        this.Kunden = new ArrayList<>();
    }
    ANGESTELLTER(String, int, BANK){}
    int SparkontoEinrichten(double Betragsgröße){}
    int GirokontoEinrichten(double){}

    boolean KontoLoeschen(){}
    String AngestelltenLoeschen(String){}

    AUSZUGSEINTRAG AuszugsdatenErstellen(){}
    public boolean KundeWaehlen(String Kundenname{}
    String Neuenkunden Einrichten(String, int ){
        Kunde newKunde = new Kunde (name, id);
        Kunde.add(newKunde);
        return "New customer created with name: " + name + " and ID: " + id;
    }
    KUNDE AktkundeGebent(){}
    void KontoSetzen(int Kontennummer){
        if (accountBalances.containsKey(Kontonummer)) {
            currentAccount = accountNumber;
        } else {
            System.out.println("Account does not exist.");
        }

    }
    String KundenLoeschen(){
        public String deleteCustomer() {
            if (Kunden.remove(getCurrentKunde())) {
                return "Customer deleted.";
            }
            return "Customer not found.";
        }
    }
    String NeuenAngestellterEinrichten(String Name, int id){
        Angestellter=new.Angestellter=new Angestellter(name, id);
        return "New customer created with name: " + name + " and ID: " + id;
    }

}