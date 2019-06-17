package tddmicroexercises.tirepressuremonitoringsystem;

public class MockSensor implements ISensor {

    double pressure;

    public MockSensor(double pressure) {
        this.pressure = pressure;
    }

    public double popNextPressurePsiValue() {
        return pressure;
    }
}
