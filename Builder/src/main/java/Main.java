public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Max")
                .setSurname("Nefedov")
                .setAge(22)
                .setAddress("SPb")
                .build();

        System.out.println(person);

        System.out.println(person.hasAge());

        person.happyBirthday();

        boolean b = person.hasAddress();
        if (!b) {
            System.out.println("Адрес не узнан. Текущий адрес указан как: " + person.getAddress());
        } else {
            System.out.println("Текущий адрес: " + person.getAddress());
        }

        Person son = person.newChildBuilder().setName("Alex").build();
        System.out.println(son.toString());
    }
}
