package chimyrys;

public class Soldier extends Human {
    private Commander commander;
    private final String rank = "soldier";

    public Soldier(String name, int age) {
        super(name, age);
    }

    public void fight() {
        System.out.println("Tru tu tu tu!");
    }

    public void tell() {
        System.out.println("My name is " + getName() + ", my age is " + getAge());
        System.out.println("I work for " + commander.getName());
        System.out.println("My rank is " + rank + "\n");
    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    public String getRank() {
        return rank;
    }

}
