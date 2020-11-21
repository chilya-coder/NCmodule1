package chimyrys;

import java.util.ArrayList;
import java.util.List;

public class Commander extends Human {
    private List<Soldier> soldiers = new ArrayList<Soldier>(3);
    private General general;
    private final String rank = "commander";

    public Commander(String name, int age) {
        super(name, age);

    }

    public void fight() {
        System.out.println("Piu piu piu!");
    }

    public void tell() {
        System.out.println("My name is " + getName() + ", my age is " + getAge());
        System.out.println("I work for " + general.getName());
        System.out.println("My rank is " + rank + "\n");

    }

    public void addSoldierToList(Soldier soldier) throws MilitaryException {
        if (soldiers.size() == 3) {
            throw new MilitaryException("Сommander has only 3 soldiers, not more!");
        }
        soldiers.add(soldier);
        soldier.setCommander(this);
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }
}
