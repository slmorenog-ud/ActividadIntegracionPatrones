package Order;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;
import SendStrategy.SendStrategy;

public abstract class Order {
    private static final double TAX_RATE = 0.19;
    private static final double GLOBAL_DISCOUNT = 0.05;

    private String id;
    private String status;
    private SendStrategy sendStrategy;
    private List<Observer> observers;
    private double distance;
    private double weight;

    public Order(String id, double distance, double weight, SendStrategy sendStrategy) {
        this.id = id;
        this.status = "CREATED";
        this.distance = distance;
        this.weight = weight;
        this.sendStrategy = sendStrategy;
        this.observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getId() {
        return id;
    }

    public void setStrategy(SendStrategy strategy) {
        this.sendStrategy = strategy;
    }

    protected double getShippingCost() {
        return sendStrategy.calculateCost(distance, weight);
    }

    protected double applyTaxAndDiscount(double amount) {
        return amount * (1 + TAX_RATE) * (1 - GLOBAL_DISCOUNT);
    }

    public abstract double calculateTotalCost();
}
