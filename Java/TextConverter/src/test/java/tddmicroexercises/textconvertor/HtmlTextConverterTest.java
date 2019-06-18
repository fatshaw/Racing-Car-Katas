package tddmicroexercises.textconvertor;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HtmlTextConverterTest {
    @Test
    public void foo() throws IOException {
        IReader reader = mock(IReader.class);
        when(reader.readLine()).thenReturn("abcd&1234").thenReturn(null);
        HtmlTextConverter converter = new HtmlTextConverter(reader);
        assertEquals("abcd&amp;1234<br />", converter.convertToHtml());
    }
}
