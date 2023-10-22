public class Person {
    public void personInfo(String name, String surname, String city, String number) {
        String PersonInfo = "Зателефонувати громадянину " + name + surname + "із міста " + city + "можна за номером " + number + ".";
        System.out.println(PersonInfo);
    }

    public static void personInfoStatic(String name, String surname, String city, String number) {
        String PersonInfoStatic = "Зателефонувати громадянину " + name + surname + "із міста " + city + "можна за номером " + number + ".";
        System.out.println(PersonInfoStatic);
    }
}

