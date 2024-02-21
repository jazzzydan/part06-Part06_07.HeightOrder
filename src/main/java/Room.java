import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    public Room() {
        this.persons = new ArrayList<>();
    }
    public void add(Person person) {
        persons.add(person);
    }
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person returnObject = this.persons.get(0);
        for (Person iterate : this.persons) {
            if (iterate.getHeight() < returnObject.getHeight()) {
                returnObject = iterate;
            }
        }
        return returnObject;
    }
    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person person = shortest();
        persons.remove(shortest());
        return person;
    }
}
