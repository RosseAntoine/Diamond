import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiamondDrawerTest {
    @Test
    public void testNonLetterThrowsException() {
        DiamondDrawer diamondDrawer = new DiamondDrawer();
        Assertions.assertThrows(IllegalArgumentException.class, () -> diamondDrawer.drawDiamond('1'));
    }

    @Test
    public void testALetterReturnsTwoLinesString() {
        DiamondDrawer diamondDrawer = new DiamondDrawer();
        String diamond = diamondDrawer.drawDiamond('A');
        Assertions.assertEquals("A\nA", diamond);
    }
}
