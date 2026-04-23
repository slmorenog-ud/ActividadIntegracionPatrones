package Order;

import SendStrategy.SendStrategy;

public class NationalOrder extends Order {
    private String region;

    public NationalOrder(String id, String region, double distance, double weight, SendStrategy sendStrategy) {
        super(id, distance, weight, sendStrategy);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public double calculateTotalCost() {
        return applyTaxAndDiscount(getShippingCost());
    }
}
