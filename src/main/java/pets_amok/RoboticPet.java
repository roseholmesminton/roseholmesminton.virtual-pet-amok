package pets_amok;

public class RoboticPet extends VirtualPet implements Walkable{
    public int maintenanceLevel;
    public int maintenanceLevelThreshold;

    public RoboticPet(String petName, String petDescription, int healthLevel, int maintenanceLevel, int maintenanceLevelThreshold) {
        super(petName, petDescription, healthLevel);
        this.maintenanceLevel = maintenanceLevel;
        this.maintenanceLevelThreshold = maintenanceLevelThreshold;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public int getMaintenanceLevelThreshold() {
        return maintenanceLevelThreshold;
    }

    public void oiled() {
        healthLevel += 10;
        maintenanceLevel += 10;
    }

    public void checkTheMaintenanceLevel() {
        if (maintenanceLevel <= 0) {
            maintenanceLevel = 0;
            System.out.println("At least one of your robotic pets is now rusted because their maintenance level went to 0. Game Over!");
            System.exit(0);
        }
        if (maintenanceLevel <= maintenanceLevelThreshold) {
            System.out.println("Time to oil your robotic pets!");
        }
    }
    @Override
    public void walk() {
        maintenanceLevel -= 2;
        healthLevel -= 2;
    }

    @Override
    public void play() {
        maintenanceLevel -=5;
    }

    @Override
    public void tick() {
        maintenanceLevel -= 2;
    }


    @Override
    public String toString() {
        return "RoboticPet{" +
                "petName='" + petName + '\'' +
                ", petDescription='" + petDescription + '\'' +
                ", healthLevel=" + healthLevel +
                ", maintenanceLevel=" + maintenanceLevel +
                ", maintenanceLevelThreshold=" + maintenanceLevelThreshold +
                '}';
    }
}

