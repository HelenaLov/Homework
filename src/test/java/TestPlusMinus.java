import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPlusMinus {
    @Test
    public void TestPlusPositive() {
        PlusMinusMethod plusMinusMethod = new PlusMinusMethod();
        Assert.assertTrue(10 == plusMinusMethod.plus(7, 3));
    }

    @Test
    public void TestPlusNegative() {
        PlusMinusMethod plusMinusMethod = new PlusMinusMethod();
        Assert.assertFalse(10 == plusMinusMethod.plus(7, 7));
    }

    @Test
    public void TestMinusPositive() {
        PlusMinusMethod plusMinusMethod = new PlusMinusMethod();
        Assert.assertTrue(10 == plusMinusMethod.minus(13, 3));
    }

    @Test
    public void TestMinusNegative() {
        PlusMinusMethod plusMinusMethod = new PlusMinusMethod();
        Assert.assertFalse(10 == plusMinusMethod.minus(23, 3));
    }
}
