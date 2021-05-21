package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userChoice;
        String userName;
        boolean keepPlaying = true;

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

        OrganicDog pet1 = new OrganicDog("Sweet Pea", "organic dog", 30, 30, 30, 30, 0, 4, true);
        OrganicCat pet2 = new OrganicCat("Ham Gravy", "organic cat", 32, 32, 32, 32, 0, 4);
        RoboticDog pet3 = new RoboticDog("Olive Oyl", "robotic dog", 30, 40, 5, false);
        RoboticCat pet4 = new RoboticCat("Professor", "robotic cat", 23, 40, 5);

        myVirtualPetShelter.add(pet1);
        myVirtualPetShelter.add(pet2);
        myVirtualPetShelter.add(pet3);
        myVirtualPetShelter.add(pet4);

        System.out.println("Thank you for volunteering at The Pets Amok Pet Shelter!  Please enter your first name:");
        userName = input.nextLine();
        System.out.println("Welcome " + userName);
        System.out.println("   A; ;A");
        System.out.println("  ={ t.}=");

        while (keepPlaying) {

            System.out.println("Here's  the status of our pets:" + "\n");
            myVirtualPetShelter.showPets();
            System.out.println("\n" + "What would you like to do?" + "\n");
            System.out.println("1.  Feed the organic pets" + "\n" + "2.  Water the organic pets" + "\n" + "3.  Oil the Robotic Pets" + "\n" + "4.  Play with all the pets in the Pet Shelter" + "\n" + "5.  Play with one pet in the Pet Shelter" + "\n" + "6.  Adopt a pet" + "\n" + "7.  Admit a pet" + "\n" + "8.  Walk all dogs" + "\n" + "9.  Clean the dirty dog cages" + "\n" + "10. Empty and clean the litter box" + "\n" +  "11. Exit");

            userChoice = input.nextLine();

            if (userChoice.equals("1")) {
                myVirtualPetShelter.feedOrganicPets();

            } else if (userChoice.equals("2")) {
                myVirtualPetShelter.waterOrganicPets();
                System.out.println("All organic pets were given water");

            } else if (userChoice.equals("3")) {
                myVirtualPetShelter.oilRoboticPets();

            } else if (userChoice.equals("4")) {
                myVirtualPetShelter.playWithPets();
                System.out.println("You played with all the pets!");

            } else if (userChoice.equals("5")) {
                System.out.println("Enter the name of the pet you wish to play with");
                String petName = input.nextLine();
                if (myVirtualPetShelter.virtualPetList.containsValue(myVirtualPetShelter.findVirtualPet(petName))) {
                    myVirtualPetShelter.playWithOnePet(petName);
                } else {
                    System.out.println("Sorry, we do not have a pet by that name in the Pet shelter" + "\n");
                }

            } else if (userChoice.equals("6")) {
                System.out.println("Enter the name of the pet you wish to adopt");
                String petName = input.nextLine();
                if (myVirtualPetShelter.virtualPetList.containsValue(myVirtualPetShelter.findVirtualPet(petName))) {
                    myVirtualPetShelter.removeVirtualPet(myVirtualPetShelter.findVirtualPet(petName));
                } else {
                    System.out.println("Sorry, we do not have a pet by that name in the Pet shelter" + "\n");
                }

            } else if (userChoice.equals("7")) {
                System.out.println("What type of pet do you wish to admit?" + "\n" + "1.  Organic Dog" + "\n" + "2.  Organic Cat" + "\n" + "3.  Robotic Dog" + "\n" + "4.  Robotic Cat");
                String petType = input.nextLine();
                System.out.println("Enter the Name of the pet you wish to admit");
                String userPetName = input.nextLine();

                if (petType.equals("1")) {
                    OrganicDog admitAPet = new OrganicDog(userPetName, "organic dog", 40, 40, 40, 40, 0, 4, true);
                    myVirtualPetShelter.add(admitAPet);
                } else if (petType.equals("2")) {
                    OrganicCat admitAPet = new OrganicCat(userPetName, "organic cat", 40, 40, 40, 40, 0, 4);
                    myVirtualPetShelter.add(admitAPet);
                } else if (petType.equals("3")) {
                    RoboticDog admitAPet = new RoboticDog(userPetName, "robotic dog", 40, 40, 5, false);
                    myVirtualPetShelter.add(admitAPet);
                } else if (petType.equals("4")) {
                    RoboticCat admitAPet = new RoboticCat(userPetName, "robotic cat", 40, 40, 5);
                    myVirtualPetShelter.add(admitAPet);
                    System.out.println("You just admitted " + userPetName + " to our Pet Shelter." + "\n");
                } else {
                    System.out.println("Invalid pet type");
                }

            } else if (userChoice.equals("8")) {
                myVirtualPetShelter.walkTheDogs();
                System.out.println("The Organic and Robotic Dogs were walked and returned.");
            } else if (userChoice.equals("9")) {
                myVirtualPetShelter.cleanTheCage();
            } else if (userChoice.equals("10")) {
                myVirtualPetShelter.emptyTheLitterBox();
            } else if (userChoice.equals("11")) {
                keepPlaying = false;
                System.out.println("Thank you for volunteering at the Pets Amok Pet Shelter today " + userName + "!");
                System.exit(0);

            } else {
                System.out.println("Oh no " + userName + "! The Pets Amok Pet Shelter caught on fire! Game over.");
                System.exit(0);
            }
            myVirtualPetShelter.tick();
        }
        input.close();
    }
}



