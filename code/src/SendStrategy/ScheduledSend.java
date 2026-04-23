package SendStrategy;

public class ScheduledSend implements SendStrategy {

    @Override
    public double calculateCost(double distance, double weight) {
        return 3000 + (distance * 700) + (weight * 350);
    }

}
