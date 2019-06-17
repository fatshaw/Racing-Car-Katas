package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlarm {

    @Test
    public void foo() {
        Alarm alarm = new Alarm();
        assertEquals(false, alarm.isAlarmOn());
    }

    @Test
    public void alarm_off_when_sensor_pressure_is_between_the_scope() {
        Alarm alarm = new Alarm(new MockSensor(10), 1, 100);
        alarm.check();
        assertEquals(false, alarm.isAlarmOn());
    }

    @Test
    public void alarm_on_when_sensor_pressure_is_not_between_the_scope() {
        Alarm alarm = new Alarm(new MockSensor(0), 1, 100);
        alarm.check();
        assertEquals(true, alarm.isAlarmOn());
    }
}
