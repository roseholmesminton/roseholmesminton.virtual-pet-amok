package pets_amok;

public class OrganicCat extends OrganicPet {


    public OrganicCat(String petName, String petDescription, int healthLevel, int hungerLevel, int thirstLevel, int happinessLevel, int haveToGoLevel, int wasteThreshold) {
        super(petName, petDescription, healthLevel, hungerLevel, thirstLevel, happinessLevel, haveToGoLevel, wasteThreshold);
    }

    public void emptyTheLitterBox() {
        litterBoxWasteLevel = 0;
    }

    public void checkTheLitterBox() {
        litterBoxWasteLevel += haveToGoLevel;
        if (litterBoxWasteLevel >= litterBoxOverflowLevel) {
            System.out.println("Oh No! The litter box is overflowing! There's cat waste everywhere! Game Over!");
            System.exit(0);
        } else if (litterBoxWasteLevel >= litterBoxWasteThreshold) {
            System.out.println("Time to empty the litter box!");
        }
        litterBoxStatus();
    }

    public void litterBoxStatus() {
        System.out.println("The Litter box waste level is " + litterBoxWasteLevel + ". Try to keep it below " + litterBoxWasteThreshold + ". If it goes over " + litterBoxOverflowLevel + " we're in trouble!");
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
                ", Bowel Level=" + haveToGoLevel +
                ", Cat will empty bowels at=" + wasteThreshold +
                '}';
    }
}