import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PersonValues pv = new PersonValues ();
        pv.addPersonArray ();
        try {
            pv.writePersonOutput ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        pv.readPeople ();

    }
}
