package pets_amok;

public class OrganicDog extends OrganicPet implements Walkable {

    private boolean isInCage;

    public boolean isInCage() {
        return isInCage;
    }

    @Override
    public void soilTheCage() {
        if (haveToGoLevel >= wasteThreshold && isInCage) {
            cageIsClean = false;
        }
    }

    public OrganicDog(String petName, String petDescription, int healthLevel, int hungerLevel, int thirstLevel, int happinessLevel, int haveToGoLevel, int wasteThreshold, boolean isInCage) {
        super(petName, petDescription, healthLevel, hungerLevel, thirstLevel, happinessLevel, haveToGoLevel, wasteThreshold);
        this.isInCage = isInCage;
    }

    @Override
    public void walk() {
        isInCage = false;
        healthLevel += 5;
        hungerLevel += 5;
        thirstLevel += 2;
        happinessLevel += 5;
    }
    @Override
    public void tick(){
        isInCage = true;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + petName + '\'' +
                ", Type='" + petDescription + '\'' +
                ", Health=" + healthLevel +
                ", Hunger=" + hungerLevel +
                ", Thirst=" + thirstLevel +
                ", Happiness=" + happinessLevel +
                ", Waste Level=" + haveToGoLevel +
                ", Dog will soil the cage at=" + wasteThreshold +
                ", Dog is in the Cage=" + isInCage +
                '}';
    }
}

