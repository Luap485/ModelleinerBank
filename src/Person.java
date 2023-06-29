import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    String Name;
    int Pin;

    public Person(int newPin, String newName) {
        this.Name = newName;
        this.Pin = newPin;
    }
}