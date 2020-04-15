import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/*
    private final double IDEALHEIGHT=15;
    private final double IDEALHEIGHTTOL=3;
    private final double IDEALWIDTH=35;
    private final double IDEALWIDTHTOL=3;
    private final int TOLFACTOR=7;
    private double idealHyp;
    getNumOfSteps(double totalHeight, double totalWidth)
 */
public class StairCalculatorTest {
    StairCalculator stairCalculator;
    double IDEALHEIGHT;
    double IDEALHEIGHTTOL;
    double IDEALWIDTH;
    double IDEALWIDTHTOL;
    int TOLFACTOR;
    double totalHeight;
    double totalWidth;


    @Before
    public void setUp() throws Exception {
        IDEALHEIGHT=15;
        IDEALHEIGHTTOL=5;
        IDEALWIDTH=35;
        IDEALWIDTHTOL=3;
        TOLFACTOR=3;
        totalHeight=250;
        totalWidth=320;
        stairCalculator = new StairCalculator(TOLFACTOR);
    }

    @Test
    public void getNumOfSteps() {
        int actual = stairCalculator.getNumOfSteps(totalHeight,totalWidth);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNumOfStepsErr() {
        int actual = stairCalculator.getNumOfSteps(totalHeight,totalWidth);
    }
}