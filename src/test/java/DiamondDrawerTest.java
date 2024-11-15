import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiamondDrawerTest {
    @Test
    public void testNonLetterThrowsException() {
        DiamondDrawer diamondDrawer = new DiamondDrawer();
        Assertions.assertThrows(IllegalArgumentException.class, () -> diamondDrawer.drawDiamond('1'));
    }

    @Test
    public void testALetterReturnsAccordingDiamond() {
        DiamondDrawer diamondDrawer = new DiamondDrawer();
        String diamond = diamondDrawer.drawDiamond('A');
        Assertions.assertEquals("A\nA", diamond);
    }

    @Test
    public void testCLetterReturnsAccordingDiamond() {
        DiamondDrawer diamondDrawer = new DiamondDrawer();
        String diamond = diamondDrawer.drawDiamond('C');
        Assertions.assertEquals("A\nB B\nC   C\nB B\nA", diamond);
    }

    @Test
    public void testGLetterReturnsAccordingDiamond() {
        DiamondDrawer diamondDrawer = new DiamondDrawer();
        String diamond = diamondDrawer.drawDiamond('G');
        Assertions.assertEquals("A\n" +
                        "B B\n" +
                        "C   C\n" +
                        "D     D\n" +
                        "E       E\n" +
                        "F         F\n" +
                        "G           G\n" +
                        "F         F\n" +
                        "E       E\n" +
                        "D     D\n" +
                        "C   C\n" +
                        "B B\n" +
                        "A",
                diamond);
    }
}
