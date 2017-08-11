public class Person {
    private String name;
    private String occupation;
    private int age;

    public String getName() {

        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person (String name, String occupation, int age){
        this.name =  name;
        this.occupation = occupation;
        this.age = age;
    }

    @Override
    public String toString() {

        return "Name: "+this.name+", Occupation: "+this.occupation+", Age: "+age;

    }

}
