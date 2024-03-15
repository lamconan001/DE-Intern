package ObservePattern;

public class StatisticsDisplay implements Observer {
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Statistic display: " + temperature);
    }
}
