package projectjunit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ArmstrongTesting {

	@Test
    public void testIsArmstrong() {
        assertTrue(ArmstrongFunction.isArmstrong(153));
        assertTrue(ArmstrongFunction.isArmstrong(370));
        assertTrue(ArmstrongFunction.isArmstrong(371));
        assertTrue(ArmstrongFunction.isArmstrong(407));
        assertFalse(ArmstrongFunction.isArmstrong(123));
       
    }

}
