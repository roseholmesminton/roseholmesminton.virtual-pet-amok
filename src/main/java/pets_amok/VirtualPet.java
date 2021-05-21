package pets_amok;

abstract class VirtualPet {
    protected String petName;
    protected String petDescription;
    protected int healthLevel;


    public String getPetName() {
        return petName;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public VirtualPet(String petName, String petDescription, int healthLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.healthLevel = healthLevel;
    }

    public void tick() {
        healthLevel -= 1;
    }

    public void feed() {
        healthLevel += 5;
    }

    public void water() {
        healthLevel += 5;
    }

    public void play() {
        healthLevel += 5;
    }

    public void walk() {
    }


    @Override
    public String toString() {
        return "VirtualPet{" +
                "petName='" + petName + '\'' +
                ", petDescription='" + petDescription + '\'' +
                ", healthLevel=" + healthLevel +
                '}';
    }
}







