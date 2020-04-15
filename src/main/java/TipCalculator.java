public class TipCalculator {
    private static TipCalculator tipCalculatorInstance = null;

    private TipCalculator() {
    }

    public static TipCalculator getInstance() {
        if (tipCalculatorInstance == null) {
            tipCalculatorInstance = new TipCalculator();
            return tipCalculatorInstance;
        } else {
            return tipCalculatorInstance;
        }
    }

    public double returnTips(String country, String service, double amount) {
        double tips = 0;
        switch (country) {
            case "Denmark":
                switch (service) {
                    case "Restaurent": tips = amount * 0.10;break;
                    case "GasStation": tips = amount * 0;break;
                    case "Taxi": tips = amount * 0.05;break;
                    default:tips = 0;
                }
                break;
            case "Sweeden":
                switch (service) {
                    case "Restaurent": tips = amount * 0.20;break;
                    case "GasStation": tips = amount * 0;break;
                    case "Taxi": tips = amount * 0;break;
                    default:tips = 0;
                }
                break;
            case "Norway":
                switch (service) {
                    case "Restaurent": tips = amount * 0.20;break;
                    case "GasStation": tips = amount * 0;break;
                    case "Taxi": tips = amount * 0;break;
                    default:tips = 0;
                }
                break;
            case "USA":
                switch (service) {
                    case "Restaurent": tips = amount * 0.20;break;
                    case "GasStation": tips = amount * 0.10;break;
                    case "Taxi": tips = amount * 0.2;break;
                    default:tips = 0;
                }
                break;
            default: tips=amount*0.05;
        }
        return tips;
    }
}
