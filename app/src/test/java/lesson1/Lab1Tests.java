package lesson1.labs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Lab1Tests {
    @Test void canName() {
        Lab1 lab = new Lab1();
        assertNotNull(lab.name, "name has not been defined");
    }

    @Test void canAge() {
        Lab1 lab = new Lab1();
        assertNotNull(lab.age, "age has not been defined");
    }

    @Test void canHeight() {
        Lab1 lab = new Lab1();
        assertNotNull(lab.height, "height has not been defined");
    }

    @Test void canHasPhone() {
        Lab1 lab = new Lab1();
        assertNotNull(lab.hasPhone, "hasPhone has not been defined");
    }
}
