package pets_amok;

public class RoboticDog extends RoboticPet {

    public RoboticDog(String petName, String petDescription, int healthLevel, int maintenanceLevel, int maintenanceLevelThreshold, boolean isBeingWalked) {
        super(petName, petDescription, healthLevel, maintenanceLevel, maintenanceLevelThreshold);
        this.isBeingWalked = isBeingWalked;
    }

    private boolean isBeingWalked;

    public boolean isBeingWalked() {
        return isBeingWalked;
    }

    @Override
    public void walk() {
        isBeingWalked = true;
        healthLevel -= 5;
        maintenanceLevel -= 5;
    }
    @ Override
    public void tick(){
        isBeingWalked = false;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + petName + '\'' +
                ", Type='" + petDescription + '\'' +
                ", Health=" + healthLevel +
                ", Oil Level=" + maintenanceLevel +
                ", Low Oil Indicator=" + maintenanceLevelThreshold +
                ", Dog Is Being Walked=" + isBeingWalked +
                '}';
    }
}



