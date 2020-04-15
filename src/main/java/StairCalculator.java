public class StairCalculator {
    private int numOfSteps;
    private double totalHeight;
    private double totalWidth;
    private double totalHyp;
    private double stepHeight;
    private double stepWidth;
    private double stepHyp;
    private final double IDEALHEIGHT=15;
    private final double IDEALHEIGHTTOL=3;
    private final double IDEALWIDTH=35;
    private final double IDEALWIDTHTOL=3;
    private int tolerance;
    private double idealHyp;

    public StairCalculator(int tolerance) {
        this.tolerance = tolerance;
    }


    public double getWithFromSteps(double totalHeight, int numOfSteps) throws IllegalArgumentException {
        double totalWidth = 0;
        // calc stepHeight
        stepHeight = totalHeight / IDEALHEIGHT;
        return totalWidth;
    }
    public int getNumOfSteps(double totalHeight, double totalWidth) throws IllegalArgumentException {
        int numOfSteps = 0;
        int tmpOfSteps = 0;
        double rest = 0;
        double tmpHeight = IDEALHEIGHT;
        double tmpWidth = IDEALWIDTH;
        double totalHyp = calcHyp(totalHeight,totalWidth);
        double idealHyp = calcHyp(tmpHeight,tmpWidth);
        double tmpRel = totalHyp/idealHyp;
        numOfSteps = (int) tmpRel;
        tmpOfSteps = numOfSteps;
        rest = totalHyp-numOfSteps*idealHyp;
        while(rest>IDEALHEIGHTTOL/tolerance) {
            idealHyp = calcHyp(tmpHeight,tmpWidth);
            tmpRel = totalHyp/idealHyp;
            numOfSteps = (int) tmpRel;
            rest = totalHyp-numOfSteps*idealHyp;
            tmpHeight= tmpHeight+IDEALHEIGHTTOL/tolerance;
        }
        if (numOfSteps != tmpOfSteps) {
            throw new IllegalArgumentException("Cannot calculate appropriate stair");
        }
        return numOfSteps;
    }
    public double calcHyp(double adjacent, double opposite) {
        double retVal = 0;
        retVal = Math.sqrt(Math.pow(adjacent,2)+Math.pow(opposite,2));
        return retVal;
    }
}
