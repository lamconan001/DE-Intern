package ObservePattern;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Concurrent weather display: " + temperature);
    }
}
