import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiamondTest {
    @Test
    public void testNonLetterThrowsException() {
        Diamond diamond = new Diamond();
        Assertions.assertThrows(IllegalArgumentException.class, () -> diamond.drawDiamond('1'));
    }
}
