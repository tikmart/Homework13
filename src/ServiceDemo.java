public class ServiceDemo {
    public static void main(String[] args) {
        UserService driver = new Driver("Karen", "Driver", 4568);
        UserService teacher = new Teacher("Ani", "Teacher", 8566);
        UserService bartender = new Bartender("Ashot", "Bartender", 1235);
        UserService developer = new Developer("David", "Developer", 5687);
        UserService mechanic = new Mechanic("Roman", "Mechaninc", 4552);


        Service.getService(driver);
    }
}
