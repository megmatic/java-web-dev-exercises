package officeHours;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String greetPerson() {
        return "Hi " + this.firstName.substring(0,1) + this.lastName + "!";
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            System.out.println("That's not a valid name");
            return;
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
