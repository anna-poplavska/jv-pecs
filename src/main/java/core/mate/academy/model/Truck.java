package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String type;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
