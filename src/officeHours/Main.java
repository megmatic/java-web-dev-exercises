package officeHours;

public class Main {

    public static void main(String[] args) {
        Person meg = new Person("Meg", "Todd");
        meg.setFirstName(null);
        System.out.println(meg.greetPerson());
        System.out.println(meg.getFirstName());
    }


}
