package pets_amok;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OrganicDogTest {
    OrganicDog underTest;

    @BeforeEach
    public void setUp() {
        underTest = new OrganicDog("Sweet Pea", "The Crown Prince of Demonia", 10, 10, 10, 10, 0, 4, true);
    }

    @Test
    public void hungerShouldDecreaseBy10WhenFed() {
        underTest.feed();
        int hungerLevel = underTest.getHungerLevel();
        assertEquals(0, hungerLevel);
    }

    @Test
    public void thirstShouldIncreaseBy2WhenFed() {
        underTest.feed();
        int thirstLevel = underTest.getThirstLevel();
        assertEquals(12, thirstLevel);
    }

    @Test
    public void happinessShouldIncreaseBy5WhenFed() {
        underTest.feed();
        int happinessLevel = underTest.getHappinessLevel();
        assertEquals(15, happinessLevel);
    }

    @Test
    public void healthShouldIncreaseBy5WhenFed() {
        underTest.feed();
        int healthLevel = underTest.getHealthLevel();
        assertEquals(15, healthLevel);
    }

    @Test
    public void haveToGoShouldIncreaseBy4WhenFed() {
        underTest.feed();
        int haveToGoLevel = underTest.getHaveToGoLevel();
        assertEquals(4, haveToGoLevel);
    }

    @Test
    public void hungerShouldDecreaseBy2WhenWatered() {
        underTest.water();
        int hungerLevel = underTest.getHungerLevel();
        assertEquals(8, hungerLevel);
    }

    @Test
    public void thirstShouldDecreaseBy10WhenWatered() {
        underTest.water();
        int thirstLevel = underTest.getThirstLevel();
        assertEquals(0, thirstLevel);
    }

    @Test
    public void happinessShouldIncreaseBy5WhenWatered() {
        underTest.water();
        int happinessLevel = underTest.getHappinessLevel();
        assertEquals(15, happinessLevel);
    }

    @Test
    public void healthShouldIncreaseBy5WhenWatered() {
        underTest.water();
        int healthLevel = underTest.getHealthLevel();
        assertEquals(15, healthLevel);
    }

    @Test
    public void haveToGoShouldIncreaseBy2WhenWatered() {
        underTest.water();
        int haveToGoLevel = underTest.getHaveToGoLevel();
        assertEquals(2, haveToGoLevel);
    }

    @Test
    public void shouldSoilTheCageWhenFed() {
        underTest.feed();
        underTest.soilTheCage();
        boolean cageIsClean = underTest.cageIsClean;
        assertFalse(cageIsClean);
    }

    @Test
    public void shouldCleanTheCage() {
        underTest.cleanTheCage();
        int haveToGoLevel = underTest.getHaveToGoLevel();
        assertEquals(haveToGoLevel, 0);
    }

    @Test
    public void isInCageShouldBeFalseWhenWalked() {
        underTest.walk();
        assertFalse(underTest.isInCage());
    }
}