public class SystemSetting {
    private static SystemSetting instance;
    private double tax;
    private String currency;
    private double globalDiscount;

    private SystemSetting() {
        this.tax = 0.19;
        this.currency = "COP";
        this.globalDiscount = 0.05;
    }

    public static SystemSetting getInstance() {
        if (instance == null) {
            instance = new SystemSetting();
        }

        return instance;
    }

    public double getTax() {
        return tax;
    }

    public String getCurrency() {
        return currency;
    }

    public double getGlobalDiscount() {
        return globalDiscount;
    }
}
