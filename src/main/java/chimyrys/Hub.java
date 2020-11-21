package chimyrys;


public class Hub {
    public static void main(String[] args) throws MilitaryException {
        Human [] people = new Human[9];
        for (int i = 0; i < 6; ++i) {
            people[i] = new Soldier("Soldier#" + i, i + 20);
        }
        Commander commander1 = new Commander("commander1", 40);
        Commander commander2 = new Commander("commander2", 50);
        people[6] = commander1;
        people[7] = commander2;
        General general = new General("general", 60);
        people[8] = general;
        commander1.addSoldierToList((Soldier)people[0]);
        commander1.addSoldierToList((Soldier)people[1]);
        commander1.addSoldierToList((Soldier)people[2]);
        commander2.addSoldierToList((Soldier)people[3]);
        commander2.addSoldierToList((Soldier)people[4]);
        commander2.addSoldierToList((Soldier)people[5]);
        general.addCommanderToList(commander1);
        general.addCommanderToList(commander2);
        for (Human h : people) {
            try {
                h.tell();
                h.fight();
            } catch (MilitaryException e) {
                System.out.println("Smth went wrong");
            }
        }
    }
}
