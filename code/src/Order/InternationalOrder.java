package Order;

import SendStrategy.SendStrategy;

public class InternationalOrder extends Order {
    private String destinationCountry;
    private double customsFee;

    public InternationalOrder(
            String id,
            String destinationCountry,
            double customsFee,
            double distance,
            double weight,
            SendStrategy sendStrategy) {
        super(id, distance, weight, sendStrategy);
        this.destinationCountry = destinationCountry;
        this.customsFee = customsFee;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    @Override
    public double calculateTotalCost() {
        return applyTaxAndDiscount(getShippingCost() + customsFee);
    }
}
