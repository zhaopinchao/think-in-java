package nullobject;

public class Position {
    private String title;
    private Person person;
    public Position(String jobTitle, Person person){
        this.title = jobTitle;
        this.person = person;
        if(this.person == null){
            this.person = Person.NULL;
        }
    }

    public Position(String jobTitle){
        this.title = jobTitle;
        this.person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if(this.person == null){
            this.person = Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Person: " + this.title + " " + this.person;
    }
}
