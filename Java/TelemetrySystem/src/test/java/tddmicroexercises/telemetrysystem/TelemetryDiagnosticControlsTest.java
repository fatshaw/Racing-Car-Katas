package tddmicroexercises.telemetrysystem;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TelemetryDiagnosticControlsTest {

    @Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response() throws Exception {
        ITelemetryClient client = mock(ITelemetryClient.class);
        when(client.receive()).thenReturn("RECEIVE");
        when(client.getOnlineStatus()).thenReturn(true);
        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls(client);

        telemetryDiagnosticControls.checkTransmission();

        verify(client, times(1)).receive();

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(client).send(captor.capture());
        assertEquals(TelemetryClient.DIAGNOSTIC_MESSAGE, captor.getValue());

    }

}
