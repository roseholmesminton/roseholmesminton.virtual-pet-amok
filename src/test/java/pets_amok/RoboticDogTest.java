package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoboticDogTest {
    RoboticDog underTest;

    @BeforeEach
    public void setUp() {
        underTest = new RoboticDog("Astro","Space Dog",5,5, 5, false);
    }
    @Test
    public void shouldIncreaseHealthBy10WhenOiled() {
        underTest.oiled();
        int healthLevel = underTest.getHealthLevel();
        assertEquals(healthLevel, 15);
    }

    @Test
    public void shouldIncreaseMaintenanceBy10WhenOiled() {
        underTest.oiled();
        int maintenanceLevel = underTest.getMaintenanceLevel();
        assertEquals(maintenanceLevel, 15);
    }

    @Test
    public void shouldCheckTheMaintenanceLevelOfTheRoboticCat() {
        underTest.checkTheMaintenanceLevel();
        int maintenanceLevelThreshold = underTest.getMaintenanceLevelThreshold();
        assertEquals(maintenanceLevelThreshold, 5);
    }
    @Test
    public void maintenanceLevelAndHealthLevelShouldDecreaseBy2WhenWalked(){
        underTest.walk();
        int maintenanceLevel = underTest.getMaintenanceLevel();
        boolean isBeingWalked = underTest.isBeingWalked();
        int healthLevel = underTest.getHealthLevel();
        underTest.checkTheMaintenanceLevel();
        assertEquals(healthLevel, 3);
        assertEquals(maintenanceLevel, 3);
        assertTrue(isBeingWalked);
    }
}
