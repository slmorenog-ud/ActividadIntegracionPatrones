package SendStrategy;

public class StandardSend implements SendStrategy {

    @Override
    public double calculateCost(double distance, double weight) {
        return 4500 + (distance * 900) + (weight * 500);
    }

}
