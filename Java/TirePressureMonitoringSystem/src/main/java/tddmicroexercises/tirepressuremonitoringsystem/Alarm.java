package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
    private static final double LowPressureThreshold = 17;
    private static final double HighPressureThreshold = 21;

    ISensor sensor;
    double lowPressureThreshold;
    double highPressureThreshold;
    boolean alarmOn = false;

    public Alarm(ISensor sensor, double lowPressureThreshold, double highPressureThreshold) {
        this.sensor = sensor;
        this.lowPressureThreshold = lowPressureThreshold;
        this.highPressureThreshold = highPressureThreshold;
    }

    public Alarm() {
        this(new Sensor(), LowPressureThreshold, HighPressureThreshold);
    }

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < lowPressureThreshold || highPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}
