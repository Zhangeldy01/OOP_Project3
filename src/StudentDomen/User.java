package StudentDomen;

/**
 * Класс, представляющий пользователя системы.
 */
public class User {

    /** Поля пользователя */
    private String firstName;
    private String secondName;
    private int age;
    private String address;

    /**
     * Конструктор класса User.
     * @param firstName Имя пользователя
     * @param secondName Фамилия пользователя
     * @param age Возраст пользователя
     * @param address Адрес пользователя
     */
    public User(String firstName, String secondName, int age, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    /**
     * Метод для получения имени пользователя.
     * @return Имя пользователя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Метод для установки имени пользователя.
     * @param firstName Имя пользователя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Метод для получения фамилии пользователя.
     * @return Фамилия пользователя
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Метод для установки фамилии пользователя.
     * @param secondName Фамилия пользователя
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Метод для получения возраста пользователя.
     * @return Возраст пользователя
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для установки возраста пользователя.
     * @param age Возраст пользователя
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Метод для получения адреса пользователя.
     * @return Адрес пользователя
     */
    public String getAddress() {
        return address;
    }

    /**
     * Метод для установки адреса пользователя.
     * @param address Адрес пользователя
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Переопределенный метод toString() для вывода информации о пользователе.
     * @return информация о пользователе в виде строки
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName = " + firstName + '\'' +
                ", secondName = " + secondName + '\'' +
                ", age = " + age + '\'' +
                ", address = " +
                "}";
    }
}
