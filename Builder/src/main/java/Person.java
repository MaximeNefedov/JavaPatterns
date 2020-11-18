public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        if (this.name == null || this.name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.surname = surname;
        if (this.surname == null || this.surname.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname).setAge(0).setAddress(this.address);
        return personBuilder;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
            System.out.println("С Днём Рождения! Вам: " + this.age);
        } else {
            System.out.println("Возраст не указан");
        }
    }

    public boolean hasAge() {
        if (this.age < 0) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (this.address == null || this.address.isEmpty()) {
            return false;
        }
        return true;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + showAge() +
                ", address='" + showAddress() + '\'' +
                '}';
    }

    private String showAge() {
        String output;
        if (hasAge()) {
            output = String.valueOf(this.age);
        } else {
            output = "Возраст неизвестен";
        }
        return output;
    }

    private String showAddress() {
        String output;
        if (hasAddress()) {
            output = String.valueOf(this.address);
        } else {
            output = "Адрес неизвестен";
        }
        return output;
    }
}
