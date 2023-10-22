public class Lesson07 {
    public static void main(String[] args) {
        Person person = new Person();

        Person.personInfoStatic("Will ", "Smith ", "New York ", "2936729462846");
        Person.personInfoStatic("Jackie ", "Chan ", "Shanghai ", "12312412412");
        Person.personInfoStatic("Sherlock ", "Holmes ", "London ", "37742123513");

        System.out.println();

        person.personInfo("Will ", "Smith ", "New York ", "2936729462846");
        person.personInfo("Jackie ", "Chan ", "Shanghai ", "12312412412");
        person.personInfo("Sherlock ", "Holmes ", "London ", "37742123513");
    }
}