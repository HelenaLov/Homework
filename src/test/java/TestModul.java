import Metod.ModulMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModul {
    @Test
    public void TestModul() {
        ModulMethod modulMethods = new ModulMethod();
        Assert.assertEquals(modulMethods.modul(-7), 5);
    }

    @Test
    public void modulNewTest() {
        ModulMethod modulMethods = new ModulMethod();
        Assert.assertEquals(modulMethods.modul(7), 2);
    }
}
