import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class EuroTest {
    @Test
    public void Euro10shouldBeSameEuro10() {
        Euro ten1 = new Euro(10);
        Euro ten2 = new Euro(10);
        assertEquals(ten1, ten2);
    }

    @Test
    public void Euros10ShouldNotbeSame5() {
        Euro ten = new Euro(10);
        Euro five = new Euro(5);
        assertNotEquals(ten, five);
    }

    @Test
    public void Euro10ShouldNotEqualsNull() {
        assertNotEquals(new Euro(10), null);
    }

    @Test
    public void Euro10ShouldNotEqualToNonEuro() {
        assertNotEquals(new Euro(10), new Object());
    }

    @Test
    public void Euro10ShouldNotEqualTo7EuroAnd3Euro() {
        assertEquals(new Euro(10), new Euro(7).add(new Euro(3)));
    }

    @Test
    public void euro10ShouldNotbeEqualtoPlus2() {
        assertNotEquals(new Euro(10), new Euro(5).add(new Euro(2)));
    }

    @Test
    public void euro10ShouldNotbeEqualtoDollar10() {
        assertNotEquals(new Euro(10), new Dollar(10));
    }

    @Test
    public void euro10ShouldBeEqualToDollar13_5() {
        assertEquals(new Euro(10), new Dollar(13.5));

    }
}
