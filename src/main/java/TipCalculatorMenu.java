import java.util.Scanner;

public class TipCalculatorMenu {

    public void doDiag() {
        Scanner ms = new Scanner(System.in);
        TipCalculator tipCalculator = TipCalculator.getInstance();
        String country = "";
        String service = "";
        double amount = 0;
        double tips = 0;
        int choice = 1;
        while (choice != 4) {
            showMenu();
            //choice = ms.nextInt();
            //ms.nextLine();
            //switch (choice) {
             //   case 1:
                    System.out.println("Country:");
                    country=ms.nextLine();
              //      break;
                //case 2:
                    System.out.println("Service:");
                    service=ms.nextLine();
                 //   break;
                //case 3:
                    System.out.println("Amount:");
                    amount=ms.nextDouble();
                    //break;
                //case 4:
                    System.out.println("Caclulate tips ...");
                    tips=tipCalculator.returnTips(country,service,amount);
                    System.out.println("You should tip " + tips);
                 //   break;
                //default:showMenu();
            choice=4;
            }
        //}
    }
    public void showMenu() {
        System.out.println("Indtast valg:");
        System.out.println("1. Vælg land");
        System.out.println("2. Vælg service");
        System.out.println("3. Indtast beløb");
        System.out.println("4. Beregn drikkepenge");
    }
}
