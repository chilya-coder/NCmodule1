package chimyrys;

import java.util.ArrayList;
import java.util.List;

public class General extends Human {
    private List<Commander> commanders = new ArrayList<Commander>(2);
    private final String rank = "general";

    public General(String name, int age) {
        super(name, age);
    }

    public void fight() throws MilitaryException {
        throw new MilitaryException("I don't fight, i give commands!");
    }

    public void tell() {
        System.out.println("I don't want to talk with you, unless you fight!");
        System.out.println("My rank is " + rank + "\n");
    }

    public void addCommanderToList(Commander commander) throws MilitaryException {
        if (commanders.size() == 2) {
            throw new MilitaryException("General has only 2 commanders, not more!");
        }
        commanders.add(commander);
        commander.setGeneral(this);
    }
}
