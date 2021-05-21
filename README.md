# Virtual Pets Amok

VirtualPet Amok

My Approach.

Organic Pets -
Organic Pets Health increases when played with, fed, walked and watered.
When organic pets are given water hunger goes down.
When organic pets are fed thirst increases.
On tick, there is a decrease in health and happiness and there is an increase in hunger and thirst.

Robotic Pets -
Robotic pets health and oil level decreases when walked and played with.
On tick, there is a slight decrease in health and oil level.
If the oil level goes to 0, the robotic pet rusts, is thrown away and the game is over.

Organic Dogs -
Organic dogs soil their cages each time they are fed.
There is one dog per cage.
I decreased their health and happiness if the waste in the cage went over a certain level. 
As the waste level went higher and higher the health of the organic dog decreased.
If the waste level went over 40, meaning they had soiled the cage over 10 times, the game is over.

Organic Cats -
Organic cats go to the litter box each time they are fed.
I decreased the health and happiness of the organic cat after the litter box waste went over a certain level.
As the waste in the litter box got worst and worst, the health and happiness of the organic cat decreased every time 
they used it. 

Litter Box -
The litter box is communal and should be kept below a 16 waste level. Each time a cat soils the litter box the 
waste level increases by 4.
If the waste level in the litter box reaches 40, the litter box overflows and the game is over.

I started by using the VirtualPetShelterTest from my VirtualPetShelter App to help me build VirtualPet Amok app.

These are just some of the things I tested:

Adding One OrganicDog to the VirtualPetShelter
Adding Two OrganicDogs to the VirtualPetShelter
Adding One Organic Dog and One Organic Cat to the VirtualPetShelter
Removing an OrganicDog from the VirtualPetShelter
Adding One RoboticDog to the VirtualPetShelter
Adding Two RoboticDogs to the Virtual PetShelter
Adding One RoboticDog and One RoboticCat to the VirtualPetShelter
Removing one RoboticPet from the VirtualPetShelter
Feed OrganicPets
Water OrganicPets
Walk OrganicDogs
Walk Robotic Dogs
Oil Robotic Pets

These tests helped me to create my app because I had to create a method for each test.
If I had more time...I would add the happiness attribute to the virtual pet so that I could reduce happiness for robotic
pets if they were not oiled well enough. I would also, end the game when any pet's stats went negative.





