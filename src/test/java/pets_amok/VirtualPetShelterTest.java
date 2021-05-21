package pets_amok;

import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;

    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetShelter();
    }

    OrganicDog organicDog1 = new OrganicDog("Sweet Pea", "The Crown Prince of Demonia", 10, 10, 10, 10, 0, 4, false);
    OrganicDog organicDog2 = new OrganicDog("Popeye", "He's Popeye the Sailor Man", 10, 10, 10, 10, 0, 4, false);
    OrganicCat organicCat1 = new OrganicCat("Liz", "Cat on a Hot Tin Roof", 10, 10, 10, 10, 0, 5);
    OrganicCat organicCat2 = new OrganicCat("Clint", "Go Ahead, Make My Day", 10, 10, 10, 10, 0, 5);
    RoboticDog roboticDog1 = new RoboticDog("Astro", "Space Dog", 10, 10, 10, false);
    RoboticDog roboticDog2 = new RoboticDog("RoboDog", "Loyal Friend", 10, 10, 10, false);
    RoboticCat roboticCat1 = new RoboticCat("Purrfect", "Purrfect is Perfect", 10, 10, 10);
    RoboticCat roboticCat2 = new RoboticCat("RoboCat", "All you need is love and a Robocat", 10, 10, 10);

@Test
public void shouldBeAbleToAddOneOrganicDog() {
underTest.add(organicDog1);
underTest.findVirtualPet("Sweet Pea");
assertEquals(organicDog1.petName, "Sweet Pea");
    }

    @Test
    public void shouldBeAbleToAddTwoOrganicDogs() {
        underTest.add(organicDog1);
        underTest.add(organicDog2);
        Collection<VirtualPet> addedDogs = underTest.getOrganicDogs();
        assertThat(addedDogs, containsInAnyOrder(organicDog1, organicDog2));
    }

    @Test
    public void shouldBeAbleToRemoveOneOrganicDog() {
        underTest.add(organicDog1);
        underTest.removeVirtualPet(organicDog1);
        Collection<VirtualPet> organicDogCollection = underTest.getOrganicDogs();
        assertTrue(organicDogCollection.isEmpty());
    }

    @Test
    public void shouldBeAbleToAddOneOrganicCat() {
        underTest.add(organicCat1);
        underTest.findVirtualPet("Liz");
        assertEquals(organicCat1.getPetName(), "Liz");
    }

    @Test
    public void shouldBeAbleToAddTwoOrganicCats() {
        underTest.add(organicCat1);
        underTest.add(organicCat2);
        Collection<VirtualPet> addedCats = underTest.getOrganicCats();
        assertThat(addedCats, containsInAnyOrder(organicCat1, organicCat2));
    }

    @Test
    public void shouldBeAbleToRemoveOneOrganicCat() {
        underTest.add(organicCat1);
        underTest.removeVirtualPet(organicCat1);
        Collection<VirtualPet> organicCatCollection = underTest.getOrganicCats();
        assertTrue(organicCatCollection.isEmpty());
    }

    @Test
    public void shouldBeAbleToAddOneRoboticDog() {
        underTest.add(roboticDog1);
        underTest.findVirtualPet("Astro");
        assertEquals(roboticDog1.getPetName(), "Astro");
    }

    @Test
    public void shouldBeAbleToAddTwoRoboticDogs() {
        underTest.add(roboticDog1);
        underTest.add(roboticDog2);
        Collection<VirtualPet> addedRoboticDogs = underTest.getRoboticDogs();
        assertThat(addedRoboticDogs, containsInAnyOrder(roboticDog1, roboticDog2));
    }

    @Test
    public void shouldBeAbleToRemoveOneRoboticDog() {
        underTest.add(roboticDog1);
        underTest.removeVirtualPet(roboticDog1);
        Collection<VirtualPet> roboticDogCollection = underTest.getRoboticDogs();
        assertTrue(roboticDogCollection.isEmpty());
    }

    @Test
    public void shouldBeAbleToAddOneRoboticCat() {
        underTest.add(roboticCat1);
        underTest.findVirtualPet("Purrfect");
        assertEquals(roboticCat1.getPetName(), "Purrfect");
    }

    @Test
    public void shouldBeAbleToAddTwoRoboticCats() {
        underTest.add(roboticCat1);
        underTest.add(roboticCat2);
        Collection<VirtualPet> addedRoboticCats = underTest.getRoboticCats();
        assertThat(addedRoboticCats, containsInAnyOrder(roboticCat1, roboticCat2));
    }

    @Test
    public void shouldBeAbleToRemoveOneRoboticCat() {
        underTest.add(roboticCat1);
        underTest.removeVirtualPet(roboticCat1);
        Collection<VirtualPet> roboticCatCollection = underTest.getRoboticCats();
        assertTrue(roboticCatCollection.isEmpty());
    }
}
