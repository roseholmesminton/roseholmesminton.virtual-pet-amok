package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> virtualPetList = new HashMap<>();

    public void add(VirtualPet virtualPetToAdd) {
        virtualPetList.put(virtualPetToAdd.getPetName(), virtualPetToAdd);
    }

    public VirtualPet findVirtualPet(String petName) {
        return virtualPetList.get(petName);
    }

    public Collection<VirtualPet> getRoboticDogs() {
        Collection<VirtualPet> roboticDogList = new ArrayList<>();
        for (VirtualPet pet : virtualPetList.values()) {
            if (pet instanceof RoboticDog) {
                roboticDogList.add(pet);
            }
        }
        return roboticDogList;
    }

    public Collection<VirtualPet> getRoboticCats() {
        Collection<VirtualPet> roboticCatList = new ArrayList<>();
        for (VirtualPet pet : virtualPetList.values()) {
            if (pet instanceof RoboticCat) {
                roboticCatList.add(pet);
            }
        }
        return roboticCatList;
    }

    public Collection<VirtualPet> getOrganicCats() {
        Collection<VirtualPet> organicCatList = new ArrayList<>();
        for (VirtualPet pet : virtualPetList.values()) {
            if (pet instanceof OrganicCat) {
                organicCatList.add(pet);
            }
        }
        return organicCatList;
    }

    public Collection<VirtualPet> getOrganicDogs() {
        Collection<VirtualPet> organicDogList = new ArrayList<>();
        for (VirtualPet pet : virtualPetList.values()) {
            if (pet instanceof OrganicDog) {
                organicDogList.add(pet);
            }
        }
        return organicDogList;
    }

    public void removeVirtualPet(VirtualPet virtualPetToRemove) {
        virtualPetList.remove(virtualPetToRemove.getPetName());
    }

    public void feedOrganicPets() {
        int dogWasteCounter = 0;
        int catWasteCounter = 0;
        for (VirtualPet pet : virtualPetList.values()) {
            if (pet instanceof OrganicPet) {
                pet.feed();
            }
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).soilTheCage();
                dogWasteCounter++;
                if (((OrganicDog) pet).haveToGoLevel > 40) {
                    System.out.println("You have had several warnings about the high waste levels in the dog cages! Game over.");
                    System.exit(0);
                } else if (((OrganicDog) pet).haveToGoLevel > 32) {
                    pet.healthLevel -= 10;
                    ((OrganicDog) pet).happinessLevel -= 10;
                    System.out.println("Time to clean the dog cages. The waste level is too high and health and happiness for " + pet.petName + " has gone down significantly");
                } else if (((OrganicDog) pet).haveToGoLevel > 16) {
                    pet.healthLevel -= 5;
                    ((OrganicDog) pet).happinessLevel = -5;
                    System.out.println("Time to clean the dog cages. The waste level is too high and health and happiness for " + pet.petName + " has gone down even more");
                } else if (((OrganicDog) pet).haveToGoLevel > 8) {
                    pet.healthLevel -= 2;
                    ((OrganicDog) pet).happinessLevel -= 2;
                    System.out.println("Time to clean the dog cages. The waste level is too high and health and happiness for " + pet.petName + " went down a little");
                }
            }

            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).soilTheLitterBox();
                ((OrganicCat) pet).checkTheLitterBox();
                catWasteCounter++;
                if (((OrganicCat) pet).litterBoxWasteThreshold > 32) {
                    System.out.println("The waste level in the litter box is too high. " + pet.petName + "'s health and happiness went down significantly after using it.");
                    ((OrganicCat) pet).happinessLevel -= 10;
                } else if (((OrganicCat) pet).litterBoxWasteThreshold > 24) {
                    System.out.println("The waste level in the litter box is so high that " + pet.petName + "'s health and happiness went down even lower after using it.");
                    ((OrganicCat) pet).happinessLevel -= 5;
                    pet.healthLevel -= 5;
                } else if (((OrganicCat) pet).litterBoxWasteLevel > 16) {
                    System.out.println("The waste level in the litter box is high. " + pet.petName + "'s health and happiness went down a little bit after using it.");
                    ((OrganicCat) pet).happinessLevel -= 2;
                    pet.healthLevel -= 2;
                }

            }
        }
            if (dogWasteCounter >= 1) {
                System.out.println(dogWasteCounter + " dog(s) soiled their cage");
            }
            if (catWasteCounter >= 1) {
                System.out.println(catWasteCounter + " cat(s) soiled the litter box");

            }

        }

        public void waterOrganicPets () {
            for (VirtualPet pet : virtualPetList.values()) {
                if (pet instanceof OrganicPet) {
                    pet.water();
                }
            }
        }

        public void showPets () {
            for (VirtualPet pet : virtualPetList.values()) {
                System.out.println(pet.toString());
            }
        }

        public void tick () {
            for (VirtualPet pet : virtualPetList.values()) {
                pet.tick();
            }
            for (VirtualPet pet : virtualPetList.values()) {
                if (pet instanceof RoboticPet) {
                    ((RoboticPet) pet).checkTheMaintenanceLevel();
                }
            }
        }

        public void cleanTheCage () {
            for (VirtualPet pet : virtualPetList.values()) {
                if (pet instanceof OrganicDog) {
                    ((OrganicDog) pet).cleanTheCage();
                }
            }
            System.out.println("All dog cages are now clean");
        }

        public void oilRoboticPets () {
            for (VirtualPet pet : virtualPetList.values()) {
                if (pet instanceof RoboticPet) {
                    ((RoboticPet) pet).oiled();
                }
            }
            System.out.println("All robotic pets have been oiled");
        }

        public void walkTheDogs () {
            for (VirtualPet dog : virtualPetList.values()) {
                if (dog instanceof Walkable) {
                    dog.walk();
                }
            }
        }

        public void playWithPets () {
            for (VirtualPet pet : virtualPetList.values()) {
                pet.play();
            }
        }

        public void emptyTheLitterBox () {
            for (VirtualPet pet : virtualPetList.values()) {
                if (pet instanceof OrganicCat) {
                    ((OrganicCat) pet).emptyTheLitterBox();
                }
            }
        }

        public void playWithOnePet (String playWithOnePetName){
            virtualPetList.get(playWithOnePetName).play();
            System.out.println("You played with " + virtualPetList.get(playWithOnePetName).petName + " That made them very happy.");
        }
    }

