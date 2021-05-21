package pets_amok;

public class OrganicPet extends VirtualPet {
    public int hungerLevel;
    public int thirstLevel;
    public int happinessLevel;
    int haveToGoLevel;
    int wasteThreshold;
    public boolean cageIsClean;
    public int litterBoxWasteLevel;
    public int litterBoxWasteThreshold = 16;
    public int litterBoxOverflowLevel = 40;


    public OrganicPet(String petName, String petDescription, int healthLevel, int hungerLevel, int thirstLevel, int happinessLevel, int haveToGoLevel, int wasteThreshold) {
        super(petName, petDescription, healthLevel);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.happinessLevel = happinessLevel;
        this.haveToGoLevel = haveToGoLevel;
        this.wasteThreshold = wasteThreshold;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public int getHaveToGoLevel() {
        return haveToGoLevel;
    }

    @Override
    public void feed() {
        hungerLevel -= 10;
        thirstLevel += 2;
        healthLevel += 5;
        happinessLevel += 5;
        haveToGoLevel += 4;
    }

    @Override
    public void tick() {
        hungerLevel -= 1;
        thirstLevel -= 1;
        happinessLevel -= 1;
        healthLevel -= 1;
    }

    @Override
    public void water() {
        hungerLevel -= 2;
        thirstLevel -= 10;
        happinessLevel += 5;
        haveToGoLevel += 2;
    }

    @Override
    public void play() {
        hungerLevel += 5;
        thirstLevel += 5;
        happinessLevel += 5;
    }


    public void cleanTheCage() {
        haveToGoLevel = 0;

    }

    public void soilTheCage() {
        if (haveToGoLevel >= wasteThreshold) {
            cageIsClean = false;
        }
    }

    public void soilTheLitterBox() {
        if (haveToGoLevel >= wasteThreshold) {
            litterBoxWasteLevel += haveToGoLevel;
            haveToGoLevel = 0;
        }
    }

    @Override
    public String toString() {
        return "OrganicPet{" +
                "hungerLevel=" + hungerLevel +
                ", thirstLevel=" + thirstLevel +
                ", happinessLevel=" + happinessLevel +
                ", haveToGoLevel=" + haveToGoLevel +
                ", wasteThreshold=" + wasteThreshold +
                '}';
    }
}