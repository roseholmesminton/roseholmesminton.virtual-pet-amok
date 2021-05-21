package pets_amok;


public class RoboticCat extends RoboticPet {


    public RoboticCat(String petName, String petDescription, int healthLevel, int maintenanceLevel, int maintenanceLevelThreshold) {
        super(petName, petDescription, healthLevel, maintenanceLevel, maintenanceLevelThreshold);

    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + petName + '\'' +
                ", Type='" + petDescription + '\'' +
                ", Health=" + healthLevel +
                ", Oil=" + maintenanceLevel +
                ", Low Oil Indicator=" + maintenanceLevelThreshold +
                '}';
    }
}
