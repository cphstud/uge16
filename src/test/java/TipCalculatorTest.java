import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TipCalculatorTest {
    TipCalculator tipCalculator;
    String country;
    String service;
    double amount;

    @Before
    public void setUp() throws Exception {
        tipCalculator = TipCalculator.getInstance();
        country="Denmark";
        service="Restaurent";
        amount = 432.23;
    }

    @Test
    public void returnTips() {
        double expected = 54.2;
        double actual = tipCalculator.returnTips(country,service,amount);
        assertEquals(expected,actual,0.01);
    }
}