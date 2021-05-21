package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticCatTest {
    RoboticCat underTest;

    @BeforeEach
    public void setUp() {
        underTest = new RoboticCat("Purrfect", "Purrfect is Perfect", 5, 5, 5);
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
}
