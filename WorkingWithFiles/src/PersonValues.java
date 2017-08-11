//import com.sun.java.util.jar.pack.Package;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonValues{
    ArrayList<Person> writePeople = new ArrayList();
    ArrayList<Person> readPeople = new ArrayList();
    List<String> lines = new ArrayList<> ();

    public void addPerson(Person p){
        writePeople.add(p);
    }

    public void addPersonArray(){

        this.addPerson (new Person ("Paul", "Software Developer", 33));
        this.addPerson (new Person ("Iain", "Project Manager", 34));
        this.addPerson (new Person ("Rebecca", "Beauty Therapist", 42));
        this.addPerson (new Person ("Sarah", "Receptionist", 27));
        this.addPerson (new Person ("Dodgy Dave", "Wheeler Dealer", 53));{
        };
    }

    public void writePersonOutput() throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/WorkingWithFiles.txt"));
            for (Person p : writePeople) {
                writer.write(p.toString());
                writer.newLine ();
            }

            writer.close();
        }
        catch (IOException ex){
            //Logger.getLogger(PersonValues.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

    public void readPeople (){
        try{
            BufferedReader reader = new BufferedReader (new FileReader ("src/WorkingWithFiles.txt"));
            String currentLine = reader.readLine ();

            while(currentLine != null){
                lines.add (currentLine);
                currentLine = reader.readLine ();
            }
        }
        catch(IOException e){

        }
    }
}


