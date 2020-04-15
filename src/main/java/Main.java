public class Main {

    public static void main(String[] args) {
        TipCalculatorMenu tipCalculatorMenu = new TipCalculatorMenu();
        //tipCalculatorMenu.doDiag();
        Riddle myRiddle = new Riddle(1,"sequence of numbers ..");
        myRiddle.setMessage("What is the missing number: 1 1 2 3 5 _ 13 ");
        myRiddle.setSolution("8");
        try {
            boolean retVal = myRiddle.solveRiddle("9");
            System.out.println("You were " + retVal);
        } catch (AlreadySolvedException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
