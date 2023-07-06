public class Kunde extends Person {
        Kunde aktKonto;

        private Kunde aktKonto;
        private double kontostand;

        KUNDE(String name, int id){
                this.name = name;
                this.id = id;}

        public String getName() {
                return name;}

        double KontostandGeben(){
                return kontostand;
        }

        void Einzahlen(double Menge){
                kontostand += Menge;
                System.out.println("Erfolgreich Eingezahlt: " + Menge)
        }

        boolean Abheben(double){
                if (Menge <= kontostand) {
                        kontostand -= Menge;
                        System.out.println("Erfolgreich abgehoben: " + Menge);
                        return true;
                } else {
                        System.out.println("Kein Geld vorhanden.");
                        return false;
                }
        }
        //Müssen wir noch machen
        AUSZUGSEINTRAG AuszugsdatenErstellen(){
                 //accountStatement.Auszugsdaten("Konto Besitzer: " + getName());
                // accountStatement.Auszugsdaten("Kontostand: " + getKontostand());

                return accountStatement;
        }

        boolean AktkontoSetzen(int Kontonummer){

                if (Kontonummer == 12345) {
                        AktKonto = this;
                        return true;
                } else {
                        return false;
                }
        }
}